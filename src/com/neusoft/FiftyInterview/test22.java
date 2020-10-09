package com.neusoft.FiftyInterview;

/**
 * @author shihaobo
 * @date 2020/9/30 8:52
 * 题目：利用递归方法求5!。
 * 程序分析：递归公式：fn=fn_1*4!
 */
public class test22 {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    private static long fact(int n){
        if (n==1){
            return 1;
        }else {
            return fact(n-1)*n;
        }
    }
}
