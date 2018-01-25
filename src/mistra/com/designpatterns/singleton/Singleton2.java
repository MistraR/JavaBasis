package mistra.com.designpatterns.singleton;

/**
 * Created by Mistra-WR on 2018/1/18/018.
 */
public class Singleton2 {
    private static Singleton2 singleton2 = null;
    private Singleton2(){}

    public static Singleton2 getInstance(){
        if(singleton2==null){
            singleton2 = new Singleton2();
        }
        return singleton2;
    }
}
