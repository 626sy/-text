package com.neusoft.FiftyInterview;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/9 17:17
 */
public class one {
    public static void main(String[] args) {
        System.out.println("请输入月数");
        int sc = new Scanner(System.in).nextInt();
        System.out.println("该月兔子总数为"+sc+"对");
    }
    public static int fun(int n){
        if (n == 1 || n == 2){
            return 1;
        }else {
            return fun(n-1)+fun(n-2);
        }
    }
}
