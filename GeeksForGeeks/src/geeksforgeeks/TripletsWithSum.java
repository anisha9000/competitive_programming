/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksforgeeks;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class TripletsWithSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0) {
            int n = in.nextInt();
            int sum = in.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(isTriplet(arr,n, sum));
        }
    }

    private static int isTriplet(int[] arr, int n, int x) {
        Arrays.sort(arr);
        for(int i=0;i<n-3;i++) {
            int requiredSum = x-arr[i];
            HashSet<Integer> map = new HashSet<>();
            for(int j=i+1;j<n;j++) {
                if(map.contains(requiredSum-arr[j])) {
                    return 1;
                } else {
                    map.add(arr[j]);
                }
            }
        }
        return 0;
    }
}
