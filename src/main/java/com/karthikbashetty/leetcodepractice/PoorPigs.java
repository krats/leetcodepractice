package com.karthikbashetty.leetcodepractice;

public class PoorPigs {
    public int poorPigs(int buckets, int minutesToDie, int minutesToTest) {
        int dividor = minutesToTest/minutesToDie;
        int ans = 0;
        while(Math.pow(dividor+1, ans) < buckets*1.0) {
            ans++;
        }
        return ans;
    }
}
