package mistra.com.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Mistra.WR on 2017/11/18/018.
 */
public class RandomAccessFile {
    public static void main(String[] args) throws IOException {
        /*
         * 1:创建一个RandomAccessFile用于读取待复制的文件
         * 2:创建一个RandomAccessFile用于将原文件的中数据写入该文件
         * 3:循环从原文件中读取每一个字节并写入目标文件中
         * 4:关闭两个RandomAccessFile
         */
        long start = System.currentTimeMillis();
        RandomAccessFile src= new ;
        RandomAccessFile des= new RandomAccessFile("copy.jpg","rw");
        int d = -1;
        while( (d = src.read()) != -1 ){
            des.write(d);
        }
        System.out.println("拷贝完毕");
        src.close();
        des.close();
        long end = System.currentTimeMillis();
        System.out.println("耗时:"+(end-start)+"ms");
    }
}
