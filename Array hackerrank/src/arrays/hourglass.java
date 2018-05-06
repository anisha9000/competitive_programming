/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.*;
/**
 *
 * @author anisha
 */
public class hourglass {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = 6;
        int[][] a = new int[n][n];
        for(int i=0; i < n; i++){
            for(int j=0; j < n; j++){
                a[i][j] = in.nextInt();
            }
        }
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i<=(n-3);i++) {
            for(int j=0;j<=(n-3);j++) {
                int sum = a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + 
                        a[i+2][j] + a[i+2][j+1] + a[i+2][j+2];
                if(sum > maxSum) {
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
        in.close();
    }
}
