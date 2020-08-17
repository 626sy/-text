package com.neusoft.jianshu.day11.chiji;

/**
 * @author shihaobo
 * @date 2020/8/16 15:47
 */
public class Armour {
    String name;
    int protect;
    public Armour(){

    }
    public Armour(String name,int protect){
        this.name = name;
        this.protect = protect;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProtect() {
        return protect;
    }

    public void setProtect(int protect) {
        this.protect = protect;
    }
}
