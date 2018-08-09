package mistra.com.jdk8;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/8/9/009
 * Describe:  只能实现defaultMethod方法   static方法不能
 */
public class InterfaceTestMain {

    public static void main(String[] args) {
        InterfaceTestImpl interfaceTest = new InterfaceTestImpl();
        interfaceTest.sub(4, 5);
        interfaceTest.defaultMethod();
        interfaceTest.defaultMethod2();
    }
}
