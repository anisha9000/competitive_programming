/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class AppendAndDelete {

    static String appendAndDelete(String s, String t, int k) {
        // Complete this function
        if (s.equals(t)) {
            return "Yes";
        }

        String result = "";
        int changesCount = 0;
        int currIndex = 0;
        while (currIndex < s.length() && currIndex < t.length()
                && s.charAt(currIndex) == t.charAt(currIndex)) {
            currIndex++;
        }

        int charToDelete = s.length() - currIndex;
        int charToAppend = t.length() - currIndex;

        charToAppend = (charToAppend > 0) ? charToAppend : 0;
        charToDelete = (charToDelete > 0) ? charToDelete : 0;

        int totalModification = charToAppend + charToDelete;
        if(totalModification > k) {
            // delete s upto currIndex and add t 
            result = "No";
        } else if(totalModification < k) {
            // can we delete the leftover elements in s and add them again?
            if((k-totalModification)%2 == 0) {
                // We can delete and append char in s
                result = "Yes";
            } else {
                result = "No";
            }
            
        } else {
            result = "Yes";
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();
        String result = appendAndDelete(s, t, k);
        System.out.println(result);
        in.close();
    }
}
