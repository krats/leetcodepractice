package com.karthikbashetty.leetcodepractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class KeyboardRow {
    public String[] findWords(String[] words) {
        ArrayList<String> ans = new ArrayList<String>(words.length);
        String first = "qwertyuiopQWERTYUIOP";
        String second = "asdfghjklASDFGHJKL";
        String third = "ZXCVBNMzxcvbnm";
        HashMap<Character, Integer> map = new HashMap<Character, Integer>(52);
        for (int i = 0; i < first.length(); i++) {
            map.put(first.charAt(i), 1);
        }
        for (int i = 0; i < second.length(); i++) {
            map.put(second.charAt(i), 2);
        }
        for (int i = 0; i < third.length(); i++) {
            map.put(third.charAt(i), 3);
        }
        for (String word : words) {
            if (word.length() == 0) {
                ans.add(word);
            } else {
                int current = map.get(word.charAt(0));
                boolean check = true;
                for (int i = 1; i < word.length(); i++) {
                    if (map.get(word.charAt(i)) != current) {
                        check = false;
                        break;
                    }
                }
                if (check)
                    ans.add(word);
            }
        }
        return ans.toArray(new String[ans.size()]);
    }
}
