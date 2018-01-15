package mistra.com.concurrent;

/**
 * Created by Mistra
 * Date: 2018/1/15/015
 * Time: 22:15
 */
public class LiftOff implements Runnable{
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff(){}
    public LiftOff(int countDown){
        this.countDown = countDown;
    }
    private String status(){
        return "#" + id + "(" +(countDown > 0 ? countDown : "Liftoff!") + "),";
    }

    @Override
    public void run() {
        while (countDown-->0){
            System.out.print(status());
            Thread.yield();
        }
    }
}
