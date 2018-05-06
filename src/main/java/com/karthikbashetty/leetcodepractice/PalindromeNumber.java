package com.karthikbashetty.leetcodepractice;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            int reverseX = 0;
            int k = x;
            while (k > 0) {
                reverseX = reverseX * 10 + k % 10;
                k /= 10;
            }
            if (x == reverseX)
                return true;
        }
        return false;
    }
}
