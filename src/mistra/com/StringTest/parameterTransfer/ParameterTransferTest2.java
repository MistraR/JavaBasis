package mistra.com.StringTest.parameterTransfer;

/**
 * Created by Mistra
 * Date: 2018/1/25/025
 * Time: 23:11
 */

/**
 * String传参测试
 */
public class ParameterTransferTest2 {
    public static void main(String [] args){
        String str = "a";
        change(str);
        System.out.println(str);
    }
    public static void change(String i) {
        i = "b";
    }
}
