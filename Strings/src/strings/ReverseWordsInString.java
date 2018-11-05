/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Arrays;

/**
 *
 * @author anisha
 */
public class ReverseWordsInString {
    public static String reverseWords(String s) {
        s = s.trim();
        String[] stringList = s.split(" ");
        System.out.println(Arrays.asList(stringList));
        StringBuilder sb = new StringBuilder();
        for(int i=stringList.length-1; i>=0;i--) {
            if(stringList[i].trim().length() == 0) {
                continue;
            }
            System.out.println("i:"+ i);
            System.out.println("string:"+stringList[i]+".");
            sb.append(stringList[i].trim());
            if(i != 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
    }
    
    public static void main(String[] args) {
        System.out.println(reverseWords(" b ")+".");
    }
    
}
