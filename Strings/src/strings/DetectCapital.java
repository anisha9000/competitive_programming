/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author anisha
 */
public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase()) ||
          word.equals(word.toLowerCase())) {
            return true;
        }
        
        if(Character.isUpperCase(word.charAt(0)) && word.substring(1,
                word.length()).equals(word.substring(1,word.length())
                        .toLowerCase())) {
            return true;
        }
        
        return false;
    }
}
