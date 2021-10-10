package com.baoquanlong.java;

public class TestIntegerToString {
    public static void main(String[] args) {
        Object[] obj = new String[10];
        obj[0] = "aaa";
        obj[1] = "bbb";
        obj[2] = "bcc";
        obj[3] = "ddd";
        obj[4] = "eee";
        obj[5] = "fff";
        obj[6] = "dsfda";

        for (Object ob : obj ){
            if (ob instanceof String){
                System.out.println(ob.toString());
            }
        }
    }
}
