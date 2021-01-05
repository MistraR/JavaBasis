package mistra.com.threadcore.threadobjectclasscommonmethods;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/12/26 下午4:24
 * @ Description: 通过讲解join原理，分析出join的代替写法
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class JoinPrinciple {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "执行完毕");
            }
        });

        thread.start();
        System.out.println("开始等待子线程运行完毕");
        thread.join();
//        synchronized (thread) {
//            thread.wait();
//        }
        System.out.println("所有子线程执行完毕");
    }
}
