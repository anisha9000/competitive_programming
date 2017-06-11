/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.hackerrank;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class ServiceLane {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] width = new int[n];
        for(int i=0;i<n;i++) {
            width[i] = in.nextInt();
        }
        for(int k=0;k<t;k++) {
            int i = in.nextInt();
            int j = in.nextInt();
            int maxType = Integer.MAX_VALUE;
            for(int l = i;l<=j;l++) {
                if(maxType > width[l]) {
                    maxType = width[l];
                }
                if(maxType == 1) {
                    break;
                }
            }
            System.out.println(maxType);
        }
        in.close();
    }
}
