package com.neusoft.FiftyInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/22 21:02
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 程序分析：利用while语句,条件为输入的字符不为'\n'.
 */
public class test7 {
    public static void main(String[] args){
        System.out.println("请输入一行字符：");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        count(str);
    }
    //统计输入的字符
    private static void count(String str){
        List<String> list = new ArrayList<String>();
        char[] array_Char = str.toCharArray();
        for(char c:array_Char)
            list.add(String.valueOf(c));//将字符作为字符串添加到list表中
        Collections.sort(list);//排序
        for(String s:list){
            int begin = list.indexOf(s);
            int end = list.lastIndexOf(s);
            //索引结束统计字符数
            if(list.get(end)==s)
                System.out.println("字符‘"+s+"’有"+(end-begin+1)+"个");
        }
    }
}
