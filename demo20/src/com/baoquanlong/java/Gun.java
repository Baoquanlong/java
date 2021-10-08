package com.baoquanlong.java;

public class Gun extends Weapon implements Shootable{
    @Override
    public void shoot() {
        System.out.println(this + " is shooting! ");
    }
}
