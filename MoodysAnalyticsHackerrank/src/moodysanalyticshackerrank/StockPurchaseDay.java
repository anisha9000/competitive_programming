/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moodysanalyticshackerrank;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class StockPurchaseDay {
    static HashMap<Integer, Integer> lastDay = new HashMap<>();
    static int stockPurchaseDay(int[] A, int xi) {
        // Complete this function
        int n = A.length;
        for(int i=n-1;i>=0;i--) {
            if(A[i]<= xi) {
                return i+1;
            }
        }
        
        return -1;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] A = new int[n];
        for(int A_i = 0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
            lastDay.put(A[A_i], A_i+1);
        }
        
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int xi = in.nextInt();
            int result = stockPurchaseDay(A, xi);
            System.out.println(result);
        }
        in.close();
    }
}
