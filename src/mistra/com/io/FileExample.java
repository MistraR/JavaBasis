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
}
