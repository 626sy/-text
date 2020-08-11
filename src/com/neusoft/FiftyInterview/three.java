package com.neusoft.FiftyInterview;

/**
 * @author shihaobo
 * @date 2020/8/11 19:11
 */
public class three {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (isshuixianhua(i)){
                System.out.print(i+"  ");
            }
        }
    }
    public static boolean isshuixianhua(int num){
        int ge = num%10;
        int shi = num/10%10;
        int bai = num/100;
        if (ge*ge*ge+shi*shi*shi+bai*bai*bai == num){
            return true;
        }else {
            return false;
        }
    }
}
