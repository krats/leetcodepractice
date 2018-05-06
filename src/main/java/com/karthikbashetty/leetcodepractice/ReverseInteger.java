package com.karthikbashetty.leetcodepractice;

public class ReverseInteger {
    public int reverse(int x) {
        int sign = x < 0 ? -1 : 1;
        long X = x < 0 ? -x : x;
        long ans = 0;
        while (X != 0) {
            ans = ans * 10 + X % 10;
            X /= 10;
        }
        ans *= sign;
        return ((int) ans != ans) ? 0 : (int) ans;
    }
}
