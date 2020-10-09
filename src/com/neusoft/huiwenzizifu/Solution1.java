package com.neusoft.huiwenzizifu;

/**
 * @author shihaobo
 * @date 2020/10/9 10:13
 */
public class Solution1 {
    public static void main(String[] args) {
        String s = "abcabccabacabc";
        Solution1 solu = new Solution1();
        System.out.println(solu.longestPalindrome(s));

    }
    public char[] getSPString(String s){
        int len = s.length();
        char[] arr = new char[2 * len + 1];
        for(int i = 0 ;i < len;i++){
            arr[2 * i] = '#';
            arr[2 * i + 1] = s.charAt(i);
        }
        arr[2 * len] = '#';
        return  arr;
    }
    public String longestPalindrome(String s) {
        if(s == null || s.length() <= 1){
            return s;
        }
        char[] res = getSPString(s);
        int len = res.length;
        int C = 0;   //最长回文串中心
        int max = 1;  //最长回文串长度

        for(int i = 0; i< len;i++){
            int j = 1;
            while(i - j >=0 && j + i < len){
                if(res[i - j] ==  res[i + j]){
                    j++;
                }else{
                    break;
                }
            }
            if(2 * j - 1 > max){
                C = i;
                max = 2 * j - 1;
            }
        }
        return s.substring((C - max/2)/2 , (C+ max/2)/2);
    }
}
