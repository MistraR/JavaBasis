package mistra.com.threadcore.stopthread.volatiledemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/12/20 下午2:36
 * @ Description: 演示用volatile的局限part2 陷入阻塞时，volatile是无法线程的 此例中，生产者的生产速度很快，消费者消费速度慢，所以阻塞队列满了以后，生产者会阻塞，
 * 等待消费者进一步消费
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class WrongWayVolatileCantStop {

    public static void main(String[] args) throws InterruptedException {
//        ArrayBlockingQueue storage = new ArrayBlockingQueue();
        LinkedBlockingQueue storage = new LinkedBlockingQueue();

        Producer producer = new Producer(storage);
        Thread producerThread = new Thread(producer);
        producerThread.start();
        Thread.sleep(10);

        Consumer consumer = new Consumer(storage);
        while (consumer.needMoreNums()) {
            System.out.println(consumer.storage.take() + "被消费了");
            Thread.sleep(1);
        }
        System.out.println("消费者不需要更多数据了。");

        //一旦消费不需要更多数据了，我们应该让生产者也停下来，但是实际情况
        producer.canceled = true;
        System.out.println(producer.canceled);
    }
}

class Producer implements Runnable {

    public volatile boolean canceled = false;

    BlockingQueue storage;

    public Producer(BlockingQueue storage) {
        this.storage = storage;
    }


    @Override
    public void run() {
        int num = 0;
        try {
            while (!canceled && num <= 100000) {
                if (num % 100 == 0) {
                    // 如果使用的阻塞队列的话，生产者会阻塞在这里，没有人来唤醒它,导致程序无法停止。如果用的非阻塞队列就可以正常中断线程。
                    storage.put(num);
                    System.out.println(num + "是100的倍数,被放到仓库中了。");
                }
                num++;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("生产者结束运行");
        }
    }
}

class Consumer {

    BlockingQueue storage;

    public Consumer(BlockingQueue storage) {
        this.storage = storage;
    }

    public boolean needMoreNums() {
        if (Math.random() > 0.95) {
            return false;
        }
        return true;
    }
}