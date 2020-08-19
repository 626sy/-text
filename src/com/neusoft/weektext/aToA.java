package com.neusoft.weektext;

import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/17 18:36
 * 面试题：StringBuffer和StringBuilder区别   编程题：给出一句英文句子： "let there be light"
 * 得到一个新的字符串，每个单词的首字母都转换为大写
 */
public class aToA {
    public static void main(String[] args) {
        // 方法一：
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要更改的句子");
        String oldStr = scanner.nextLine();
        String[] strings = oldStr.split(" ");
        String supStr = "";
        for (String str:strings
        ) {
            char c = str.charAt(0);
            // 类型转换
            if (c <= 'z' && c >= 'a'){
                c = (char) (c - 32);
            }
            if (str.length() > 1){
                supStr = str.substring(1);
                String nowstring = c + supStr;
                System.out.print(nowstring + " ");
            }else{
                String nowstring = c + "";
                System.out.print(nowstring + " ");
            }


        }


    }


}
