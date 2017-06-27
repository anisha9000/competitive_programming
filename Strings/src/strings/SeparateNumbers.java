/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class SeparateNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
            long firstx = (long)-1;
            boolean isBeautiful = false;
            
            for(int i=1;i<=s.length()/2;++i) {
                Long subString = Long.parseLong(s.substring(0, i));
                firstx = subString;
                
                StringBuilder newString = new StringBuilder(subString.toString());
                subString++;
                while(newString.length()< s.length()) {
                    newString.append(subString++);
                }
                if(newString.toString().equals(s)) {
                    isBeautiful = true;
                    break;
                }
            }
            System.out.println(isBeautiful?"YES "+firstx:"NO");
            
        }
    }
}
