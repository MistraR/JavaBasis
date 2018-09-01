package mistra.com.jdk8.interfaceTest;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/8/9/009
 * Describe: jdk1.8 在接口中新增了default方法和static方法，这两种方法可以有方法体,都可以有多个
 * 接口里的静态方法，即static修饰的有方法体的方法不会被继承或者实现，但是静态变量会被继承
 */
public interface InterfaceTest {

    static int a = 5;

    int sub(int a, int b);

    default void defaultMethod() {
        System.out.println("InterfaceTest default 方法1");
    }

    default void defaultMethod2() {
        System.out.println("InterfaceTest default 方法2");
    }

    static void staticMethod() {
        System.out.println("InterfaceTest static 方法1");
    }

    static void staticMethod2(){
        System.out.println("InterfaceTest static 方法2");
    }
}
