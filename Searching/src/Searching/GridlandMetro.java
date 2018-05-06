/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 *
 * @author anisha
 */
public class GridlandMetro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int k = in.nextInt();
        HashMap<Integer, HashSet<Integer>> trackMap = new HashMap<>();
        long lampPostCount = n*m;
        for(int i=0;i<k;i++) {
            int r = in.nextInt();
            int c1 = in.nextInt();
            int c2 = in.nextInt();
            Set<Integer> range = IntStream.rangeClosed(c1, c2).boxed().collect(Collectors.toSet());
            if(!trackMap.containsKey(r)) {
                trackMap.put(r, (HashSet<Integer>) range);
            } else {
                trackMap.get(r).addAll(range);
            }
        }
        for(HashSet<Integer> trackCount : trackMap.values()) {
            lampPostCount -= trackCount.size();
        }
        
        System.out.println(lampPostCount);
    }
}
