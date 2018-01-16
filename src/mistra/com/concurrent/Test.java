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
        /**
        执行结果：
        main---1
        name:thread2-----子线程ID:1
        name:thread1-----子线程ID:10
        thread1和thread2的线程ID不同，thread2和主线程ID相同，说明通过run方法调用并不会创建新的线程，
        而是在主线程中直接运行run方法，跟普通的方法调用没有任何区别；
        虽然thread1的start方法调用在thread2的run方法前面调用，但是先输出的是thread2的run方法调用的相关信息，
        说明新线程创建的过程不会阻塞主线程的后续执行。

        start()用来启动一个线程，当调用start方法后，系统才会开启一个新的线程来执行用户定义的子任务，在这个过程中，会为相应的线程分配需要的资源。
        run()方法是不需要用户来调用的，当通过start方法启动一个线程之后，当线程获得了CPU执行时间，便进入run方法体去执行具体的任务。
        注意，继承Thread类必须重写run方法，在run方法中定义具体要执行的任务。
        getId()的作用是取得线程的唯一标识
        isAlive()的功能是判断当前线程是否处于活动状态,活动状态就是线程已经启动且尚未终止。线程处于正在运行或准备开始运行的状态，就认为线程是“存活”的。
         getName和setName             用来得到或者设置线程名称。
         getPriority和setPriority     用来获取和设置线程优先级。
         setDaemon和isDaemon          用来设置线程是否成为守护线程和判断线程是否是守护线程。
         守护线程依赖于创建它的线程，而用户线程则不依赖。举个简单的例子：如果在main线程中创建了一个守护线程，当main方法运行完毕之后，守护线程也会随着消亡
         。而用户线程则不会，用户线程会一直运行直到其运行完毕。在JVM中，像垃圾收集器线程就是守护线程。

         停止线程-----
         停止线程是在多线程开发时很重要的技术点，掌握此技术可以对线程的停止进行有效的处理。
         停止一个线程可以使用Thread.stop()方法，但最好不用它。该方法是不安全的，已被弃用。
         在Java中有以下3种方法可以终止正在运行的线程：
         使用退出标志，使线程正常退出，也就是当run方法完成后线程终止
         使用stop方法强行终止线程，但是不推荐使用这个方法，因为stop和suspend及resume一样，都是作废过期的方法，使用他们可能产生不可预料的结果。
         使用interrupt方法中断线程，但这个不会终止一个正在运行的线程，还需要加入一个判断才可以完成线程的停止

         暂停线程 ：interrupt()方法

         线程的优先级：
         在操作系统中，线程可以划分优先级，优先级较高的线程得到的CPU资源较多，也就是CPU优先执行优先级较高的线程对象中的任务。
         设置线程优先级有助于帮“线程规划器”确定在下一次选择哪一个线程来优先执行。
         设置线程的优先级使用setPriority()方法
         在Java中，线程的优先级分为1~10这10个等级，如果小于1或大于10，则JDK抛出异常throw new IllegalArgumentException()。
         JDK中使用3个常量来预置定义优先级的值，代码如下：
             public final static int MIN_PRIORITY = 1;
             public final static int NORM_PRIORITY = 5;
             public final static int MAX_PRIORITY = 10;
         线程优先级特性：
         继承性：比如A线程启动B线程，则B线程的优先级与A是一样的。
         规则性：高优先级的线程总是大部分先执行完，但不代表高优先级线程全部先执行完。
         随机性：优先级较高的线程不一定每一次都先执行完
         */
    }

}
