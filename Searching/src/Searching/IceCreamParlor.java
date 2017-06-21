/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Searching;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class IceCreamParlor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int query = 0; query < t; query++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int[] iceCreams = new int[n];
            int[] original = new int[n];
 
            for (int i = 0; i < n; i++) {
                iceCreams[i] = in.nextInt();
                original[i] = iceCreams[i];
            }

            Arrays.sort(iceCreams);

            int i = 0, j = n - 1;
            int sum = 0;
            do {
                sum = iceCreams[i] + iceCreams[j];

                if (sum > m) {
                    j--;
                }
                if (sum < m) {
                    i++;
                }
            } while (sum != m && i < n && j >= 0);

            int count = 0;
            for(int k=0;k<n;k++) {
                if(original[k] == iceCreams[i] || original[k]==iceCreams[j]) {
                    System.out.print(k+1+" ");
                    
                    count++;
                    if(count == 2) {
                        break;
                    }
                }
                
            }
            System.out.println("");
            
        }
    }

}