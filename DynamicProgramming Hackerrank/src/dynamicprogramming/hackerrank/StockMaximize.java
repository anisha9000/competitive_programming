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
public class StockMaximize {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] arr = new int[n];
            boolean[] willInc = new boolean[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int lastScanned = arr[n-1];
            for(int i = n-1;i>=0;i--) {
                willInc[i] = (arr[i]<lastScanned)?true:false;
                lastScanned = Math.max(arr[i], lastScanned);
            }
            long soldValue = 0;
            long soldCount = 0;
            long boughtValue = 0;
            long boughtCount = 0;
            for(int i=0;i<n;i++) {
                if(willInc[i] == false) {
                    //sell whatever you have
                    soldCount+=boughtCount;
                    soldValue += (boughtCount*arr[i]);
                    boughtCount = 0;
                }
                if(willInc[i] == true) {
                    boughtCount += 1;
                    boughtValue += arr[i];
                }
            }
            int profit = (int) (soldValue - boughtValue);
            System.out.println((profit>0)?profit:0);
        }
        in.close();
    }
}
