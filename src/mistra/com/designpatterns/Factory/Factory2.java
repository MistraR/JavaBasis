package mistra.com.designpatterns.Factory;

/**
 * Created by Mistra-WR on 2018/1/21/021.
 */
public class Factory2 extends HandOverCarAbstract{
    @Override
    public Car SalesManagerGetCar(String type) {
        Car car = null;
        switch (type){
            case "RS3": car = new AudiRS3();
            case "RS5": car = new AudiRS5();
            case "RS7": car = new AudiRS7();
            case "A7": car = new AudiA7();
            default:;
        }
        return car;
    }
}
