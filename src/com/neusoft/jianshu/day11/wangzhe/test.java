package com.neusoft.jianshu.day11.wangzhe;

/**
 * @author shihaobo
 * @date 2020/8/16 16:11
 */
public class test {
    public static void main(String[] args) {
        WangzheRole role = new WangzheRole();
        role.setFashuSkill(new FashuSkill() {
            @Override
            public void fashuAttack(){
                System.out.println("是否螺丝扣搭街坊士大夫");
            }
        });
        role.fashuAttack();
    }
}
