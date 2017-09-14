/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class ConnectedCellsInGrid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matrix = new int[n][m];
        boolean[][] visitedOrZero = new boolean[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                matrix[i][j] = in.nextInt();
                if(matrix[i][j] == 0) {
                    visitedOrZero[i][j] = true;
                }
            }
        }
        
        int maxRegion = 0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(!visitedOrZero[i][j]) {
                    maxRegion = Math.max(maxRegion, countRegion(matrix,visitedOrZero,i,j, n , m));
                    
                }
            }
        }
        
        System.out.println(maxRegion);
        
    }

    private static int countRegion(int[][] matrix, boolean[][] visitedOrZero, int i, int j, int n, int m) {
        if(i<0 || j<0 ||  i>=n || j >=m || matrix[i][j] == 0 || visitedOrZero[i][j]) {
            return 0;
        }
        visitedOrZero[i][j] = true;
        System.out.println("Region Counted:"+i+","+j);
        return 1 + countRegion(matrix, visitedOrZero, i-1, j-1, n, m)
                + countRegion(matrix, visitedOrZero, i-1, j, n, m)
                + countRegion(matrix, visitedOrZero, i-1, j+1, n, m)
                + countRegion(matrix, visitedOrZero, i, j-1, n, m)
                + countRegion(matrix, visitedOrZero, i, j+1, n, m)
                + countRegion(matrix, visitedOrZero, i+1, j-1,n,m)
                + countRegion(matrix, visitedOrZero, i+1, j,n,m)
                + countRegion(matrix, visitedOrZero, i+1, j+1,n,m);
        
    }
}
