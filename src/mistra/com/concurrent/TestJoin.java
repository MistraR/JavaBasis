package mistra.com.concurrent;

/**
 * Created by Administrator on 2018/1/16/016.
 */

/**
 * join()方法测试
 * 在很多情况下，主线程创建并启动了线程，如果子线程中要进行大量耗时运算，主线程往往将早于子线程结束之前结束。
 * 这时，如果主线程想等待子线程执行完成之后再结束，比如子线程处理一个数据，主线程要取得这个数据中的值，就要用到join()方法了。方法join()的作用是等待线程对象销毁。
 */
public class TestJoin extends Thread{
    public TestJoin(String name) {
        super(name);
    }
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(getName() + "  " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        // 启动子进程
        new TestJoin("new thread").start();
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                TestJoin th = new TestJoin("joined thread");
                th.start();
                th.join();//main主线程等待joined thread线程先执行完了才技术执行的。尝试把这行注释掉看运行结果
            }
            System.out.println(Thread.currentThread().getName() + "  " + i);
        }
    }
}
