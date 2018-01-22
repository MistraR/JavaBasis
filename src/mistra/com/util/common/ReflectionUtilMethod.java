package mistra.com.util.common;

/**
 * Created by Mistra-WR on 2018/1/22/022.
 */

import java.lang.reflect.Method;

/**
 * 通过反射调用对象的方法
 */
public class ReflectionUtilMethod {
    public static void main(String[] args) throws Exception {
        String str = "hello";
        Method m = str.getClass().getMethod("toUpperCase");
        System.out.println(m.invoke(str));  // HELLO
    }
}
