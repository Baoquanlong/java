package com.baoquanlong.java.IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest01 {
    public static void main(String[] args) {
        FileOutputStream   fos = null;
        try {
            fos = new FileOutputStream("D:\\java\\java\\IOtestFIle\\2.txt",true);

            byte[] writeData = {
                    'a','b','c',' ', 'f','z'
            };

            String tem = "what the fuck?\n";
//            writeData = tem.getBytes();
            String tems = null;
            writeData = tem.getBytes("UTF-8");
            long i1 = 10000;
            while (i1<1000000000){
                fos.write(writeData);
                //write之后要flush()刷新；
                fos.flush();
                i1++;
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
