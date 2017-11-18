package mistra.com.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Mistra.WR on 2017/11/16/016.
 */
public class FileExample {
    public static void main(String [] args){
        //createFile();
        //deleteFile();
        //makeDir();
        listDirFile();
        //listFileDirFile();
    }

    /*创建一个文件*/
    public static void createFile(){
        File f = new File("D:"+File.separator+"codeTest"+File.separator+"test.txt");
        try {
            f.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    /*删除一个文件*/
    public static void deleteFile(){
        File f = new File("D:"+File.separator+"codeTest"+File.separator+"test.txt");
        if(f.exists())f.delete();
    }
    /*创建文件夹*/
    public static void makeDir(){
        File f = new File("D:"+File.separator+"codeTest"+File.separator+"test");
        if(!f.exists())f.mkdir();

    }
    /*使用list()列出全部文件夹和文件----Program Files*/
    public static void listDirFile(){
        File f=new File("d:"+File.separator);
        String[] str=f.list();
        for(String s:str){
            System.out.println(s);
        }
    }
    /*使用listFiles()列出全部文件夹和文件----d:\Program Files*/
    public static void listFileDirFile(){
        File f=new File("d:"+File.separator);
        File[] files=f.listFiles();
        for(File file:files){
            System.out.println(file);
        }
    }
    /*
     boolean mkdirs()  创建多级目录，创建此抽象路径名指定的目录，包括所有必需但不存在的父目录。
     boolean canExecute()  判断文件是否可以执行
　　 boolean canRead() 判断文件是否可读
　　 boolean canWrite() 判断文件是否可写
　　 boolean exist() 判断文件是否存在
　　 boolean isDirectory() 判断文件是目录
　　 boolean isFile() 判断是否是文件
　　 boolean canHidden() 判断文件是否可见
　　 boolean isAbsolute() 判断文件是否是绝对路劲 ，文件不存在也能判断
    String getName()
    String getPath()
    String getAbsolutePath()
    String getParent()//如果没有父目录返回null
    long lastModified()//获取最后一次修改的时间
    long length()
    boolean renameTo(File f)
    File[] liseRoots()//获取机器盘符
    String[] list()
    String[] list(FilenameFilter filter)
    * */
}
