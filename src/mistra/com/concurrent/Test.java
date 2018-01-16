package mistra.com.concurrent;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class Test {
    public static void main(String [] args){
        System.out.println(Thread.currentThread().getName() + "---" + Thread.currentThread().getId());//主线程
        MyThread thread1 = new MyThread("thread1");
        thread1.start();
        MyThread thread2 = new MyThread("thread2");
        thread2.run();
        /*
        执行结果：
        main---1
        name:thread2-----子线程ID:1
        name:thread1-----子线程ID:10
        thread1和thread2的线程ID不同，thread2和主线程ID相同，说明通过run方法调用并不会创建新的线程，
        而是在主线程中直接运行run方法，跟普通的方法调用没有任何区别；
        虽然thread1的start方法调用在thread2的run方法前面调用，但是先输出的是thread2的run方法调用的相关信息，
        说明新线程创建的过程不会阻塞主线程的后续执行。
         */
    }

}
