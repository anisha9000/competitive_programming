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
public class CircularArrayHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        int[] temp = new int[n];
        k = n%k;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for(int i = 0;i<k;i++) {
            temp[i] = a[n-k+i];
            //System.out.print("\n1st for:"+i+","+temp[i]);
        }
        for(int i=0;i<n-k;i++) {
            temp[k+i] = a[i];
            //System.out.print("\n2nd for:"+(k+i)+","+temp[k+i]);
        }
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(temp[m]);
        }     
        
    }
    
}
