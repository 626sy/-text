package com.neusoft.jianshu.day09;

import java.util.ArrayList;

/**
 * @author shihaobo
 * @date 2020/8/8 17:30
 */
public class Manager extends User {
    public Manager() {
    }

    public Manager(String userName, int leftMoney) {
        super(userName, leftMoney);
    }
    public ArrayList<Integer> sent(int totalMoney,int count){

        ArrayList<Integer> redlist = new ArrayList<>();
        int leftMoney = super.getLeftMoney();
        if (totalMoney>leftMoney){
            System.out.println("余额不足");
        }

        super.setLeftMoney(leftMoney-totalMoney);
        int avg = totalMoney/count;
        int mod = totalMoney%count;
        for (int i = 0; i < count - 1; i++) {
            redlist.add(avg);
        }
        int last = avg+mod;
        redlist.add(last);
        return redlist;


    }
}
