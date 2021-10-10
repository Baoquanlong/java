package com.baoquanlong.java.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


/*
    拷贝一个文件：使用FileInputStream和FileOutputStream类来实现以字节形式：byte[]数组形式。
 */
public class StreamTest01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            fis = new FileInputStream("D:\\java\\java\\IOtestFIle\\2.txt");
            fos = new FileOutputStream("D:\\java\\java\\IOtestFIle\\3.txt");

            //读取1M的数据，然后写入到文件夹中，再读取
            int dataCount = 1024*1024;
            byte[] b = new byte[dataCount];
            int count;
            while ((count = fis.read(b)) != -1){
                    fos.write(b,0,count);
                    fos.flush();
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

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
