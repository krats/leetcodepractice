package com.karthikbashetty.leetcodepractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String, Integer> map = new HashMap<String, Integer>(500);
        for (String domain : cpdomains) {
            String[] components = domain.split("\\s+");
            int count = Integer.parseInt(components[0]);

            if (!map.containsKey(components[1])) {
                map.put(components[1], 0);
            }
            map.put(components[1], map.get(components[1]) + count);

            components = components[1].split("\\.");
            if (!map.containsKey(components[components.length - 1])) {
                map.put(components[components.length - 1], 0);
            }
            map.put(components[components.length - 1], map.get(components[components.length - 1]) + count);
            if (components.length == 3) {
                String mid = components[1] + "." + components[2];
                if (!map.containsKey(mid)) {
                    map.put(mid, 0);
                }
                map.put(mid, map.get(mid) + count);
            }
        }
        List<String> ans = new ArrayList<String>(map.size());
        for (String current : map.keySet()) {
            ans.add(map.get(current) + " " + current);
        }
        return ans;
    }
}
