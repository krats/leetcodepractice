package com.karthikbashetty.leetcodepractice;

public class NimGame {

    public boolean canWinNimRecursive(int n) {
        if (n == 0)
            return false;
        for (int i = 1; i <= Math.min(3, n); i++) {
            boolean current = !canWinNimRecursive(n - i);
            if (current)
                return true;
        }
        return false;
    }

    public boolean canWinNimArrayDp(int n) {
        if (n == 0)
            return false;
        boolean[] dp = new boolean[n + 1];
        dp[0] = false;
        for (int i = 1; i <= n; i++) {
            int j = 1;
            while (!dp[i] && j <= Math.min(i, 3)) {
                dp[i] = !dp[i - j];
                j++;
            }
        }
        return dp[n];
    }

    public boolean canWinNimDPThreeVariables(int n) {
        if (n == 0)
            return false;
        else if (n <= 3)
            return true;
        boolean a = true;
        boolean b = true;
        boolean c = true;
        for (int i = 4; i <= n; i++) {
            boolean current = !(a && b && c);
            a = b;
            b = c;
            c = current;
        }
        return c;
    }

    public boolean canWinNim(int n) {
        return n % 4 != 0;

    }
}
