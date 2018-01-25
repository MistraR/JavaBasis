package mistra.com.StringTest.parameterTransfer;

/**
 * Created by Mistra
 * Date: 2018/1/25/025
 * Time: 23:10
 */

/**
 * 基本数据类型传参测试
 */
public class ParameterTransferTest1 {
    public static void main(String[] args) {
        int a = 3;
        change(a);
        System.out.println(a);
    }
    public static void change(int i) {
        i =10;
    }
}
