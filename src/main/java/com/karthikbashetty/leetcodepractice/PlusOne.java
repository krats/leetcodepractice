package com.karthikbashetty.leetcodepractice;

import java.util.ArrayList;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        ArrayList<Integer> ans = new ArrayList<Integer>(digits.length + 1);
        int currentIndex = digits.length-1;
        while (currentIndex >= 0) {
            if(digits[currentIndex] == 9 && carry == 1) {
                ans.add(0);
            } else {
                if(carry == 1) {
                    ans.add(digits[currentIndex] + 1);
                    carry = 0;
                } else {
                    ans.add(digits[currentIndex]);
                }
            }
            currentIndex--;
        }
        if(carry != 0) {
            ans.add(1);
        }
        int[] ansArr = new int[ans.size()];
        for (int i = ans.size()-1; i >= 0; i--) {
            ansArr[ans.size() - i - 1] = ans.get(i);
        }
        return ansArr;
    }
}
