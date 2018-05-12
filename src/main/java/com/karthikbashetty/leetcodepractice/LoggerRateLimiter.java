package com.karthikbashetty.leetcodepractice;

import java.util.HashMap;

public class LoggerRateLimiter {
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    public boolean shouldPrintMessage(int timestamp, String message) {
        if(!map.containsKey(message)) {
            map.put(message, timestamp);
            return true;
        } else {
            if(timestamp - map.get(message) < 10) {
                return false;
            } else {
                map.put(message, timestamp);
                return true;
            }
        }
    }
}
