package com.neusoft;

import java.util.Arrays;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        float A = sc.nextInt();
        float B = sc.nextInt();
        float a = sc.nextInt();
        float b = sc.nextInt();

        float x = 0;
        float y = 0;
        for(float i = A;i>=1;i--){
            for(float j=B;j>=1;j--){
                if(i/j == a/b){
                    x = i;
                    y = j;
                }break;
            }
            break;
        }



    }

}
//    public static void getnum(int A, int B, int a, int b){
//        int x = 0;
//        int y = 0;
//        for(int i = 1;i<=A;i++){
//            for(int j=1;j<B;j++){
//                if(i/j == a/b){
//                    x = i;
//                    y = j;
//                    continue;
//                }
//            }
//        }
//        int[] arr = new int[]{x, y};
//        System.out.println(arr);
//    }

//小强想从[1，A]中选出一个整数x，从【1，B】中选出一个整数y，使得满足x/y = a/b的同时，x*y的乘积最大，如果不存在这样的x，y，请输出"0 0"
// 给你n个点，编号从0 到n-1，有m条双向路径，两个点之间可以有多条路径相互到达
// 每一条路径中有一个最大便，所有路径的最大边中最小的那个边就是者两个点价值，现在又多次询问，每一次询问是给你一个值f，文在这个图纸又多少个点对满足
//这两个点之间的价值不小于f，输出满足要求的点对数量