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
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        scan.close();
        methodA(word);
        methodB(word);
    }
    
    // time complexity O(n).
    static void methodA(String word) {
        boolean flag = false;
        HashMap<Character, Boolean> map = new HashMap<Character, Boolean>();
        for(int i=0;i<word.length();i++) {
            if(map.containsKey(word.charAt(i))) {
                flag = true;
                break;
            }
            map.put(word.charAt(i), true);
        }
        if(flag) {
            System.out.println("Similar characters");
        } else {
            System.out.println("Unique characers");
        }
    }
    
    //time complexity O(n2)
    static void methodB(String word) {
        boolean flag=false;
        for(int i=0;i<word.length();i++) {
            for(int j=i+1;j<word.length();j++) {
                if(word.charAt(i) == word.charAt(j)) {
                    flag = true;
                    break;
                }
            }
            if(flag) {
                break;
            }
        }
        if(flag) {
            System.out.println("Similar characters");
        } else {
            System.out.println("Unique characers");
        }
    }
    
}
