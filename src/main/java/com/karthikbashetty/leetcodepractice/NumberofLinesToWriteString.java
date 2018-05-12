package com.karthikbashetty.leetcodepractice;

import java.util.ArrayList;

public class NumberofLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        ArrayList<Integer> lines = new ArrayList<Integer>(100);
        int current = 0;
        for (int i = 0; i < S.length(); i++) {
            int width = widths[S.charAt(i) - 'a'];
            if (current + width > 100) {
                lines.add(current);
                current = 0;
                i--;
            } else {
                current += width;
            }
        }
        if (current != 0)
            lines.add(current);
        return new int[]{lines.size(), lines.get(lines.size() - 1)};
    }
}
