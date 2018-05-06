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
public class StringHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //stringIntro("java", "java");
        //printSubstring("Helloworld", 3,7);
        isAnagram("anagram","margana");
        //isPalindrome(str);
        //minMaxSubString();
        
    }
    
    public static void isPalindrome(String str) {
        String reverse = new StringBuilder(str).reverse().toString();
        if(reverse.equals(str)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
    
    public static void printSubstring(String str, int start, int end) {
        System.out.println(str.substring(start,end));
    }
    
    public static void stringIntro(String a, String b) {
        System.out.println(a.length()+b.length());
        if(a.compareTo(b) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        System.out.println(a + " " + b);
    }

    private static void minMaxSubString() {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        int k = in.nextInt();
        String maxStr = str.substring(0, k);
        String minStr = str.substring(0, k);
        for(int i=0;i<str.length()-k+1;i++) {
            if(maxStr.compareTo(str.substring(i, i+k)) < 0) {
                maxStr = str.substring(i, i+k);
            }
            if(minStr.compareTo(str.substring(i, i+k)) > 0) {
                minStr = str.substring(i, i+k);
            }
        }
        System.out.println(minStr);
        System.out.println(maxStr);
        in.close();
    }
    
    private static void isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        
        // Could have used Arrays.equals() instead of all this code!
        if(arr1.length != arr2.length) {
            System.out.println("Not Anagrams");
        } else {
            boolean isAnagram = true;
            for(int i=0;i<arr1.length;i++) {
                if(arr1[i] != arr2[i]) {
                    isAnagram = false;
                    break;
                }
            }
            if(isAnagram) {
                System.out.println("Anagrams");
            } else {
                System.out.println("Not Anagrams");
            }
        }
        
    }
    
}
