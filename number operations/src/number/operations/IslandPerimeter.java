/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

/**
 * leetcode
 * Determine the perimeter of the island
 * @author anisha
 */
public class IslandPerimeter {
    public int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        int n = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                if(grid[i][j] == 1) {
                    int surrounding = 0;
                    if(i > 0) {
                        surrounding += grid[i-1][j];
                    }
                    if(i< n-1) {
                        surrounding += grid[i+1][j];
                    }
                    if(j > 0) {
                        surrounding += grid[i][j-1];
                    }
                    if(j< m-1) {
                        surrounding += grid[i][j+1];
                    }
                    perimeter += (4 - surrounding);
                }
            }
        }
        return perimeter;
    }
}
