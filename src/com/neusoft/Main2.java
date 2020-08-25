package com.neusoft;

/**
 * @author shihaobo
 * @date 2020/8/25 8:04
 */
import java.util.Arrays;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String s[] = str.split(" ");
        int A = Integer.parseInt(s[0]);
        int B = Integer.parseInt(s[1]);
        int a = Integer.parseInt(s[2]);
        int b = Integer.parseInt(s[3]);
        int aarr[] = new int[A];
        int barr[] = new int[B];
        for (int i = 0; i < aarr.length; i++) {
            aarr[i] = i+1;
        }
        for (int i = 0; i < barr.length; i++) {
            barr[i] = i+1;
        }

        int maxArr[] = new int[aarr.length*barr.length];
        int ind = 0;
        for(int i = 0; i < aarr.length; i++) {
            for(int j=0 ;j< barr.length;j++) {
                maxArr[ind] = aarr[i] * barr[i];
                ind++;
            }
        }
        Arrays.sort(maxArr);
        int max = maxArr[aarr.length*barr.length-1];
        boolean flag = true;
        for(int i = 0; i < aarr.length; i++) {
            for(int j=0 ;j< barr.length;j++) {
                if(aarr[i]/barr[i] == a/b && aarr[i]*barr[i] == max) {
                    System.out.print(aarr[i]+" "+barr[i]);
                    flag = false;
                }
            }
        }
        if(flag) {
            System.out.println("0 0");
        }

    }

}