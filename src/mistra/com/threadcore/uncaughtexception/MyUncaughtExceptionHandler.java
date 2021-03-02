package mistra.com.threadcore.uncaughtexception;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Mistra
 * @ Version: 1.0
 * @ Time: 2020/12/26 下午5:11
 * @ Description: UncaughtExceptionHandler
 * @ Copyright (c) Mistra,All Rights Reserved.
 * @ Github: https://github.com/MistraR
 * @ CSDN: https://blog.csdn.net/axela30w
 */
public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{

    private String name;

    public MyUncaughtExceptionHandler(String name) {
        this.name = name;
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        Logger logger = Logger.getAnonymousLogger();
        logger.log(Level.WARNING, "线程异常，终止啦" + t.getName());
        System.out.println(name + "捕获了异常" + t.getName() + "异常");
    }
}
