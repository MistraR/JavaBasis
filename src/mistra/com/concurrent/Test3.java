package mistra.com.concurrent;

import java.io.IOException;

/**
 * Created by Administrator on 2018/1/16/016.
 */
/**
    sleep()方法测试
    方法sleep()的作用是在指定的毫秒数内让当前“正在执行的线程”休眠（暂停执行）。这个“正在执行的线程”是指this.currentThread()返回的线程。
    sleep相当于让线程睡眠，交出CPU，让CPU去执行其他的任务。
    但是有一点要非常注意，sleep方法不会释放锁，也就是说如果当前线程持有对某个对象的锁，则即使调用sleep方法，其他线程也无法访问这个对象
 */
public class Test3 {
     private int i = 10;
     private Object object = new Object();

     class MyThread extends Thread{
        @Override
        public void run(){
            synchronized (object){
                i++;
                System.out.println("i:" + i);
                try {
                    System.out.println("线程"+Thread.currentThread().getName()+"进入睡眠状态");
                    Thread.currentThread().sleep(10000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
                System.out.println("线程"+Thread.currentThread().getName()+"睡眠结束");
                i++;
                System.out.println("i:"+i);
            }
        }
    }

    /**
        输出结果：i:11
                线程Thread-0进入睡眠状态
                线程Thread-0睡眠结束
                i:12
                i:13
                线程Thread-1进入睡眠状态
                线程Thread-1睡眠结束
                i:14
当Thread-0进入睡眠状态之后，Thread-1并没有去执行具体的任务。只有当Thread-0执行完之后，此时Thread-0释放了对象锁，Thread-1才开始执行。
注意，如果调用了sleep方法，必须捕获InterruptedException异常或者将该异常向上层抛出。当线程睡眠时间满后，不一定会立即得到执行，因为此时可能CPU正在执行其他的任务。
所以说调用sleep方法相当于让线程进入阻塞状态。
     */
    public static void main(String [] args) throws IOException {
        Test3 test = new Test3();
        MyThread thread1 = test.new MyThread();
        MyThread thread2 = test.new MyThread();
        thread1.start();
        thread2.start();
    }

}
