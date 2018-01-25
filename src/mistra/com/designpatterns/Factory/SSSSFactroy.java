package mistra.com.designpatterns.Factory;

/**
 * Created by Mistra-WR on 2018/1/18/018.
 */

/**
 * 4s店仓库管理员，给其汽车型号就能得到对应的汽车
 */
public class SSSSFactroy {
    public Car SalesManagerGetCar(String type){
        Car car = null;
        switch (type){
            case "RS3": car = new AudiRS3();
            case "RS5": car = new AudiRS5();
            case "RS7": car = new AudiRS7();
            default:;
        }
        return car;
    }
}
