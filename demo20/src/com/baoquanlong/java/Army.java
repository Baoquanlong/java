package com.baoquanlong.java;

public class Army{
    Weapon[] wa;
    int index=0;
    public Army(){
        wa = new Weapon[10];
    }

    public Army(int num){
        wa = new Weapon[num];
    }

    public void addWeapon(Weapon weapon) throws AddWeaponOutOfBoundException {
        if(index<wa.length && index>=0){
            wa[index++] = weapon;
        }else{
            throw new AddWeaponOutOfBoundException("More than the max capacity of weapons!");
        }
    }

    public void moveAll(){
        for (int i = 0; i < this.wa.length; i++) {
            if (wa[i] instanceof Movable){
                ((Movable) wa[i]).move();
            }
        }
    }

    public void attackAll(){
        for (int i = 0; i < this.wa.length; i++) {
            if (wa[i] instanceof Shootable){
                ((Shootable) wa[i]).shoot();
            }
        }
    }

}
