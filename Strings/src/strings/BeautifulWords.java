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
public class BeautifulWords {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String w = in.next();
        boolean isBeautiful = true;
        int length = w.length();
        for(int i=0;i<length - 1;i++) {
            if(w.charAt(i) == w.charAt(i+1)) {
                isBeautiful = false;
                break;
            }
            char temp = w.charAt(i);
            if(temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' ||
                    temp == 'u' || temp == 'y') {
                char next = w.charAt(i+1);
                if(next == 'a' || next == 'e' || next == 'i' || next == 'o' ||
                    next == 'u' || next == 'y') {
                    isBeautiful = false;
                    break;
                }
            }
        }
        if(isBeautiful) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        // Print 'Yes' if the word is beautiful or 'No' if it is not.
    }
}
