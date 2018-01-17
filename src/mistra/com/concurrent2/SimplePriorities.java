package mistra.com.concurrent2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2018/1/16/016.
 */

/**
    线程优先级测试
 */
public class SimplePriorities implements Runnable{

    private int countDown = 5;
    private volatile double d;
    private int proitiy;
    public SimplePriorities(int proitiy){
        this.proitiy = proitiy;
    }
    public String toString(){//覆盖本类的toString方法，以便下面打印线程名称
        return Thread.currentThread() + ":" + countDown;
    }
    @Override
    public void run() {
        Thread.currentThread().setPriority(proitiy);//设置优先级
        while (true){
            for (int i = 1;i < 10000;i++){
                d +=(Math.PI + Math.E) / (double)i;
                if(i % 1000 == 0){
                    Thread.yield();
                }
            }
            System.out.println(this);
            if(--countDown == 0)return;
        }
    }

    public static void main(String [] args){
        ExecutorService exe = Executors.newCachedThreadPool();
        for (int i =1;i<5;i++){
            exe.execute(new SimplePriorities(Thread.MIN_PRIORITY));//为前5个线程设置最低优先级参数
        }
        exe.execute(new SimplePriorities(Thread.MAX_PRIORITY));//最后一个线程设置为最高优先级参数
        exe.shutdown();//shutdown的作用是防止新任务被提交给这个Executor
    }
}
