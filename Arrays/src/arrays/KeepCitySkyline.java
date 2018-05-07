/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author anisha
 */
public class KeepCitySkyline {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int rowCount = grid.length;
        int colCount = grid[0].length;
        
        int[] maxRowHeight = new int[rowCount];
        int[] maxColHeight = new int[colCount];
        
        //Find current skyline
        for(int i=0;i<rowCount; i++) {
            for(int j=0;j<colCount;j++) {
                if(grid[i][j] > maxRowHeight[i]) {
                    maxRowHeight[i] = grid[i][j];
                }
                
                if(grid[i][j] > maxColHeight[j]) {
                    maxColHeight[j] = grid[i][j];
                }   
            } 
        }
        
        //update skyline
        int maxHeight = 0;
        for(int i=0;i<rowCount; i++) {
            for(int j=0;j<colCount;j++) {
                int newHeight = Math.min(maxRowHeight[i], maxColHeight[j]);
                maxHeight += (newHeight- grid[i][j]);
            } 
        }
        
        return maxHeight;
    }
}
