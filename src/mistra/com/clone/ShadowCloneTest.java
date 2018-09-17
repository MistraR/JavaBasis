package mistra.com.clone;

/**
 * @Author: WangRui
 * @Date: 2018-09-17
 * Time: 上午10:40
 * Description:影子克隆，clone时新旧对象的引用类型变量都是指向同一个地址，任意一个改变，另一个也会受影响
 */
public class ShadowCloneTest {

    public static void main(String[] a) {
        ShadowCloneB b1 = new ShadowCloneB();
        b1.aInt = 11;
        System.out.println("before clone,b1.aInt = " + b1.aInt);
        System.out.println("before clone,b1.unCA = " + b1.unCA);

        ShadowCloneB b2 = (ShadowCloneB) b1.clone();
        b2.aInt = 22;
        b2.unCA.doublevalue();
        System.out.println("=================================");
        System.out.println("after clone,b1.aInt = " + b1.aInt);
        System.out.println("after clone,b1.unCA = " + b1.unCA);
        System.out.println("=================================");
        System.out.println("after clone,b2.aInt = " + b2.aInt);
        System.out.println("after clone,b2.unCA = " + b2.unCA);
    }
}
