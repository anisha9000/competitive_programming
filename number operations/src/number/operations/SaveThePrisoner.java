/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.util.*;
/**
 *
 * @author anisha
 */
public class SaveThePrisoner {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            int n = in.nextInt();
            int m = in.nextInt();
            int s = in.nextInt();
            
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        
        }
        in.close();
    }
    
    static int saveThePrisoner(int n, int m, int s){
        // Complete this function
        if((m+s-1)%n == 0) {
            return n;
        }
        return ((m+s-1)%n);
    }   
}
