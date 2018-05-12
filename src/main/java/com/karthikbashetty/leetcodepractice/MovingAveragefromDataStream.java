package com.karthikbashetty.leetcodepractice;

public class MovingAveragefromDataStream {
    private int size;
    private int[] arr;
    private int start;
    private int current;
    private double prev = 0;

    public MovingAveragefromDataStream(int size) {
        this.size = size;
        arr = new int[size];
        start = 0;
        current = 0;
    }

    public double next(int val) {
        double ans;
        if (current < size) {
            current++;
            arr[start] = val;
            start++;
            start = start % size;
            ans = (prev + val);
            prev = ans;
        } else {
            ans = (prev + val - arr[start]);
            prev = ans;
            arr[start] = val;
            start++;
            start = start % size;
        }
        return ans/current;
    }
}
