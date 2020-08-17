package com.neusoft.jianshu.day11.chiji;

/**
 * @author shihaobo
 * @date 2020/8/16 15:46
 */
public class weapon {
    String name;
    int hurt;
    public  weapon(){

    };
    public weapon(String name,int hurt){
        this.name =name;
        this.hurt = hurt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHurt() {
        return hurt;
    }

    public void setHurt(int hurt) {
        this.hurt = hurt;
    }
}
