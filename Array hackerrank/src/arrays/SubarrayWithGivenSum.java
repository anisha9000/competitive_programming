/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t= in.nextInt();
        for(int testCase=0;testCase<t;testCase++) {
            int n = in.nextInt();
            int s = in.nextInt();
            int a[] = new int[n];
            for(int i=0;i<n;i++) {
                a[i] = in.nextInt();
            }
            int i = 0, j=i;
            int sum = a[i];
            boolean hasSubArray = false;
            while(i<n-1 && j<n-1) {
                if(sum == s) {
                    hasSubArray = true;
                    break;
                } else if(sum>s) {
                    sum -= a[i];i++; 
                } else {
                    j++;
                    sum+=a[j];
                    
                }
                
            }
            System.out.println(hasSubArray?(i+1)+" "+(j+1):"-1");
        }
    }
}
