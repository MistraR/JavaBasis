package mistra.com.basicDataType;

/**
 * Author: RoronoaZoro丶WangRui
 * Time: 2018/8/10/010
 * Describe:
 * Number类是java.lang包下的一个抽象类，提供了将包装类型拆箱成基本类型的方法，所有基本类型的包装类型都继承了该抽象类，并且是final声明不可继承改变
 */
public class BasicDataType {

    public static void main(String[] q){

        Number number1 = 3.55;
        long long1 = number1.longValue();
        System.out.println(long1);
    }
}
