/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.*;

/**
 * Leetcode
 * 
 * Now, given a list of words, each word can be written as a concatenation of the Morse code of each letter. For example, "cab" can be written as "-.-.-....-", (which is the concatenation "-.-." + "-..." + ".-"). We'll call such a concatenation, the transformation of a word.

Return the number of different transformations among all words we have.
 * @author anisha
 */
public class UniqueMorseCodeWords {
    
    public int uniqueMorseRepresentations(String[] words) {
        //create transformation
        // store in a hashset
        // return hashset size
        HashSet<String> transformationSet = new HashSet<>();
        for(String word:words) {
            transformationSet.add(createTransformation(word));
        }
        
        return transformationSet.size();
        
    }
    
    public String createTransformation(String word) {
        String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        
        StringBuilder sb = new StringBuilder();
        for(char i:word.toCharArray()) {
            sb.append(morseCode[i-'a']);
        }
        return sb.toString();
        
    }
}
