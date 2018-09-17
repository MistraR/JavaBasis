package mistra.com.clone;

/**
 * @Author: WangRui
 * @Date: 2018-09-17
 * Time: 上午10:36
 * Description: 深度clone，包括基本数据类型和引用类型(对象的引用)都会克拷贝，新对象变量指向的地址改变不会影响老对象的变量指向的地址
 */
public class DeepCloneTest {

    public static void main(String[] a) {
        DeepCloneB b1 = new DeepCloneB();
        b1.aInt = 11;
        System.out.println("before clone,b1.aInt = " + b1.aInt);
        System.out.println("before clone,b1.unCA = " + b1.unCA);

        DeepCloneB b2 = (DeepCloneB) b1.clone();
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
