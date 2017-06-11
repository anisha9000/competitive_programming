/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eof.hackerrank;

import java.util.*;

/**
 *
 * @author anisha
 */
public class EofHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int i = 1;
        System.out.println(in.hasNext());
        while(in.hasNext()) {
            System.out.println(i+ " "+in.nextLine());
            i++;
        }
        in.close();
        
    }
    
}
