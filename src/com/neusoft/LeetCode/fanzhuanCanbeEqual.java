package com.neusoft.LeetCode;

import java.util.Arrays;

/**
 * @author shihaobo
 * @date 2020/9/21 21:03
 * 通过翻转子数组使两个数组相等
 */
public class fanzhuanCanbeEqual {
    public boolean canBeEqual(int[] target, int[] arr) {
        if(target.length!=arr.length){return false;}
        Arrays.sort(target);
        Arrays.sort(arr);
        for(int i = 0;i<target.length;i++){
            if(target[i]!=arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] target ={1,2,3,4};
        int[] arr = {3,2,4,1};
        fanzhuanCanbeEqual fanzhuanCanbeEqual = new fanzhuanCanbeEqual();
        System.out.println(fanzhuanCanbeEqual.canBeEqual(target,arr));
    }
}
