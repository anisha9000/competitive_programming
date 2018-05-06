/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class PermutingTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int i=0;i<q;i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            inputArray(a,n,in);
            inputArray(b,n, in);
            
            Arrays.sort(a);
            Arrays.sort(b);
            
            boolean flag = checkPermutation(a,b, k);
            System.out.println(flag?"YES":"NO");
        }
    }

    private static void inputArray(int[] a, int n, Scanner in) {
        for(int i=0;i<n;i++) {
            a[i] = in.nextInt();
        }
    }

    private static boolean checkPermutation(int[] a, int[] b, int k) {
        boolean flag = true;
        int n = a.length;
        for(int i=0;i<n;i++) {
            if(a[i]+b[n-i-1]<k) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}
