package com.baoquanlong.java.CollectionsTest;

import javax.xml.catalog.Catalog;
import java.util.*;

public class CollectionsTest01 {

    public static void main(String[] args) {
/*
        //        Collection<String> collection = new ArrayList<>();
        List<String> list = new ArrayList<>();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add("asdfa");
        list.add("fdfa");
        list.add("baoquanlong");
        list.add("kangxiaomeng");
        list.add("azhe");
        list.add("woaini");
        list.add("dddads");
        list.add("easdf");

        //不进行排序
        for (String s : list){
            System.out.println("s = "+s);
        }

        System.out.println("-----------------------------");
        //使用collections类的sort方法排序后输出
        Collections.sort(list);

        for(String s: list){
            System.out.println("s = "+ s);
        }

*/
        /*
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(100);
        list.add(23);
        list.add(50);
        list.add(22);
    */
    List<Dog> list = new ArrayList<>();
    list.add(new Dog(10));
    list.add(new Dog(11));
    list.add(new Dog(2));
    list.add(new Dog(3));
    list.add(new Dog(44));
    list.add(new Dog(55));
    list.add(new Dog(11));
    list.add(new Dog(1));

    Collections.sort(list,new Comparator1());

    for(Dog dog: list ) {
        System.out.println(dog.getSize());
    }
    }
}



class Animal{
    int size;

    public Animal() {
    }

    public Animal(int size) {
        this.size = size;
    }

    public int getSize(){
        return size;
    }
}

class Dog extends Animal{
    public Dog() {
    }

    public Dog(int size) {
        super(size);
    }

}

class BlackDog extends Dog{
    public BlackDog() {
    }

    public BlackDog(int size) {
        super(size);
    }
}

class Comparator1 implements Comparator<Animal>{

    @Override
    public int compare(Animal o1,  Animal o2) {
        return o1.getSize() - o2.getSize();
    }
}