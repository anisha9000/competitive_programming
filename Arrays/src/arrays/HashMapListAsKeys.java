/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author anisha
 */
public class HashMapListAsKeys {
    public static void main(String[] args) {
        HashMap<List<Integer>, Integer> testMap = new HashMap<>();
        List<Integer> list1 = new ArrayList();
        List<Integer> list2 = new ArrayList();
        list1.add(1);
        list2.add(2);
        list1.add(3);
        
        testMap.put(list1, 1);
        testMap.put(list2, 4);
        
        List<Integer> list3 = new ArrayList();
        list3.add(1);
        
        
        System.out.println("result:" + testMap.get(list3));
        
    }
}
