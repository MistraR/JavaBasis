package mistra.com.StringTest;

/**
 * Created by Mistra-WR on 2018/1/21/021.
 */
public class DuiZhanTest {
    public static void main(String [] args){
        String s1 = new StringBuilder("go").append("od").toString();
        System.out.println(s1);
        System.out.println(s1.intern());
        System.out.println(s1.intern() == s1);
        String s2 = new StringBuilder("go").append("od").toString();
        System.out.println(s2);
        System.out.println(s2.intern());
        System.out.println(s2.intern() == s2);
    }
}
