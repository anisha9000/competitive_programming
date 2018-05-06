/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class FindTheMedian {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n/2]);
    }
}
