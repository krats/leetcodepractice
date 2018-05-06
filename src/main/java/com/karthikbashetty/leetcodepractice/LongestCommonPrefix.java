package com.karthikbashetty.leetcodepractice;

public class LongestCommonPrefix {
    public String longestCommonPrefixHorizontalScanning(String[] strs) {
        StringBuilder ans = new StringBuilder();
        if (strs.length == 0) {
            return "";
        }
        ans.append(strs[0]);
        for (int i = 1; i < strs.length && ans.length() > 0; i++) {
            for (int j = 0; j < Math.min(ans.length(), strs[i].length()); j++) {
                if (ans.charAt(j) != strs[i].charAt(j)) {
                    ans.delete(j, ans.length());
                    break;
                }
            }
            if (ans.length() > strs[i].length()) {
                ans.delete(strs[i].length(), ans.length());
            }
        }
        return ans.toString();
    }

    public String longestCommonPrefixVerticalScanning(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);
            }
        }
        return strs[0];
    }
}
