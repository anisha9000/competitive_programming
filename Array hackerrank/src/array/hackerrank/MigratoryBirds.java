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
public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] types = new int[n];
        int[] count = new int[5];
        int max = 0;
        for(int types_i=0; types_i < n; types_i++){
            int type = in.nextInt();
            types[types_i] = type;
            count[type-1]++;
            if(max<count[type-1]) {
                max = count[type-1];
            }
        }
        for(int i=0;i<5;i++) {
            if(max == count[i]) {
                System.out.println(i+1);
                break;
            }
        }
        
    }
    
}
