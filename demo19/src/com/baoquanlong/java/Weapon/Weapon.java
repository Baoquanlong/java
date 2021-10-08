package com.baoquanlong.java.Weapon;

public class Weapon {
    public boolean canMove;

    public Weapon(){
        this.canMove=false;
    }

    public Weapon(boolean canMove) {
        this.canMove = canMove;
    }

    public void attack(){
        System.out.println(this+" is attacking! ");
    }

    public void move(){
        System.out.println(this+ " is moving! ");
    }

}
