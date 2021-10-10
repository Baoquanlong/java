package com.baoquanlong.java.IO;

import java.io.*;

/*
    使用FileReader和FileWriter拷贝一个文件。
 */
public class streamtest02 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader("D:\\java\\java\\java\\demo23\\src\\com\\baoquanlong\\java\\IO\\FileInputStreamTest01.java");
            fw = new FileWriter("D:\\java\\java\\IOtestFIle\\3.java");

            //fr读取10个字符，fw写入相应的字符
            char[] chars = new char[10];
            int readCount;
            while ((readCount= fr.read(chars)) != -1){
                fw.write(chars);
                fw.flush();
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
