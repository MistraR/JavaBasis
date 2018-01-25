package mistra.com.designpatterns.singleton;

/**
 * Created by Mistra-WR on 2018/1/18/018.
 */
public class Singleton {
    private static Singleton instance=new Singleton();
    private Singleton(){};
    public static Singleton getInstance(){
        return instance;
    }
}
