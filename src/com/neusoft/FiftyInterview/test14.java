package com.neusoft.FiftyInterview;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/28 20:21
 * 题目：输入某年某月某日，判断这一天是这一年的第几天？
 * 程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，特殊情况，闰年且输入月份大于3时需考虑多加一天。
 */
public class test14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年、月、日");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        System.out.println(year+"年"+month+"月"+day+"日是该年第"+daysNum(year,month,day)+"日");
    }
    public static int daysNum(int year,int month,int day){
        int n=0;    // n为总天数
        int[] month_list = {31,28,31,30,31,30,31,31,30,31,30,31};
        if ((year%400)==0 || (year%4)==0 && (year%100)!=0){
            month_list[1] = 29;
        }
        // 求每月天数
        for (int i = 0; i < month; i++) {
            n +=month_list[i];
        }
        return n+day;
    }
}
