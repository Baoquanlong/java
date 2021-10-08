package com.baoquanlong.java.Weapon;

public class Army {
    //储存武器的数组
    Weapon[] wa;
    int num;
    int index;
    public Army(){
        num = 10;
        wa = new Weapon[this.num];
    }

    public Army(int num) {
        this.num = num;
        wa = new Weapon[this.num];
    }

    /**
     * Used to add weapon wa to the list wa.
     * @param wa weapon to added.
     */
    public void addWeapon(Weapon wa) throws WeaponOutOfRangeException{
        if (index<num && index>=0){
            this.wa[index++] = wa;
        }else{
            throw new WeaponOutOfRangeException("Weapon out of range!");
        }
    }

    /**
     * Used to control all weapons attack.
     */
    public void  attackAll(){
        for (int i = 0; i < index; i++) {
            this.wa[i].attack();
        }
    }

    /**
     * Used to move all weapons
     */
    public void moveAll(){
        for (int i = 0; i < this.wa.length; i++) {
            if (true==wa[i].canMove){
                wa[i].move();
            }
        }
    }
}
