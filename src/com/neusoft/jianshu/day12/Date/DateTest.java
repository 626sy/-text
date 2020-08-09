package com.neusoft.jianshu.day12.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author shihaobo
 * @date 2020/8/9 11:28
 */
public class DateTest {
    public static void main(String[] args) throws ParseException {
//        System.out.println(new Date());
//        System.out.println(new Date(0L));
//        System.out.println(new Date().getTime());

        // format
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        DateFormat df2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        Date date = new Date();
        System.out.println(date.getTime());
        String s = df.format(date);
        System.out.println(s);
        String s1 = df2.format(date);
        System.out.println(s1);

        // parse
//        String str = "2001年10月1日";
//        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
//        Date date = df.parse(str);
//        System.out.println(date);
    }
}
