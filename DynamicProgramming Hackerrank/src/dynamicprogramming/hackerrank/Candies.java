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
public class Candies {
    static int candies(int n, int[] arr) {
        // Complete this function
        int candy[] = new int[n];
        candy[0] = 1;
        for(int i=1;i<n;i++) {
            if(arr[i]>arr[i-1]) {
                candy[i] = candy[i-1]+1;
            } else {
                candy[i] = 1;
            }
        }
        
        for(int i=n-2;i>=0;i--) {
            if(arr[i]>arr[i+1]) {
                candy[i] = Integer.max(candy[i+1]+1, candy[i]);
            } 
        }
        
        int sum = 0;
        for(int i=0;i<n;i++) {
            sum+= candy[i];
        }
        
        return sum;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = candies(n, arr);
        System.out.println(result);
        in.close();
    }
}
