package com.karthikbashetty.leetcodepractice;

public class HammingDistance {
    public int hammingDistance(int x, int y) {
        int num = x ^ y;
        int ans = 0;
        while (num > 0) {
            ans += num % 2;
            num /= 2;
        }
        return ans;
    }
}
