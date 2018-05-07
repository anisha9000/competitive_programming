/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class KeyPair {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            int x = in.nextInt();
            int[] a = new int[n];
            for(int j=0;j<n;j++) {
                a[j] = in.nextInt();
            }
            Arrays.sort(a);
            int j = 0, k = n-1;
            boolean hasPair = false;
            while(j<n&&k>=0) {
                if(a[j]+a[k] == x) {
                    hasPair = true;
                    break;
                } else if(a[j]+a[k]<x) {
                    j++;
                } else {
                    k--;
                }
            }
            
            System.out.println(hasPair?"Yes":"No");

        }
    }
}
