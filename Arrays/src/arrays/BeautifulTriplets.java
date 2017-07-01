/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class BeautifulTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int tripletCount = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (a[j] - a[i] == d) {
                    for (int k = j + 1; k < n; k++) {
                        if (a[k] - a[j] == d) {
                            tripletCount++;
                        } else if(a[k]-a[j] > d) {
                            break;
                        }
                    }
                } else if (a[j]-a[i]>d) {
                    break;
                }

            }
        }
        System.out.println(tripletCount);
    }
}
