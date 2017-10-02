/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitycodesprint3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class EruptingVolcanoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int area[][] = new int[n][n];
        
        for(int a0 = 0; a0 < m; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int w = in.nextInt();
            fillPowerInCells(area, x,y,w, n);
            // Write Your Code Here
        }
        
        System.out.println(findMax(area, n));
        in.close();
    }
    
    private static void fillPowerInCells(int[][] area, int x, int y, int w, int n ) {
        int index = 1;
        area[x][y] += (w--);
        while(w > 0) {
            for(int k=(y-index);k<=(y+index);k++) {
                if(k<0) {
                    continue;
                }
                if(k>=n) {
                    break;
                }
                if(x-index >=0) {
                    area[x-index][k] += w;
                }
                if(x+index < n) {
                    area[x+index][k] += w;
                }
                
            }
            
            for(int k=(x-index+1);k<=(x+index-1);k++) {
                if(k<0) {
                    continue;
                }
                if(k>=n) {
                    break;
                }
                if(y-index >= 0) {
                    area[k][y-index] += w;
                }
                
                if(y+index < n) {
                    area[k][y+index] += w;
                }
                
            }
            index++;
            w--;
        }
    }
    
    private static int findMax(int[][] area, int n) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(max<area[i][j]) {
                    max = area[i][j];
                }
            }
        }
        return max;
    }

    
}
