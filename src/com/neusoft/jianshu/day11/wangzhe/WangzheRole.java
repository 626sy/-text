package com.neusoft.jianshu.day11.wangzhe;

/**
 * @author shihaobo
 * @date 2020/8/16 16:08
 */
public class WangzheRole {
    FashuSkill fs;
    public void setFashuSkill(FashuSkill fs){
        this.fs = fs;
    }
    public void fashuAttack(){
        System.out.println("攻击");
        fs.fashuAttack();
        System.out.println("完毕");
    }
}
