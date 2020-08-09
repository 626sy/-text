package com.neusoft.jianshu.day12.Date;

import java.util.Calendar;

/**
 * @author shihaobo
 * @date 2020/8/9 14:55
 */
public class CalendarTest {
    public static void main(String[] args) {
        //创建Calendar对象
        Calendar c = Calendar.getInstance();
        //将给定的日历字段设置到Calendar对象中
        c.set(Calendar.YEAR, 2018);
        c.set(Calendar.MONTH, 1);
        c.set(Calendar.DATE, 14);
        //设置年
        int year = c.get(Calendar.YEAR);
        //设置月
        int month = c.get(Calendar.MONTH) + 1;
        //设置日
        int date = c.get(Calendar.DATE);
        //设置星期
        char week = getWeek(c.get(Calendar.DAY_OF_WEEK));
        int week2 = c.get(Calendar.DAY_OF_WEEK);
        //输出结果
        System.out.println(year + "年" + month + "月" + date + "日是星期" + week);
        // 2018年2月14日是星期四
        System.out.println(year + "年" + month + "月" + date + "日是星期" + week2);
        // 2018年2月14日是星期4
    }

    //定义方法，获取星期汉字
    public static char getWeek(int a) {
        char[] c = {'日', '一', '二', '三', '四', '五', '六'};
        return c[a];
    }
}
