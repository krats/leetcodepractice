package com.karthikbashetty.leetcodepractice;

public class ReverseWordsinaStringIII {
    public String reverseString(String s) {
        int n = s.length();
        StringBuilder ans = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            ans.append(s.charAt(n - i - 1));
        }
        return ans.toString();
    }

    public String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseString(arr[i]);
        }
        StringBuilder ans = new StringBuilder(s.length());
        ans.append(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            ans.append(" ");
            ans.append(arr[i]);
        }
        return ans.toString();
    }
}
