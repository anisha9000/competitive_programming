/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

/**
 * Leetcode
 * Given a non negative integer number num. For every numbers i in the range 
 * 0 ≤ i ≤ num calculate the number of 1's in their binary representation and 
 * return them as an array.
 * @author anisha
 */
public class CountingBits {
    public int[] countBits(int num) {
        int[] result = new int[num+1];
        for(int i=0;i<=num;i++) {
            String bitRepresentation = Integer.toBinaryString(i);
            bitRepresentation = bitRepresentation.replace("0","");
            result[i] = bitRepresentation.length();
        }
        return result;
    }
}
