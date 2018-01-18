package mistra.com.designpatterns.Factory;

/**
 * Created by Mistra-WR on 2018/1/18/018.
 */

/**
 * 客户经理移交汽车给顾客的方法
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
