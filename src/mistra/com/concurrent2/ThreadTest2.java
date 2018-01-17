package mistra.com.concurrent2;

/**
 * Created by Administrator on 2018/1/17/017.
 */
public class ThreadTest2{
    public static void main(String[] args) {
        new Thread(new ThreadSon2("A")).start();
        new Thread(new ThreadSon2("B")).start();
    }
}

class ThreadSon2 implements Runnable{
    private String name;
    public ThreadSon2(String name) {
        this.name=name;
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(name + "运行:" + i + "; ");
        }
    }
}
