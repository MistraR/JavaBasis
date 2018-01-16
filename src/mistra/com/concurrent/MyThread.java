package mistra.com.concurrent;

/**
 * Created by Administrator on 2018/1/16/016.
 */
public class MyThread extends Thread{
    /**
        继承Thread类和实现Runnable接口都可以用来创建线程去执行子任务，具体选择哪一种方式要看自己的需求。直接继承Thread类的话，可能比实现Runnable接口看起来更加简洁，
        但是由于Java只允许单继承，所以如果自定义类需要继承其他类，则只能选择实现Runnable接口。
     */
    private String name;

    public MyThread(String name){
        this.name = name;
    }
    @Override
    public void run(){
        System.out.println("name:" + name + "-----子线程ID:" + Thread.currentThread().getId());
    }
}
