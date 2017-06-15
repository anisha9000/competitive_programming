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
public class MinimumAbsoluteDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int minDiff = Integer.MAX_VALUE;
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            if (Math.abs(a[i] - a[i+1]) < minDiff) {
                minDiff = Math.abs(a[i] - a[i+1]);
            }
        }

//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (Math.abs(a[i] - a[j]) < minDiff) {
//                    minDiff = Math.abs(a[i] - a[j]);
//                }
//            }
//        }
        System.out.println(minDiff);
        // your code goes here
    }
}
