package com.baoquanlong.java.Weapon;

public class Test {
    public static void main(String[] args) {
        Army army = new Army(4);
        Weapon gun1 = new Gun(true);
        Weapon gun2 = new Gun(false);
        Weapon knife1 = new Knife(false);
        Weapon knife2 = new Knife(false);
        Weapon knife3 = new Knife(true);

        try{
            army.addWeapon(gun1);
            army.addWeapon(gun2);
            army.addWeapon(knife1);
            army.addWeapon(knife2);
            army.addWeapon(knife3);
        }catch(WeaponOutOfRangeException e){
            e.printStackTrace();
        }

        army.attackAll();
        army.moveAll();
    }
}
