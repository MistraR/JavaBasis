package mistra.com.concurrent2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class ThreadTest3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("----程序开始运行----");
        Date date1 = new Date();
        int taskSize = 5;
        ExecutorService pool = Executors.newFixedThreadPool(taskSize);// 创建一个线程池
        List<Future> list = new ArrayList<Future>();
        for (int i = 0; i < taskSize; i++) { // 创建多个有返回值的任务
            Callable c = new MyCallable(i + " ");
            Future f = pool.submit(c);// 执行任务并获取Future对象
            list.add(f);
        }
        pool.shutdown();// 关闭线程池
        for (Future f : list) {// 遍历获取所有并发任务的运行结果
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
