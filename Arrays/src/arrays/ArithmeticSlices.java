/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 * Leetcode
 * A zero-indexed array A consisting of N numbers is given. A slice of that array is any pair of integers (P, Q) such that 0 <= P < Q < N.
 * A slice (P, Q) of array A is called arithmetic if the sequence:
 * 
 * A[P], A[p + 1], ..., A[Q - 1], A[Q] is arithmetic. In particular, this means that P + 1 < Q.
 * The function should return the number of arithmetic slices in the array A.
 * @author anisha
 */
public class ArithmeticSlices {
    public int numberOfArithmeticSlices(int[] A) {
        // first generate a difference array
        if(A.length < 3) {
            return 0;
        }
        int[] diff = new int[A.length-1];
        for(int i=0;i<diff.length;i++) {
            diff[i] = A[i+1] - A[i];
        }
        
        int count = 0;
        // keep track of start and end with same diff. 
        int start = 0;
        int curr = start+1;
        while(start <= diff.length-2 && curr<diff.length) {
            if(diff[start] == diff[curr]) {
                curr++;
            } else {
                if(curr-start+1 >= 3) {
                    int windowLen = curr-start+1;
                    count+= (windowLen-2)*(windowLen-1)/2;
                }
                start = curr;
                curr++;
            }
        }
        if(curr>=diff.length && diff[start] == diff[curr-1] && curr-start+1 >= 3) {
            int windowLen = curr-start+1;
            count+= (windowLen-2)*(windowLen-1)/2;
        }
        
        return count;
    }
}
