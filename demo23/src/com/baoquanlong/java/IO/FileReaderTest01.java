package com.baoquanlong.java.IO;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
    文件字符输入流，只能读取普通文本，读取文本内容时比较方便。
     */
public class FileReaderTest01 {
    public static void main(String[] args) {
        FileReader fr = null;

        try {
            fr = new FileReader("D:\\java\\java\\IOtestFIle\\1.txt");
            char[] chars= new char[10];
            int readCount = fr.read(chars);
            System.out.println(readCount);

            for (char cr : chars){
                System.out.print(cr);
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
        }
    }
}
