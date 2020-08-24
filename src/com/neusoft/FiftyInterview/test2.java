package com.neusoft.FiftyInterview;

/**
 * @author shihaobo
 * @date 2020/8/11 18:51
 */
public class test2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100; i < 200; i++) {
            if (isPrime(i)){
                count++;
                System.out.print(i+"  ");
            }
        }
        System.out.println(count);

/*        int m =1;
        int n = 1000;
        int count =0;
        for (int i = m; i < n; i++) {
            if (isPrime(i)){
                count++;
                System.out.print(i +"  ");
                if (count%10 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println(count);*/
    }
    public static boolean isPrime(int n){
        boolean flag = true;
        if (n ==1){
            flag = false;
        }else {
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n%i == 0 || n==1){
                    flag = false;
                    break;
                }
                else {
                    flag = true;
                }
            }
        }
        return flag;
    }
}
