package com.baoquanlong.java.SetTest;

import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

public class SetTest02 {
    public static void main(String[] args) {
    /*
    创建TreeSet集合类
     */
    TreeSet<Dog> treeSet  = new TreeSet<>();
    Dog animal1 = new Dog(20);
    Dog dog1 = new Dog(22);
    Dog ani2 = new Dog(3);
    Dog ani3 = new Dog(33);
    Dog ani4 = new Dog(3233);
    Dog ani5 = new Dog(311);
    Dog dog = new blackDog(10000);

        treeSet.add(animal1);
        treeSet.add(ani2);
        treeSet.add(ani3);
        treeSet.add(ani4);
        treeSet.add(ani5);
        treeSet.add(dog1);
        treeSet.add(dog);

        Iterator<Dog> it = treeSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next().getSize());
        }

    }
}

class Animal implements Comparable<Animal>{
    int size;
    public int getSize(){
        return size;
    }
    public Animal() {
    }

    public Animal(int size) {
        this.size = size;
    }


    @Override
    public int compareTo(Animal o) {
        return this.size-o.size;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return size == animal.size;
    }

    @Override
    public int hashCode() {
        return Objects.hash(size);
    }
}

class Dog extends Animal{
    public Dog() {
    }

    public Dog(int size) {
        super(size);
    }
}

class blackDog extends Dog{
    public blackDog() {
    }

    public blackDog(int size) {
        super(size);
    }
}