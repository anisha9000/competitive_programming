/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class MinDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int dist = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++) {
            for(int j=i+1;j<n;j++) {
                if(A[i] == A[j] && dist>Math.abs(i-j)) {
                    dist = Math.abs(i-j);
                }
            }
        }
        System.out.println((dist==Integer.MAX_VALUE)?"-1":dist);
        in.close();
    }
}
