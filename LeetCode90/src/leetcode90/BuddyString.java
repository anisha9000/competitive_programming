/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode90;

/**
 * Leetcode
 * 
 * Given two strings A and B of lowercase letters, return true if and only 
 * if we can swap two letters in A so that the result equals B.
 * @author anisha
 */
public class BuddyString {

    /**
     * @param args the command line arguments
     */
    public boolean buddyStrings(String A, String B) {
        if(A.length() != B.length()) {
            return false;
        }
        int[] charCountA = new int[26];
        int[] charCountB = new int[26];
        int n = A.length();
        int diffCounter = 0;
        for(int i=0;i<n;i++) {
            if(A.charAt(i) != B.charAt(i)) {
                diffCounter++;
            }
            charCountA[A.charAt(i)-'a']++;
            charCountB[B.charAt(i)-'a']++;
        }
        if(diffCounter == 0){
            //check if any two char are same
            for(int i=0;i<26;i++) {
                if(charCountA[i] >=2) {
                    return true;
                }
            }
            return false;
        } else if(diffCounter == 2) {
            for(int i=0;i<26;i++) {
                if(charCountA[i] != charCountB[i]) {
                    return false;
                }
            }
            return true;
        } else {
            return false;
        }
    }
    
    
}
