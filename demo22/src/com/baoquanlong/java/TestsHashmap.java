package com.baoquanlong.java;

import java.util.HashMap;

public class TestsHashmap {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        String a = map.put(1, "zhangsan");
        String b = map.put(2,"lisi");

        Object map2 = map.clone();

        if(map2 instanceof  HashMap){
            HashMap map22 = (HashMap) map2;
            System.out.println(map22.get(1));
            System.out.println("---------------------");
        }
        System.out.println(a);
        System.out.println(b);
    }
}
