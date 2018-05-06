package com.karthikbashetty.leetcodepractice;

public class ReverseString {
    public String reverseString(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            ans.append(s.charAt(n - i - 1));
        }
        return ans.toString();
    }
}
