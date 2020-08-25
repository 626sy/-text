package com.neusoft.weektext;

/**
 * @author shihaobo
 * @date 2020/8/25 8:19
 *求0—7所能组成的奇数个数。
 */
public class jishu {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <=7; i++) {
            for (int j = 0; j <= 7; j++) {
                if (j%2!=0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
