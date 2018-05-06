package com.karthikbashetty.leetcodepractice;

import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(6);
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        HashMap<Character, Character> map2 = new HashMap<Character, Character>(6);
        map2.put('V', 'I');
        map2.put('X', 'I');
        map2.put('L', 'X');
        map2.put('C', 'X');
        map2.put('D', 'C');
        map2.put('M', 'C');
        for (int i = 0; i < s.length(); i++) {
            if (i > 0 && map2.containsKey(s.charAt(i)) && map2.get(s.charAt(i)) == s.charAt(i - 1)) {
                ans -= 2 * map.get(s.charAt(i - 1));
            }
            ans += map.get(s.charAt(i));
        }
        return ans;
    }
}
