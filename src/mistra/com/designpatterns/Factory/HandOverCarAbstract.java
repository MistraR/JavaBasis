package mistra.com.designpatterns.Factory;

/**
 * Created by Mistra-WR on 2018/1/21/021.
 */
public abstract class HandOverCarAbstract {
    public abstract Car SalesManagerGetCar(String type);

    public Car GiveCar(String type){
        Car car = SalesManagerGetCar(type);
        car.speedUp();
        car.brake();
        return car;
    }
}
