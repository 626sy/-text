package com.neusoft.FiftyInterview;

/**
 * @author shihaobo
 * @date 2020/8/23 20:15
 * 题目：一个整数，它加上100后是一个完全平方数，
 * 再加上168又是一个完全平方数，请问该数是多少？
 * 程序分析：在10万以内判断，先将该数加上100后再开方，
 * 再将该数加上268后再开方，如果开方后的结果满足如下条件，即是结果。
 */
public class test13 {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1; i < 100001; i++) {
            if (isCompSqrt(n+100)&&isCompSqrt(n+268)){
                n = i;
                break;
            }
        }
        System.out.println("该数是"+n);
    }
    private static boolean isCompSqrt(int n){
        boolean issqrt = false;
        for (int i = 1; i < Math.sqrt(n)+1; i++) {
            if (n == Math.pow(i,2)){
                issqrt = true;
                break;
            }
        }
        return issqrt;
    }

}
