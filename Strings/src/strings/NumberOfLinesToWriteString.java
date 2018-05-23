/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 * Leetcode
 * 
 * Each line has maximum width 100 units
 * how many lines have at least one character from S, and what is the width 
 * used by the last such line? 
 * @author anisha
 */
public class NumberOfLinesToWriteString {
    public int[] numberOfLines(int[] widths, String S) {
        int numLine = 0;
        int currWidth = 0;
        int len = S.length();
        for(int i=0;i<len;i++) {
            if(currWidth + widths[S.charAt(i)-'a'] <= 100) {
                currWidth += widths[S.charAt(i)-'a'];
            } else {
                numLine++;
                currWidth = widths[S.charAt(i)-'a'];
            }
        }
        
        if(currWidth < 100) {
            numLine++;
        }
        
        int[] result = new int[]{numLine, currWidth};
        return result;
    }
}
