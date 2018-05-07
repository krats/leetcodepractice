package com.karthikbashetty.leetcodepractice;

import java.util.ArrayList;
import java.util.HashMap;

public class FindAnagramMappings {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] ans = new int[A.length];
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<Integer, ArrayList<Integer>>(A.length);
        for (int i = 0; i < B.length; i++) {
            if(!map.containsKey(B[i]))
                map.put(B[i], new ArrayList<Integer>());
            map.get(B[i]).add(i);
        }
        for (int i = 0; i < A.length; i++) {
            ArrayList<Integer> current = map.get(A[i]);
            ans[i] = current.get(current.size()-1);
            current.remove(current.size()-1);
        }
        return ans;
    }
}
