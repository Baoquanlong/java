package com.baoquanlong.java.Weapon;

public class Gun extends Weapon{
    public Gun() {

    }

    public Gun(boolean canMove) {
        super(canMove);
    }

    @Override
    public void attack() {
        super.attack();
    }

    @Override
    public void move() {
        System.out.println(this + " is moving!");
    }
}
