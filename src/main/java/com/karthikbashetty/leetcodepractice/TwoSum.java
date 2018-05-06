package com.karthikbashetty.leetcodepractice;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {

    public int[] twoSumNaive(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public int[] twoSumSort(int[] nums, int target) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            if (nums[i] + nums[j] < target) {
                i++;
            } else if (nums[i] + nums[j] > target) {
                j--;
            } else {
                return new int[]{i, j};
            }
        }
        return new int[]{};
    }

    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(nums.length);
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
