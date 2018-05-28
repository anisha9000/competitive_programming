/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 * Leetcode 
 * 
 * Given a string, you need to reverse the order of characters in each word 
 * within a sentence while still preserving whitespace and initial word order.
 * @author anisha
 */
public class ReverseWordsInStringIII {
    public String reverseWords(String s) {
        String[] wordList = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word:wordList) {
            StringBuilder revWord = reverseWord(word);
            sb.append(revWord+" ");
        }
        
        sb.deleteCharAt(sb.length()-1);
        return sb.toString();
    }
    
    public StringBuilder reverseWord(String s) {
        StringBuilder reversed = new StringBuilder(s);
        reversed = reversed.reverse();
        return reversed;
    }
}
