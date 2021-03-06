package mistra.com.threadcore.stopthread;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/12/20 下午2:32
 * @ Description: 注意Thread.interrupted()方法的目标对象是“当前线程”，而不管本方法来自于哪个对象
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class RightWayInterrupted {
    public static void main(String[] args) throws InterruptedException {

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                for (; ; ) {
                }
            }
        });

        // 启动线程
        threadOne.start();
        //设置中断标志
        threadOne.interrupt();
        //获取中断标志 isInterrupted返回该实例线程的中断状态，并不会清楚中断状态
        System.out.println("isInterrupted: " + threadOne.isInterrupted());
        //获取中断标志并重置   静态方法，返回main线程的中断状态  true
        System.out.println("isInterrupted: " + threadOne.interrupted());
        //获取中断标志并重直  同上，静态方法，返回main线程的中断状态  true
        System.out.println("isInterrupted: " + Thread.interrupted());
        //获取中断标志 isInterrupted返回该实例线程的中断状态，并不会清楚中断状态
        System.out.println("isInterrupted: " + threadOne.isInterrupted());
        threadOne.join();
        System.out.println("Main thread is over.");
    }
}
