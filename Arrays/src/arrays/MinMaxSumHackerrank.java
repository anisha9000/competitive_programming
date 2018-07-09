/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.*;

/**
 *
 * @author anisha
 */
public class MinMaxSumHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = 5;
        int[] a = new int[n];
        long totalSum = 0;
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
            totalSum += a[i];
        }
        in.close();
        Arrays.sort(a);
        for(int i=0;i<n;i++) {
            System.out.print(a[i]+ " ");
        }
        long minSum = totalSum - a[n-1];
        long maxSum = totalSum - a[0];
        System.out.println(minSum+" "+maxSum);
        
    }
    
}
