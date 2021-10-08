package com.baoquanlong.java.TestGeneric01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


/**
 * 泛型属于编译阶段，运行阶段没用。
 * 泛型的缺点：使得选择变少，集合中的元素类型被限制。
 *
 */
public class TestGeneric {
    public static void main(String[] args) {
        List<Animal> list = new ArrayList<Animal>();
        Animal cat1 = new Cat();
        Animal cat2 = new Cat();
        Animal bird = new Bird();
        Animal animal  = new Animal();

        list.add(cat1);
        list.add(cat2);
        list.add(bird);
        list.add(animal);

        Iterator<Animal> it = list.iterator();
        while (it.hasNext()){
            Animal ani = it.next();
            ani.move();
            if (ani instanceof Cat){
                ((Cat) ani).CatchMouse();
            }else if (ani instanceof Bird){
                ((Bird) ani).fly();
            }
        }
    }
}


class Animal{
    public void move(){
        System.out.println(this + " is moving! ");
    }
}

class Cat extends Animal{
    @Override
    public void move() {
        super.move();
    }

    public void CatchMouse(){
        System.out.println(this + " is catching mouse!");
    }
}

class BlackCat extends Cat{
    @Override
    public void move() {
        super.move();
    }

    @Override
    public void CatchMouse() {
        super.CatchMouse();
    }
}

class Bird extends Animal{
    @Override
    public void move() {
        super.move();
    }

    public void fly(){
        System.out.println(this + " is flying! ");
    }
}
