package com.neusoft.weektext.chongfuzifuchuanchangdu;

/**
 * @author shihaobo
 * @date 2020/8/22 20:45
 */
public class chongfu2 {
    public static void main(String[] args) {

        System.out.println(lengthOfLongestSubstring("asdfasdfgfdgsdsdgfg"));
    }
    public static int lengthOfLongestSubstring(String s) {
        int i = 0;
        int flag = 0;
        int length = 0;
        int result = 0;
        while (i < s.length()) {
            int pos = s.indexOf(s.charAt(i),flag);
            if (pos < i) {
                if (length > result) {
                    result = length;
                }
                if (result >= s.length() - pos - 1) {
                    return result;
                }
                length = i - pos - 1;
                flag = pos + 1;
            }
            length++;
            i++;
        }
        return length;
    }

}
