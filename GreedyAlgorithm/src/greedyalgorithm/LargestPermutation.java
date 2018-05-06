/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class LargestPermutation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
            map.put(a[i], i);
        }
        int currSwap = 0;
        int currIndex = 0;
        int maxNumber = n;
        while(currSwap < k && currIndex<n) {
            if(a[currIndex] < maxNumber) {
                int temp = a[currIndex];
                int maxIndex = map.get(maxNumber);
                a[currIndex] = a[maxIndex];
                a[maxIndex] = temp;
                map.put(a[currIndex], currIndex);
                map.put(temp, maxIndex);
                currSwap++;
            } 
            currIndex++;
            maxNumber--;
        }
        
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+ " ");
        }
        
    }
}
