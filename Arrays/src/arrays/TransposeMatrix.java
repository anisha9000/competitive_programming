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
public class TransposeMatrix {
    public int[][] transpose(int[][] A) {
        if(A == null || A.length == 0 || A[0].length == 0) {
            return null;
        }
        int[][] transposeMatrix = new int[A[0].length][A.length];
        for(int i=0;i<A.length;i++) {
            for(int j=0;j<A[i].length;j++) {
                transposeMatrix[j][i] = A[i][j];
            }
        }
        
        return transposeMatrix;
    }
}
