/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg1;

import java.util.*;
/**
 *
 * @author anisha
 */
public class Q3 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(isPermutation(str1,str2));
        in.close();
    }

    private static boolean isPermutation(String str1, String str2) {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a,b);
    }
}
