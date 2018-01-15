package mistra.com.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Mistra
 * Date: 2018/1/15/015
 * Time: 22:43
 */
public class ExecutorBasicThreads {
    public static void main(String [] args){
        ExecutorService exe = Executors.newCachedThreadPool();//P
        // 656
        for (int i =0;i < 5;i++){
            exe.execute(new LiftOff());
        }
        exe.shutdown();
    }
}
