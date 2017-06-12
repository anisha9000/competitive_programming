/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class LuckBalance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        Contest c[] = new Contest[n];
        for(int i=0;i<n;i++) {
            c[i] = new Contest();
            c[i].l = in.nextInt();
            c[i].t = in.nextInt();
        }
        
        int impLoseCount = 0;
        int luck = 0;
        
        Arrays.sort(c);
        
        for(int i=0;i<n;i++) {
            if(c[i].t == 0) {
                luck += c[i].l;
            } else {
                if(impLoseCount<k) {
                    luck += c[i].l;
                    impLoseCount++;
                } else {
                    luck -= c[i].l;
                }
            }
        }
        
        System.out.println(luck);
    }
}

class Contest implements Comparable<Contest>{
    Integer l;
    Integer t;

    @Override
    public int compareTo(Contest o) {
        return o.l.compareTo(l);
    }
}
