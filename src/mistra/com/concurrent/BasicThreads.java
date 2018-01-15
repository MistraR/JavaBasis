package mistra.com.concurrent;

/**
 * Created by Mistra
 * Date: 2018/1/15/015
 * Time: 22:29
 */
public class BasicThreads {
    public static void main(String [] args){
        Thread t = new Thread(new LiftOff());
        t.start();//线程初始化
        System.out.println("Waiting for LiftOff");//这一句的输出还在t线程之前，原因：此main()方法和LiftOff.run()是由不同的线程同时执行的
    }
}
