/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 * Hackerrank
 * Given an array of  integers, find and print its number of negative 
 * subarrays on a new line.
 * @author anisha
 */
public class SubArrays {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++) {
            array[i] = in.nextInt();
        }
        //TODO optimize. You don't need a 2-d array
        int[][] sum = new int[n][n];
        int totalNeg = 0;
        sum[0][0] = array[0];
        if(sum[0][0] < 0) {
            totalNeg++;
        }
        for(int i=1;i<n;i++) {
            sum[0][i] = (sum[0][i-1] + array[i]);
            if(sum[0][i] < 0) {
                totalNeg++;
            }
        }
        for(int i=1;i<n;i++) {
            for(int j=i;j<n;j++) {
                sum[i][j] = sum[i-1][j] - sum[i-1][i-1];
                if(sum[i][j] < 0) {
                    totalNeg++;
                }
            }
        }
        System.out.println(totalNeg);
    }
}
