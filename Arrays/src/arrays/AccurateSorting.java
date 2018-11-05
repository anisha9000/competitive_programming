/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class AccurateSorting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[] a = new int[n];
            for(int a_i=0; a_i < n; a_i++){
                a[a_i] = in.nextInt();
            }
            boolean isSortPossible = true;
            for(int i=0;i<n-1;i++) {
                if(a[i] > a[i+1] ) {
                    if(a[i] - a[i+1] > 1) {
                        isSortPossible = false;
                        break;
                    } else {
                        int temp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = temp;
                    }
                }
            }
            if(isSortPossible) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
            // Write Your Code Here
        }
    }
}
