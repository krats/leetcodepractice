package com.karthikbashetty.leetcodepractice;


import java.util.List;

// This is the interface that allows for creating nested lists.
// You should not implement it, or speculate about its implementation
interface NestedInteger {
//    // Constructor initializes an empty nested list.
//    public NestedInteger();
//
//    // Constructor initializes a single integer.
//    public NestedInteger(int value);

    // @return true if this NestedInteger holds a single integer, rather than a nested list.
    public boolean isInteger();

    // @return the single integer that this NestedInteger holds, if it holds a single integer
    // Return null if this NestedInteger holds a nested list
    public Integer getInteger();

    // Set this NestedInteger to hold a single integer.
    public void setInteger(int value);

    // Set this NestedInteger to hold a nested list and adds a nested integer to it.
    public void add(NestedInteger ni);

    // @return the nested list that this NestedInteger holds, if it holds a nested list
    // Return null if this NestedInteger holds a single integer
    public List<NestedInteger> getList();
}


public class NestedListWeightSum {
    public int depthSum(List<NestedInteger> nestedList) {
        int ans = 0;
        for (int i = 0; i < nestedList.size(); i++) {
            ans += depthSumAux(nestedList.get(i), 1);
        }
        return ans;
    }

    int depthSumAux(NestedInteger nestedInteger, int depth) {
        if (nestedInteger.isInteger()) {
            return nestedInteger.getInteger() * depth;
        } else {
            int current = 0;
            List<NestedInteger> list = nestedInteger.getList();
            for (int i = 0; i < list.size(); i++) {
                current += depthSumAux(list.get(i), depth + 1);
            }
            return current;
        }
    }
}
