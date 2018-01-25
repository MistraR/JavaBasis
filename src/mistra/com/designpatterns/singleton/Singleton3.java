package mistra.com.designpatterns.singleton;

/**
 * Created by Mistra-WR on 2018/1/18/018.
 */
public class Singleton3 {
    private static Singleton3 instance=null;
    private Singleton3() {};

    public static Singleton3 getInstance(){
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
