package com.neusoft.FiftyInterview;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/22 20:51
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 * 程序分析：(a>b)?a:b这是条件运算符的基本例子。
 */
public class test5 {
    public static void main(String[] args) {
        System.out.println("请输入成绩");
        int n = new Scanner(System.in).nextInt();

        grade(n);

    }
    public static void grade(int n){
        if (n>100||n<0){
            System.out.println("输入无效");
        }else {
            String str = (n>=90)?"分，是A等":((n>=60)?"分，是B等":"分，是C等");
            System.out.println(n+str);
        }

    }
}
