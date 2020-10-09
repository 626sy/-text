package com.neusoft.FiftyInterview;

/**
 * @author shihaobo
 * @date 2020/9/30 8:55
 * 题目：有5个人坐在一起，问第五个人多少岁？他说比第4个人大2岁。问第4个人岁数，他说比第3个人大2岁。
 * 问第三个人，又说比第2人大两岁。问第2个人，说比第一个人大两岁。最后问第一个人，他说是10岁。
 * 请问第五个人多大？
 * 程序分析：利用递归的方法，递归分为回推和递推两个阶段。要想知道第五个人岁数，
 *          需知道第四人的岁数，依次类推，推到第一人（10岁），再往回推。
 */
public class test23 {
    public static void main(String[] args) {
        System.out.println(getAge(5,2));
    }
    // m为第m个人，n位每人比剩下人大几岁
    private static int getAge(int m,int n){
        if (m==1){
            return 10;
        }else {
            return getAge(m-1,n)+n;
        }
    }
}
