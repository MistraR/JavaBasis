package mistra.com.annotation;

import java.lang.annotation.*;

/**
 * @author Mistra-WangRui
 * @create 2018/4/2 10:31
 * @desc 无
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MistraAnnotation {
    public int id() default -1;
    public String messagr() default "Mistra";
}
