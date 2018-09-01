package mistra.com.jdk8.interfaceTest;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/8/9/009
 * Describe:  只能实现defaultMethod方法   static方法不能
 */
public class InterfaceTestMain {

    public static void main(String[] args) {
        InterfaceTestImpl interfaceTest = new InterfaceTestImpl();
        System.out.println(interfaceTest.sub(4, 5));
        /**
         * default方法可以被子接口继承亦可被其实现类所调用
         * default方法被继承时，可以被子接口覆写
         * 实现类可以直接调用接口中的default方法
         */
        interfaceTest.defaultMethod();
        interfaceTest.defaultMethod2();

        /**
         * 接口中的static方法不能被继承，也不能被实现类调用，只能被自身调用
         */
        InterfaceTest.staticMethod();
        InterfaceTest.staticMethod2();


        List<Integer> collection = new ArrayList<Integer>();
        collection.add(14);
        collection.add(5);
        collection.add(43);
        collection.add(89);
        collection.add(64);
        collection.add(112);
        collection.add(55);
        collection.add(55);
        collection.add(58);
        //去重
        collection.stream().distinct().forEach(System.out::println);
        //过滤
        Long count =collection.stream().filter(num -> num!=null).
                filter(num -> num.intValue()>50).count();
    }
}
