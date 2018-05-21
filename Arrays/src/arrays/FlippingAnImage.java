/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * Leetcode
 * 
 * Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
* 
 * @author anisha
 */
public class FlippingAnImage {
    // TODO: we can skip rows which are anagrams
    // TODO: we can make flip and invert separate
    
    public int[][] flipAndInvertImage(int[][] A) {
        int row = A.length;
        int col = A[0].length;
        int [][] result = new int[row][col];
        
        for(int i=0;i<row;i++) {
            for(int j=0;j<col;j++) {
                result[i][col-j-1] = Math.floorMod(A[i][j]-1, 2);
            }
            
        }
        
        return result;
        
    }
}
