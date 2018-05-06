/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg1;

import java.util.*;

/**
 *
 * @author anisha
 */
public class Q6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                a[i][j] = in.nextInt();
            }
        }
        method1(a, n);
        
        in.close();
    }

    private static void method1(int[][] a, int n) {
        int b[][] = new int[n][n];
        int newCol = n-1;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                b[j][newCol] = a[i][j];
            }
            newCol--;
        }
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
