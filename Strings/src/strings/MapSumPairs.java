/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.HashMap;
import java.util.Map;

/**
 * Leetcode
 * 
 * Implement a MapSum class with insert, and sum methods.
 * @author anisha
 */
public class MapSumPairs {
    class MapSum {

    HashMap<String, Integer> map;
    /** Initialize your data structure here. */
    public MapSum() {
        map = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        map.put(key,val);
    }
    
    public int sum(String prefix) {
        int prefixLen = prefix.length();
        int sum = 0;
        for(Map.Entry pair:map.entrySet()) {
            String key=(String)pair.getKey();
            if(key.length() >= prefixLen && prefix.equals(key.substring(0,prefixLen))) {
                sum+=(Integer)pair.getValue();
            }
        }
        return sum;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
}
