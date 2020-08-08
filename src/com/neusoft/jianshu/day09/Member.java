package com.neusoft.jianshu.day09;

import java.util.ArrayList;
import java.util.Random;

/**
 * @author shihaobo
 * @date 2020/8/8 19:29
 */
public class Member extends User {
    public Member() {
    }

    public Member(String userName, int leftMoney) {
        super(userName, leftMoney);
    }
    // 收红包
    public void receive(ArrayList<Integer> list){
        Random random = new Random();
        int index = random.nextInt(list.size());
//        Integer money = list.get(index);
        Integer removeMoney = list.remove(index);
        int leftMoney = super.getLeftMoney();
        int updateMoney = leftMoney+removeMoney;
        super.setLeftMoney(updateMoney);
    }
}
