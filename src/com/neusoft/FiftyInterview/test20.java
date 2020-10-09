package com.neusoft.FiftyInterview;

/**
 * @author shihaobo
 * @date 2020/9/25 21:26
 * 有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13...求出这个数列的前20项之和。
 * 程序分析：请抓住分子与分母的变化规律。
 */
public class test20 {
    public static void main(String[] args) {
        double n1=1;
        double n2=1;
        double fenshu=n1/n2;
        double sum = 0;
        for (int i = 0; i < 20; i++) {
            double t1=n1;
            double t2=n2;
            n1 = t1+t2;
            n2 = t1;
            fenshu = n1/n2;
            sum += fenshu;
        }
        System.out.println(sum);
    }

}
