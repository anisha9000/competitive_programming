/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations.hackerrank;

import java.util.*;
/**
 *
 * @author anisha
 */
public class BitwiseAnd {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            int n = in.nextInt();
            int k = in.nextInt();
            int max = Integer.MIN_VALUE;
            for(int a=0;a<n;a++) {
                for(int b=a+1;b<n;b++) {
                    int temp = a&b;
                    if(max<temp && temp<k) {
                        max = temp;
                    }
                }
            }
            System.out.println(max);
        }
        in.close();
        
    }
    
}
