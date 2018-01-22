package mistra.com.util.io;

import java.io.File;

/**
 * Created by Mistra-WR on 2018/1/22/022.
 */

/**
 * 列出一个目录下所有的文件方法一
 */
public class listFile {
    public static void main(String[] args) {
        File f = new File("E:/QQ");
        for(File temp : f.listFiles()) {
            if(temp.isFile()) {
                System.out.println(temp.getName());
            }
        }
    }
}
