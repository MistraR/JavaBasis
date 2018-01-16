package mistra.com.concurrent;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class MyThread extends Thread{
    private String name;

    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println("name:" + name + "-----子线程ID:" + Thread.currentThread().getId());
    }
}
