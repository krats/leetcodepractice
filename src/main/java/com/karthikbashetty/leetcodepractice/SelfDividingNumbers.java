package com.karthikbashetty.leetcodepractice;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<Integer>(right - left + 1);
        for (int i = left; i <= right; i++) {
            int current = i;
            boolean isSelfDividingNumber = true;
            while (current > 0) {
                int remainder = current % 10;
                current /= 10;
                if (remainder == 0 || i % remainder != 0) {
                    isSelfDividingNumber = false;
                    break;
                }
            }
            if (isSelfDividingNumber)
                ans.add(i);
        }
        return ans;
    }
}
