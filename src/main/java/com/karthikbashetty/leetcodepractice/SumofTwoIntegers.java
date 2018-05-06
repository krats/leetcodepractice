package com.karthikbashetty.leetcodepractice;

public class SumofTwoIntegers {

    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
