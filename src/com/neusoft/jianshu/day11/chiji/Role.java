package com.neusoft.jianshu.day11.chiji;

/**
 * @author shihaobo
 * @date 2020/8/16 15:46
 */
public class Role {
    int id;
    int blood;
    String name;
    weapon we;
    Armour ar;

    public weapon getWe() {
        return we;
    }

    public void setWe(weapon we) {
        this.we = we;
    }

    public Armour getAr() {
        return ar;
    }

    public void setAr(Armour ar) {
        this.ar = ar;
    }

    public void Attack(){
        System.out.println("使用"+we.getName()+"造成了"+we.getHurt()+"伤害");
    }
    public void defined(){
        System.out.println("穿上"+ar.getName()+"增加了"+ar.getProtect()+"防御");
    }
}
