package com.neusoft.FiftyInterview;

/**
 * @author shihaobo
 * @date 2020/8/23 19:54
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class test10 {
    public static void main(String[] args) {
        int n = 10;
        double h = 100;
        distance(n,h);

    }
    // 经过n次反弹后，h位落下高度
    public static void distance(int n,double h){
        double length = 0;
        for (int i = 0; i < n; i++) {
            length += h;
            h = h/2;
        }
        System.out.println("经过"+n+"次反弹后,共经过"+length+"米，第"+n+"次反弹"+h+"米");
    }
}
