package com.neusoft.FiftyInterview;

/**
 * @author shihaobo
 * @date 2020/8/30 15:42
 * 九九乘法表
 */
public class test16 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i+1; j++){
                System.out.print(j+"*"+ i +"=" +(i*j)+" ");
            }
            System.out.println();
        }
    }
}
