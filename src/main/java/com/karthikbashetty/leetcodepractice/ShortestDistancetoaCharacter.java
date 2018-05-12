package com.karthikbashetty.leetcodepractice;

import java.util.ArrayList;

public class ShortestDistancetoaCharacter {
    public int[] shortestToChar(String S, char C) {
        int[] ans = new int[S.length()];
        ArrayList<Integer> occurrences = new ArrayList<Integer>(S.length());
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) {
                occurrences.add(i);
            }
        }
        int current = 0;
        for (int i = 0; i < S.length(); i++) {
            if (current == occurrences.size() - 1) {
                ans[i] = Math.abs(i - occurrences.get(current));
            } else {
                if (Math.abs(i - occurrences.get(current)) > Math.abs(i - occurrences.get(current + 1))) {
                    current++;
                }
                ans[i] = Math.abs(i - occurrences.get(current));
            }
        }
        return ans;
    }
}
