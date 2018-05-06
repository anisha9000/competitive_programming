/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming.hackerrank;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Knapsack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int test=0;test<t;test++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = in.nextInt();
            }
            long[][] knapsack = new long[n+1][k+1];
            long sum = calcutaleMaxSum(a, n, k, knapsack);
            System.out.println(sum);
        }
    }

    private static long calcutaleMaxSum(int[] a, int n, int k, long[][] knapsack) {
        for(int i=1;i<n+1;i++) {
            for(int j=1;j<k+1;j++) {
                if(a[i-1]>j) {
                    knapsack[i][j] = knapsack[i-1][j];
                } else {
                    knapsack[i][j] = Math.max(knapsack[i-1][j], a[i-1]+knapsack[i-1][j-a[i-1]]);
                }
            }
        }
        for(int i=0;i<n+1;i++) {
            for(int j=0;j<k+1;j++) {
                System.out.print(knapsack[i][j]+" ");
            }
            System.out.println("");
        }
        return knapsack[n][k];
    }
    
    
}
