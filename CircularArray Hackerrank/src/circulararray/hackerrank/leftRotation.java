/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulararray.hackerrank;

import java.util.*;
/**
 *
 * @author anisha
 */
public class leftRotation {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        int[] temp = new int[k];
        k = k%n;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a_i<k) {
                temp[a_i] = a[a_i];
            }
        }
        for(int i = k;i<n;i++) {
            a[i-k] = a[i];
            //System.out.print("\n1st for:"+i+","+temp[i]);
        }
        int j = 0;
        for(int i=n-k;i<n;i++) {
            a[i] = temp[j++];
            //System.out.print("\n2nd for:"+(k+i)+","+temp[k+i]);
        }
        for(int a0 = 0; a0 < n; a0++){
            System.out.print(a[a0] +" ");
        }    
    }
    
}
