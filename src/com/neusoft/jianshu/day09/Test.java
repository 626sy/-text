package com.neusoft.jianshu.day09;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author shihaobo
 * @date 2020/8/8 19:40
 */
public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("群主", 100);
        Member a = new Member("成员A", 0);
        Member b = new Member("成员B", 0);
        Member c = new Member("成员C", 0);
        manager.show();
        a.show();
        b.show();
        c.show();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入金额");
        int money = sc.nextInt();
        System.out.println("请输入发几个包");
        int count = sc.nextInt();

        ArrayList<Integer> redlist = manager.sent(money, count);
        a.receive(redlist);
        b.receive(redlist);
        c.receive(redlist);
        manager.show();
        a.show();
        b.show();
        c.show();
    }
}
