/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author anisha
 */
public class MissingNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        HashMap<Integer,Integer> mapA = new HashMap<>();
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
            if(mapA.containsKey(a[i])) {
                mapA.put(a[i], mapA.get(a[i])+1);
            } else {
                mapA.put(a[i], 1);
            }
        }
        int m = in.nextInt();
        int b[] =  new int[m];
        HashMap<Integer,Integer> mapB = new HashMap<>();
        for(int i=0;i<m;i++) {
            b[i] = in.nextInt();
            if(mapB.containsKey(b[i])) {
                mapB.put(b[i], mapB.get(b[i])+1);
            } else {
                mapB.put(b[i], 1);
            }
        }
        
        System.out.println("mapA:"+mapA);
        System.out.println("mapB:"+mapB);
        
        TreeSet<Integer> missingNumber = new TreeSet();
        for(int key : mapB.keySet()) {
            if(!mapA.containsKey(key) || mapA.get(key) < mapB.get(key)) {
                missingNumber.add(key);
            }
        }
        
        for(int number:missingNumber) {
            System.out.print(number+" ");
        }
        
        
    }
}
