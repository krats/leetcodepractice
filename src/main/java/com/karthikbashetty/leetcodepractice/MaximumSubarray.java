package com.karthikbashetty.leetcodepractice;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 0)
            return Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0;
        int end = 0;
        while (end < nums.length) {
            currentSum += nums[end];
            if(currentSum > maxSum) {
                maxSum = currentSum;
            }
            if (currentSum <= 0) {
                start = end+1;
                currentSum = 0;
            }
            end++;
        }
        return maxSum;
    }
}
