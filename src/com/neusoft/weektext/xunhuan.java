package com.neusoft.weektext;

/**
 * @author shihaobo
 * @date 2020/8/12 16:34
 */
public class xunhuan {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i =1;i<=99;i++ ){
            if (i%2 == 1){
                sum += i;
                System.out.print(i+" ");
                count++;
                if (count%10 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println(sum);
    }
}
