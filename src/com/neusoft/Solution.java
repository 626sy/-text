package com.neusoft;

import java.util.*;


/*public class Solution {

    public static void main(String[] args) {
        String str = "28953457323";
        Solution solution = new Solution();
        System.out.println(solution.findMaxNum(str));
    }


    public int findMaxNum (String str) {
        // write code here
        if (null == str&& str.length() == 0){
            System.out.println("空字符串");
        }
        String res = "";
        int start = 0;
        int index = start;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - str.charAt(index) == 1 ){
                index++;
                if (index-start+1> res.length()){
                    res = str.substring(start,index+1);
                }
                if (index -start +1 == res.length() && str.charAt(start)>res.charAt(0)){
                    res = str.substring(start,index+1);
                }

            }
            else {
                start = i;
                index = start;
            }

        }
        return Integer.parseInt(res);
    }


}*/

public class Solution {

    public String findMaxNum(String str) {
        if (null == str || str.length() == 0)
            return "";
        String res = "";
        int start = 0;
        int tmpIndex = start;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) - str.charAt(tmpIndex) == 1) {
                tmpIndex++;
                if ((tmpIndex - start+1) > res.length())
                    res = str.substring(start, tmpIndex + 1);
                if((tmpIndex - start + 1== res.length()) && str.charAt(start)>res.charAt(0))
                    res = str.substring(start, tmpIndex + 1);
            }
            else{
                start = i;
                tmpIndex = start;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution po = new Solution();
        System.out.println(po.findMaxNum("28953457323"));
    }
}

