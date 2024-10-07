package SecondExample;

import java.io.IOException;
import java.io.*;
//java -cp classes day04.Fileupload localhost:3000 files/polarbear.pdf
public class FileUpload {
    public static void main(String[] args) throws IOException{

        String[] terms = args[]
        File f = new File(args[1]);
        if(!f.exists() || !f.isFile()){
            System.out.println("That is not a file");
            System.exit(-1);

        }
        String fileName = f.getName();
        long fileSize = f.length();
        System.out.printf("Upload file %s of size %d bytes \n",fileName,fileSize);


        byte[] buffer = new byte[4*1024];
        

    }
}
