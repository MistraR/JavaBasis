package mistra.com.designpatterns.Factory;

/**
 * Created by Mistra-WR on 2018/1/18/018.
 */
public abstract class Car {
    protected String name;
    /**
     * 加速功能
     */
    public void speedUp()
    {
        System.out.println(name + "----加速----");
    }

    /**
     * 刹车功能
     */
    public void brake()
    {
        System.out.println(name + "----刹车----");
    }
}
