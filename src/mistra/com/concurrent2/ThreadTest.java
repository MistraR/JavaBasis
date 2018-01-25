package mistra.com.concurrent2;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("主程序运行开始！ 主线程名称："+Thread.currentThread().getName()+",线程ID："+Thread.currentThread().getId());
        ThreadSon tr1=new ThreadSon("A");
        ThreadSon tr2=new ThreadSon("B");
        tr1.start();
        tr2.start();
        System.out.println("主程序运行结束！");
    }
}
class ThreadSon extends Thread{
    private String name;
    public ThreadSon(String name) {
        this.name=name;
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(name + "运行:" + i + "; ");
        }
    }
}

