/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class ModularGame {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[p];
        for(int a_i=0; a_i < p; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[q];
        for(int b_i=0; b_i < q; b_i++){
            b[b_i] = in.nextInt();
        }
        
        int shout = Integer.MAX_VALUE;
        int s = 0;
        for(int i=0;i<p;i++) {
            for(int j=0;j<q;j++) {
                if((a[i]+b[j]+s) %n != 0 && s<shout) {
                    shout = s;
                }
                s++;
            }
        }
        System.out.println(shout);
        
    }
}
