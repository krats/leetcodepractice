package com.karthikbashetty.leetcodepractice;

public class NumberComplement {
    public int findComplement(int num) {
        int ans = 0;
        int count = 0;
        while (num != 0) {
            ans = (num%2 == 1) ? ans : ans+(1<<count);
            count++;
            num/=2;
        }
        return ans;
    }
}
