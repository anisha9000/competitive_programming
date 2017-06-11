/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package betweentwosets.hackerrank;

import java.util.*;

/**
 *
 * @author anisha
 */
public class BetweentwosetsHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        int x = Integer.MAX_VALUE;
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(x> b[b_i]) {
                x = b[b_i];
            }
        }
        int count = 0;
        while(x>0) {
            boolean flagA = true, flagB = true;
            for(int i=0;i<n;i++) {
                if(x%a[i] != 0) {
                    flagA = false;
                    break;
                }
            }
            for(int i=0;i<m;i++) {
                if(b[i]%x != 0) {
                    flagB = false;
                    break;
                }
            }
            if(flagA && flagB) {
                count++;
            }
            x--;
        }
        System.out.println(count);
        in.close();
        
    }
    
}
