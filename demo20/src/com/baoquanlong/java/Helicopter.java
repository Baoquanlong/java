package com.baoquanlong.java;

public class Helicopter extends Weapon implements Shootable,Movable{
    @Override
    public void move() {
        System.out.println(this + " is moving!");
    }

    @Override
    public void shoot() {
        System.out.println(this + " is shooting!");
    }
}
