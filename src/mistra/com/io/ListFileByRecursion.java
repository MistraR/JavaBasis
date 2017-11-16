package mistra.com.io;

import java.io.File;

/**
 * Created by Mistra.WR on 2017/11/16/016.
 */
/*递归显示文件夹下所有文件*/
public class ListFileByRecursion {
    public static void main(String [] args){
        File f =new File("D:"+File.separator+"SSl证书");
        recursion(f);
    }

    public static void recursion(File f){
        if(f!=null){
            if(f.isDirectory()){
                File [] arr = f.listFiles();
                if(arr!=null){
                    for (int i = 0;i<arr.length;i++){
                        recursion(arr[i]);
                    }
                }
            }else System.out.println(f);
        }
    }
}
