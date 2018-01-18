package mistra.com.designpatterns.singleton;

/**
 * Created by Mistra-WR on 2018/1/18/018.
 */
public class Singleton4 {
    private Singleton4() {};

    private static class SingletonHolder{
        private static Singleton4 instance=new Singleton4();
    }

    public static Singleton4 getInstance(){
        return SingletonHolder.instance;
    }
}
