package mistra.com.concurrent;

import java.io.IOException;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class Test3 {
    static private int i = 10;
    static private Object object = new Object();

    static class MyThread extends Thread{
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

    public static void main(String [] args) throws IOException {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();
    }

}
