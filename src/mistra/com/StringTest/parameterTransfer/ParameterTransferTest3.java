package mistra.com.StringTest.parameterTransfer;

/**
 * Created by Mistra
 * Date: 2018/1/25/025
 * Time: 23:14
 */
public class ParameterTransferTest3 {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder("a");
        change(sb);
        System.out.println(sb);
    }
    public static void change(StringBuilder i) {
        i.append("b");
    }
}
