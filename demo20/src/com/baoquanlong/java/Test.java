package com.baoquanlong.java;

public class Test {
    public static void main(String[] args) {
        Army army = new Army(3);
        Tank tank1 = new Tank();
        Helicopter helicopter1 = new Helicopter();
        Gun gun1 = new Gun();
        Tank tank2 = new Tank();
        try {
            army.addWeapon(tank1);
            army.addWeapon(tank2);
            army.addWeapon(gun1);
            army.addWeapon(helicopter1);
        } catch (AddWeaponOutOfBoundException e) {
            e.printStackTrace();
        }
        String st  = "ab";
        army.moveAll();
        army.attackAll();
    }
}
