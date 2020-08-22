package com.neusoft.weektext.chongfuzifuchuanchangdu;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shihaobo
 * @date 2020/8/21 13:43
 */
public class chongfu {


public static void main(String[] args) {
    String s = "abccagdacbekf";
    int i = new chongfu().lengthOfLongestSubstring(s);
    System.out.println(i);
}

        public int lengthOfLongestSubstring(String s) {
            int n = s.length(), ans = 0;
            Map<Character, Integer> map = new HashMap<>();
            for (int end = 0, start = 0; end < n; end++) {
                char alpha = s.charAt(end);
                if (map.containsKey(alpha)) {
                    start = Math.max(map.get(alpha), start);
                }
                ans = Math.max(ans, end - start + 1);
                map.put(s.charAt(end), end + 1);
            }
            return ans;
        }

}
