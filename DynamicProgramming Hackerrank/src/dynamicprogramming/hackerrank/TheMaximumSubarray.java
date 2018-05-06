/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dynamicprogramming.hackerrank;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class TheMaximumSubarray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int testCase = 0; testCase < t; testCase++) {
            int n = in.nextInt();
            int a[] = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = in.nextInt();
            }
            getMaxArrayAndSeq(a);
        }
    }

    private static void getMaxArrayAndSeq(int[] a) {
        int n = a.length;
        int maxArray[] = new int[n];
        int maxSeq[] = new int[n];
        
        maxArray[0] = a[0];
        maxSeq[0] = a[0];
        
        for(int j=1;j<n;j++) {
            maxArray[j] = Math.max(maxArray[j-1]+ a[j], a[j]);
            maxSeq[j] = Math.max(maxSeq[j-1]+a[j],maxSeq[j-1]);
        }
        int maxArraySum = Integer.MIN_VALUE;
        int maxSeqSum = Integer.MIN_VALUE;
        for(int i=1;i<=n;i++) {
            if(maxArraySum<maxArray[i]) {
                maxArraySum = maxArray[i];
            }
            if(maxSeqSum<maxSeq[i]) {
                maxSeqSum = maxSeq[i];
            }
        }
//        for(int i=0;i<n;i++) {
//            System.out.print(maxArray[i]+" ");
//        }
        System.out.println(maxArraySum+" "+maxSeqSum);
        
    }
}
