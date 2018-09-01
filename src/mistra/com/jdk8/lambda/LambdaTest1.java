package mistra.com.jdk8.lambda;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @Author: Mistra.WangRui
 * @Time 2018-09-01 15:04
 * @Description: Lambda表达式的常见用法
 **/
public class LambdaTest1 {

    public static void main(String[] args) {
        /**
         * 1.遍历集合
         */
        String[] strings = {"A", "B", "C", "D", "E"};
        List<String> names = Arrays.asList(strings);
        //"->"符号的前面就是参数，后面就是代码块，没有参数时前面就写空括号()，
        // 代码块跟普通方法的代码块一样可以用返回或者异常来退出
        names.forEach(name -> {
            System.out.println(name);
        });
        //Java8双冒号操作符
        names.forEach(System.out::println);

        /**
         * 2.代替匿名内部类
         */
        JButton button = new JButton();
        //old
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("button clicked");
            }
        });
        //lambda  只有一个参数时可以省略括号，代码块只有一行时可以不写大括号{}
        button.addActionListener(e -> System.out.println("button clicked"));
        //old
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread1");
            }
        });
        thread1.start();
        //lambda  没有参数，所以是空括号()
        Thread thread2 = new Thread(() -> {
            System.out.println("thread2");
        });
        thread2.start();

        Runnable runnable1 = () -> {
            System.out.println("runnable1");
        };
        runnable1.run();

        /**
         * 3.创建函数 变量add不是两个数字之和，而是将两个数字相加的那行代码
         */
        BinaryOperator<Long> add = (x, y) -> x + y + 1;
        Long result = add.apply(5l,5l);
        System.out.println(result);//result=11

        String name = "Mistra";
        //name = "A";
        Runnable runnable2 = () -> {
            System.out.println("runnable1" + name);
        };
        runnable1.run();
    }

}
