package mistra.com.StringTest;

/**
 * Created by Mistra-WR on 2018/1/22/022.
 */
public class Test1 {
    public static void main(String [] args){
        //16
        System.out.println(2<<3);
        System.out.print(2>>3);
        String str1 = "哈哈哈|嘻嘻嘻";
        System.out.println(str1.length());
        System.out.println(str1.indexOf("|"));
        System.out.println(str1.substring(0,str1.indexOf("|")));
        System.out.println(str1.substring(str1.indexOf("|")+1));
    }
}
