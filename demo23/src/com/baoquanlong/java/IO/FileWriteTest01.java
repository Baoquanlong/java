package com.baoquanlong.java.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileWriteTest01 {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("D:\\java\\java\\IOtestFIle\\2.txt",true);

            fw.write("wtf?");
            fw.write(new char[]{
                    'h','i','j','k'
            });

            Writer wi = fw.append('\n');
            fw.flush();
            wi.append('w');
            wi.append('\n');
            wi.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
