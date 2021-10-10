package com.baoquanlong.java.IO;

import java.io.*;

/*
 自带缓冲区的字符流，不需要自定义缓冲数组。
 */
public class BufferedReaderTest01 {
    public static void main(String[] args) {
            BufferedReader br = null;
        try {
            Reader rd = new FileReader("D:\\java\\java\\java\\demo23\\src\\com\\baoquanlong\\java\\IO\\StreamTest01.java");
            br = new BufferedReader(rd);
            String fline;
            while ((fline = br.readLine()) != null){
                System.out.println(fline);
            }
//            System.out.println(fline);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
