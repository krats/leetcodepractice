package com.karthikbashetty.leetcodepractice;

import java.util.Arrays;

public class TenthLine {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        for (int i = 0; i < nums.length/2; i++) {
            ans += nums[i*2];
        }
        return ans;
    }
}
