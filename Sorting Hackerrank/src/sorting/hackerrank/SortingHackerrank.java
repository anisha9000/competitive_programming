/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.hackerrank;

import java.util.*;

/**
 *
 * @author anisha
 */
public class SortingHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) {
            a[i] = scan.nextInt();
        }
        int swapCount = bubbleSort(a, n);
        System.out.println("Array is sorted in "+swapCount+" swaps.");
        System.out.println("First Element: "+ a[0]);
        System.out.println("Last Element: "+ a[n-1]);
        scan.close();
    }

    private static int bubbleSort(int[] a, int n) {
        int swapCount = 0;
        for(int i=0;i<n;i++) {
            for(int j=0; j<n-1; j++) {
                if(a[j]> a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swapCount++;
                }
            }
        }
        return swapCount;
    }
    
}
