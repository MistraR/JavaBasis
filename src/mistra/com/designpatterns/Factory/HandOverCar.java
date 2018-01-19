package mistra.com.designpatterns.Factory;

/**
 * Created by Mistra-WR on 2018/1/18/018.
 */

/**
 * 从仓库得到汽车
 */
public class HandOverCar {
    private SSSSFactroy sf;
    public HandOverCar(SSSSFactroy sf){
        this.sf = sf;
    }

    public Car GiveCar(String type){
        Car car = sf.SalesManagerGetCar(type);
        car.speedUp();
        car.brake();
        return car;
    }
}
