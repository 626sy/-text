package com.neusoft.FiftyInterview;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/28 21:08
 * 题目：输入三个整数x,y,z，请把这三个数由小到大输出。
 * 程序分析：我们想办法把最小的数放到x上，先将x与y进行比较，如果x>y则将x与y的值进行交换，然后再用x与z进行比较，如果x>z则将x与z的值进行交换，这样能使x最小。
 */
public class test15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请依次输入三个数");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("三个数从小到大为："+sort(x,y,z));

    }
    public static String sort(int x,int y,int z ){
        String s = null;
        if(x>y){
            int min = x;
            x = y;
            y = min;
        }
        if (x>z){
            int min = x;
            x = z;
            z = min;
        }
        if (y>z){
            int min = z;
            z = y;
            y = min;
        }
        s = x+"<"+y+"<"+z;
        return s;
    }
}
