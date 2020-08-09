package com.neusoft.jianshu.day12.Date;

import java.util.Calendar;
import java.util.Date;

/**
 * @author shihaobo
 * @date 2020/8/9 15:47
 */
public class CalendarTest2 {

/*
    public static void main(String[] args) {
        // 创建calendar对象
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // 设置年
        int year = calendar.get(Calendar.YEAR);
        // 设置月
        int month = calendar.get(Calendar.MONTH) + 1;
        // 设置日
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println(year + "年" + month + "月" + dayOfMonth + "日"); // 2020年7月28日
    }
*/

/*
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH) ;
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日"); // 2020年7月28日

        calendar.set(Calendar.YEAR, 2021);
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH) + 1;
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH) ;
        System.out.println("set之后");
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日"); // 2020年7月28日

        calendar.add(Calendar.DAY_OF_MONTH,2);
        calendar.add(Calendar.YEAR,-3);
        year = calendar.get(Calendar.YEAR);
        month= calendar.get(Calendar.MONTH)+1;
        dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("add之后");
        System.out.println(year+"年"+month+"月"+dayOfMonth+"日");
    }
*/

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        Date d = new Date();
        System.out.println(d.getTime());
        Date date = calendar.getTime();
        System.out.println(date); // Tue Jul 28 09:13:15 CST 2020

        Date date1 = new Date();
        System.out.println(date1); // Tue Jul 28 09:13:15 CST 2020
    }
}
