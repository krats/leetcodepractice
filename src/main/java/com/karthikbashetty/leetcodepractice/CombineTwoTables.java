package com.karthikbashetty.leetcodepractice;

public class CombineTwoTables {
    public int hammingDistance(int x, int y) {
        int hammingNumber = x ^ y;
        int count = 0;
        while (hammingNumber > 0) {
            count += hammingNumber % 2;
            hammingNumber /= 2;
        }
        return count;
    }
}
