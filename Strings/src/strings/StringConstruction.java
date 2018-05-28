/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class StringConstruction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            HashSet sSet = new HashSet();
            for(int i=0;i<s.length();i++) {
                if(!sSet.contains(s.charAt(i))) {
                    sSet.add(s.charAt(i));
                }
            }
            System.out.println(sSet.size());
            
        }
    }
}
