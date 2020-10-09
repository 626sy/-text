//package com.neusoft.huiwenzizifu;
//
///**
// * @author shihaobo
// * @date 2020/10/9 10:22
// */
//public class Solution2 {
//    public static void main(String[] args) {
//        String s = "abcabccabacabc";
//        Solution2 solu2 = new Solution2();
//        System.out.println(solu2.manacher(s));
//    }
//    public char[] getSPString(String s){
//        int len = s.length();
//        char[] arr = new char[2 * len + 1];
//        for(int i = 0 ;i < len;i++){
//            arr[2 * i] = '#';
//            arr[2 * i + 1] = s.charAt(i);
//        }
//        arr[2 * len] = '#';
//        return  arr;
//    }
//    public void manacher(String s) {
//        if (s == null || s.length() <= 1) {
//            return;
//        }
//        char[] sp = getSPString(s);
//        int len = sp.length;
//        int[] arr = new int[sp.length]; //最长回文半径数组
//        int R = -1; //最大回文右边界
//        int C = -1; //最大回文中心
//        int max = -1; // 最长回文半径
//        for (int i = 0; i < len; i++) {
//            arr[i] = R > i ? Math.min(arr[2 * C - i] , R - i) : 1;
//            while(i + arr[i] < len && i - arr[i] >= 0){
//                if(sp[i + arr[i]] == sp[i - arr[i]]){
//                    arr[i] ++;
//                } else{
//                    break;
//                }
//            }
//            if(i + arr[i] > R){
//                R = i +arr[i];
//                C = i;
//            }
//            if(max < arr[i]){
//                max  = arr[i];
//                C = i;
//            }
//        }
//    }
//}
