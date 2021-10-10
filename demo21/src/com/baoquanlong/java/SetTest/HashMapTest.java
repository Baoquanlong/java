package com.baoquanlong.java.SetTest;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
    public static void main(String[] args) {

        //新建一个<Integer，String>类型的Hashmap
//        HashMap<Integer,String> hashMap  = new HashMap<>();
//
//        //给Hashmap插入数据
//        hashMap.put(1,"zhangsan");
//        hashMap.put(2,"lisi");
//        hashMap.put(2,"wangwu");
//        hashMap.put(3,"wangmazi");
//        hashMap.put(4,"wangwu");



        //通过K遍历Hashmap:
//        Set<Integer> set = hashMap.keySet();
//
//        for (Integer i :set){
//            System.out.println(hashMap.get(i));
//        }

        //通过entrySet方法遍历Hashmap

//        Set<Map.Entry<Integer,String>> entrySet = hashMap.entrySet();
//
//        for (Map.Entry<Integer,String> node : entrySet){
//            System.out.println(node.getKey() + " = " + node.getValue());
//        }

        //设置K为自定义类型：
        HashMap<Animal,Integer> hashMap = new HashMap<>();
        hashMap.put(new Animal(22),38);
        hashMap.put(new Animal(2),111);
        hashMap.put(new Animal(222),11);
        hashMap.put(new Animal(11),211);
        hashMap.put(new Animal(23),121);
        hashMap.put(new Animal(12),221);
        hashMap.put(new Animal(1),1);


        //通过K遍历hashmap:

//        Set<Animal> set = hashMap.keySet();
//        for(Animal ani : set){
//            System.out.println(hashMap.get(ani));
//        }

        //通过entrySet()方法遍历hashmap:

        Set<Map.Entry<Animal,Integer>> entrySet = hashMap.entrySet();
        for (Map.Entry<Animal,Integer> entry: entrySet){
            System.out.println(entry.getKey()+ " =  "+ entry.getValue());
        }


    }
}


class Cat extends Animal{
    public Cat() {
    }

    public Cat(int size) {
        super(size);
    }
}

