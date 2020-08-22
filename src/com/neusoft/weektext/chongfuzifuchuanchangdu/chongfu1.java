package com.neusoft.weektext.chongfuzifuchuanchangdu;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/22 20:30
 */
public class chongfu1 {


    public static void main(String[] args) {
        getString();
    }

    public  static void getString(){
        System.out.println("请输入一串字符串");
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char[] stc = st.toCharArray();

        for (int i = 0; i < stc.length; i++) {
            char zoro = stc[0];
        }
        System.out.println(stc);
    }
}
