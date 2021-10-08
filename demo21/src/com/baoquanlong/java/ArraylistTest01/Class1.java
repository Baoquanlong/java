package com.baoquanlong.java.ArraylistTest01;

public class Class1 {
    Object[] obj = new Object[10];


    public Object testSome(){
        for (int i = 0; i < obj.length; i++) {
            obj[i] = i;
        }
        int i = 3;
        int cursor=0;
        return obj[cursor = i];
    }
}
