/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci_8;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Cci_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(findFibonacci(n));
    }

    private static long findFibonacci(int n) {
        if(n<=1) {
            return 1;
        } 
        return(n*findFibonacci(n-1));
        
    }
    
}
