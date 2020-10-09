package com.neusoft.FiftyInterview;

/**
 * @author shihaobo
 * @date 2020/9/30 8:40
 * 题目：求1+2!+3!+...+20!的和
 * 程序分析：此程序只是把累加变成了累乘
 * 阶乘所得数较大，基本类型使用long，不用int
 */
public class test21 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += factorial(i);
        }
        System.out.println(sum);
    }
    public static long factorial(int n){
        long muti = 1;
        for (int i = 1; i < n+1; i++) {
            muti = muti*i;
        }
        return muti;
    }
}
