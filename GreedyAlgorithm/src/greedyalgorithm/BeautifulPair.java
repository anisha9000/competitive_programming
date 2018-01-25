/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class BeautifulPair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        HashMap<Integer, Integer> b = new HashMap<>();
        for(int i = 0;i<n;i++) {
            a[i] = in.nextInt();
        }
        for(int i=0;i<n;i++) {
            int num = in.nextInt();
            if(b.containsKey(num)) {
                b.put(num, b.get(num)+1);
            } else {
                b.put(num, 1);
            }
        }
        
        int totalPair = 0;
        for(int i=0;i<n;i++) {
            //System.out.println("a[i]:"+ a[i]+", b.containsKey(a[i]):"+b.containsKey(a[i])+", b.get(a[i])"+ b.get(a[i]));
            if(b.containsKey(a[i])) {
                totalPair++;
                int value = b.get(a[i]);
                if(b.get(a[i]) == 1) {
                    b.remove(a[i]);
                } else {
                    b.put(a[i], value-1);
                }
            }
        }
        System.out.println(totalPair == n? totalPair-1: totalPair+1);
    }
}
