package mistra.com.threadcore.uncaughtexception;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/12/27 上午11:21
 * @ Description: run方法中未捕获的异常会导致线程直接退出
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class RunException {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("===========");
                List<String> strings = new ArrayList<>();
                strings.add("222");
                try {
                    System.out.println(strings.get(3));
                } catch (Exception e) {

                }
                System.out.println("~~~~~~~~~~~~~~~");
            }
        });
        thread.start();
    }
}
