/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfviewer.hacerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author anisha
 */
public class PdfviewerHacerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        in.close();
        int maxHeight = 0;
        for(int i=0;i<word.length();i++) {
//            System.out.println(word.charAt(i) - 97);
            if(maxHeight < h[word.charAt(i) - 97]) {
                maxHeight = h[word.charAt(i) - 97];
            }
        }
        System.out.println(maxHeight*word.length());
        
    }
    
}
