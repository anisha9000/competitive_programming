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
public class GreedyFlorist {
    static int getMinimumCost(int n, int k, int[] c){
        // Complete this function
        Arrays.sort(c);
        int x = 0;
        int totalCost = 0;
        for(int i=n-1;i>=0;i--) {
            totalCost+=((x+1)*c[i]);
            if((n-i)%k==0){
                x++;
            }
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] c = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int minimumCost = getMinimumCost(n, k, c);
        System.out.println(minimumCost);
    }
}
