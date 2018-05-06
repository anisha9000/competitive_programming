/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class EqualToProduct {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            int n = in.nextInt();
            int p = in.nextInt();
            int a[] = new int[n];
            for(int j=0;j<n;j++) {
                a[j] = in.nextInt();
            }
            //Sort the array
            Arrays.sort(a);
            boolean hasProduct = false;
            for(int j=0;j<n;j++) {
                for(int k=j+1;k<n;k++) {
                    if(a[j]*a[k] == p) {
                        System.out.println("Yes");
                        hasProduct = true;
                        break;
                    } else if(a[j]*a[k]>p) {
                        break;
                    }
                }
                if(hasProduct) {
                    break;
                }
            }
            if(!hasProduct) {
                System.out.println("No");
            }
        }
    }
}
