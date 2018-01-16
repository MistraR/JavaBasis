package mistra.com.concurrent;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Administrator on 2018/1/16/016.
 */
/**
    有返回值的线程测试
    可返回值的任务必须实现Callable接口，类似的，无返回值的任务必须Runnable接口。执行Callable任务后，可以获取一个Future的对象，
    在该对象上调用get就可以获取到Callable任务返回的Object了，再结合线程池接口ExecutorService就可以实现传说中有返回结果的多线程了
 */
public class Test2 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("----程序开始运行----");
        Date date1 = new Date();
        int taskSize = 5;
        // 创建一个线程池，Executors类，提供了一系列工厂方法用于创先线程池，返回的线程池都实现了ExecutorService接口。
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);//newFixedThreadPool:创建固定数目线程的线程池
        /**
public static ExecutorService newCachedThreadPool()   >>>   创建一个可缓存的线程池，调用execute 将重用以前构造的线程（如果线程可用）。
    如果现有线程没有可用的，则创建一个新线程并添加到池中。终止并从缓存中移除那些已有 60 秒钟未被使用的线程。
public static ExecutorService newSingleThreadExecutor()   >>>  创建一个单线程化的Executor。
public static ScheduledExecutorService newScheduledThreadPool(int corePoolSize)   >>>  创建一个支持定时及周期性的任务执行的线程池，多数情况下可用来替代Timer类。
ExecutoreService提供了submit()方法，传递一个Callable，或Runnable，返回Future。如果Executor后台线程池还没有完成Callable的计算，这时调用返回Future对象的get()方法，
    会阻塞直到计算完成。
         */
        List<Future> list = new ArrayList<Future>();//接收返回值的集合
        for (int i = 0; i < taskSize; i++) {// 创建多个有返回值的任务
            Callable c = new MyCallable(i + " ");
            Future f = pool.submit(c);// 执行任务并获取Future对象
            // System.out.println(">>>" + f.get().toString());
            list.add(f);
        }
        pool.shutdown();// 关闭线程池
        for (Future f : list) {
            System.out.println(">>>" + f.get().toString());// 从Future对象上获取任务的返回值，并输出到控制台
        }
        Date date2 = new Date();
        System.out.println("----程序结束运行----，程序运行时间【" + (date2.getTime() - date1.getTime()) + "毫秒】");
    }
}

class MyCallable implements Callable<Object> {
    private String taskNum;
    MyCallable(String taskNum) {
        this.taskNum = taskNum;
    }

    public Object call() throws Exception {
        System.out.println(">>>" + taskNum + "任务启动");
        Date dateTmp1 = new Date();
        Thread.sleep(1000);
        Date dateTmp2 = new Date();
        long time = dateTmp2.getTime() - dateTmp1.getTime();
        System.out.println(">>>" + taskNum + "任务终止");
        return taskNum + "任务返回运行结果,当前任务时间【" + time + "毫秒】";
    }
}
