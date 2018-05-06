/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class PriyankaAndToys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] weight = new int[n];
        for(int i=0;i<n;i++) {
            weight[i] = in.nextInt();
        }
        Arrays.sort(weight);
        int cost = 1;
        int lastWeight = weight[0];
        for(int i=1;i<n;i++) {
            if(weight[i]>(lastWeight+4)) {
                cost++;
                lastWeight = weight[i];
            }
        }
        System.out.println(cost);
    }
}
