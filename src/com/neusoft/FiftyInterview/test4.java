package com.neusoft.FiftyInterview;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/11 19:25
 */
public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数：");
        int n = sc.nextInt();
        System.out.print(n+"=");
        for (int i = 2; i < n+1; i++) {
            while (n%i==0 && n!=i){
                n = n/i;
                System.out.print(i+"*");

            }
            if (n == i) {
                System.out.print(i);
            }
        }

    }
}
