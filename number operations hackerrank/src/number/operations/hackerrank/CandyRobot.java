/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations.hackerrank;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class CandyRobot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] c = new int[t];
        for(int c_i=0; c_i < t; c_i++){
            c[c_i] = in.nextInt();
        }
        int i = 0;
        int bowl = n;
        int countAdded = 0;
        do {
            
            bowl -= c[i++];
            if(bowl<5 && i<t) {
                countAdded += (n-bowl);
                bowl += (n-bowl);                
            }
        } while(i<t);
        // your code goes here
        System.out.println(countAdded);
    }
}
