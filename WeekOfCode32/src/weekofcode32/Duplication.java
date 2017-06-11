/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekofcode32;

import java.util.*;

/**
 *
 * @author Anisha
 */
public class Duplication {
    
    static String s = "0";

    static char duplication(int x){
        // Complete this function
        String t = new String();
        while(s.length() <= x) {
            //increase size if s.
            int index = 0;
            t = "";
            while(index < s.length()) {
                t += String.valueOf(1 - Character.getNumericValue(s.charAt(index++))); 
            }
            s += t;            
        }
        return s.charAt(x);
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            char result = duplication(x);
            System.out.println(result);
        }
    }
    
}
