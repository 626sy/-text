package com.neusoft.weektext;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/25 20:05
 */
public class fanhuiweizhi {

    public static void main(String[] args) {
        System.out.print("请输入有几个人参加:n = ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        //定义标识的某人是否还在圈内
        boolean[] isIn = new boolean[number];
        for (int i=0; i<isIn.length; i++)
            isIn[i] = true;
        //定义还在圈内的人数, 报数, 索引
        int inCount = number;
        int countNum = 0;
        int index = 0;
        while (inCount > 1) {
            if(isIn[index]) {
                countNum++;
                if(0 == countNum%3) {
                    inCount--;
                    countNum = 0;
                    isIn[index] = false;
                }
            }
            index++;
            if(index == number)
                index = 0;
        }
        for (int i=0; i<isIn.length; i++)
            if(isIn[i]) {
                System.out.println("留下的是: "+(i+1));
            }

    }
}
