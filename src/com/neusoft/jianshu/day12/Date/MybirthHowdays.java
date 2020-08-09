package com.neusoft.jianshu.day12.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/9 11:51
 */
public class MybirthHowdays {
    public static void main(String[] args) throws ParseException {
        howday();
    }
    public static void howday() throws ParseException {
        System.out.println("请输入出生年月日,格式为yyyy-MM-dd");
        String birthdayNow = new Scanner(System.in).next();
        Date Currentdate = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date birhtdayNowdate = df.parse(birthdayNow);
        long birhtdayNowdateTime = birhtdayNowdate.getTime();
        long currentdateTime = Currentdate.getTime();
        long time = currentdateTime-birhtdayNowdateTime;
        if (currentdateTime<birhtdayNowdateTime){
            System.out.println("对不起，您还未出生");
        }else {
            System.out.println("您已出生"+time/1000/60/60/24+"天");
        }


    }
}
