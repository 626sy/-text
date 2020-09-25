package com.neusoft.LeetCode;

/**
 * @author shihaobo
 * @date 2020/9/21 22:19
 * 一维数组的动态和
 */
public class runningSum {
    public static int[] runningSum(int[] nums) {
        int pre=0;
        for(int i=0;i<nums.length;i++){
            pre += nums[i];
            nums[i]=pre;
        }
        return nums;
    }

    public static void main(String[] args) {
        runningSum Sum = new runningSum();
        int[] nums={1,2,3,4,5};
//        System.out.println(Sum.runningSum(nums));
        int[] ints = runningSum(nums);
        System.out.println(ints);
    }
}
