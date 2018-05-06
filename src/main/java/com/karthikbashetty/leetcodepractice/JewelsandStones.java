package com.karthikbashetty.leetcodepractice;

import java.util.HashSet;

public class JewelsandStones {
    public int numJewelsInStones(String J, String S) {
        HashSet<Character> set = new HashSet<Character>(J.length());
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        int ans = 0;
        for (int i = 0; i < S.length(); i++) {
            if (set.contains(S.charAt(i))) {
                ans++;
            }
        }
        return ans;
    }
}
