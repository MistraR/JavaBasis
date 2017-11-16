package mistra.com.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by Mistra.WR on 2017/11/16/016.
 */
public class FileExample {
    public static void main(String [] args){
        createFile();
    }

    public static void createFile(){
        File f = new File("D:"+File.separator+"codeTest"+File.separator+"test.txt");
        try {
            f.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
