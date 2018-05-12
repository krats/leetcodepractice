package com.karthikbashetty.leetcodepractice;

public class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int horizontal = 0;
        int vertical = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'R') {
                horizontal++;
            } else if (moves.charAt(i) == 'L') {
                horizontal--;
            } else if (moves.charAt(i) == 'U') {
                vertical++;
            } else {
                vertical--;
            }
        }
        return vertical == 0 && horizontal == 0;
    }
}
