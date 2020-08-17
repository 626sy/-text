package com.neusoft.jianshu.day11.chiji;

/**
 * @author shihaobo
 * @date 2020/8/16 15:57
 */
public class test {
    public static void main(String[] args) {
        weapon weapon = new weapon("90k", 50);
        Armour armour = new Armour("倍加", 100);
        Role role = new Role();
        role.setAr(armour);
        role.setWe(weapon);
        role.Attack();
        role.defined();
    }
}
