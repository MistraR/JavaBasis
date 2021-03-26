package mistra.com.designpatterns.produceconsume;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2021/3/26 下午8:44
 * @ Description: Condition实现生产者消费者模式
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class ProducerConsumer {

    private static int queueSize = 10;
    private static BlockingQueue queue = new LinkedBlockingQueue<>();
    private static ReentrantLock reentrantLock = new ReentrantLock();
    private static Condition empty = reentrantLock.newCondition();
    private static Condition full = reentrantLock.newCondition();

    public static void main(String[] args) {
        new Thread(new Producer()).start();
        new Thread(new Consumer()).start();
    }

    static class Producer implements Runnable {

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            while (true) {
                reentrantLock.lock();
                try {
                    if (queue.size() >= queueSize) {
                        System.out.println("队列满了，停止生产");
                        full.await();
                    }
                    queue.offer(1);
                    empty.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    static class Consumer implements Runnable {

        @Override
        public void run() {
            produce();
        }

        private void produce() {
            while (true) {
                reentrantLock.lock();
                try {
                    if (queue.size() == 0) {
                        System.out.println("队列中没有数据，停止消费");
                        empty.await();
                    }
                    System.out.println("消费1个元素");
                    queue.poll();
                    full.signalAll();
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }
}
