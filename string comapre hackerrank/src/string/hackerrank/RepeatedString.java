/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.*;

/**
 *
 * @author anisha
 */
public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        int modulo = (int)(n%(s.length()));
        int aInModulo = 0;
        int aOutSideModulo = 0;
        for(int i=0;i<s.length();i++) {
            if(i<modulo && s.charAt(i) == 'a') {
                aInModulo++;
            }
            if(i >= modulo && s.charAt(i) == 'a') {
                aOutSideModulo++;
            }
        }
        long ans = ((aInModulo + aOutSideModulo) * (n/s.length())) + aInModulo;
        System.out.println(ans);
    }
}
