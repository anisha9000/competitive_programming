/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grade.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author anisha
 */
public class GradeHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            int grade = in.nextInt();
            // your code goes here
            if(grade < 38) {
                System.out.println(grade);
            } else {
                int nextGrade = grade;
                while(nextGrade%5!=0) {
                    nextGrade++;
                }
                if(nextGrade-grade < 3) {
                    System.out.println(nextGrade);
                } else {
                    System.out.println(grade);
                }
            }
        }
        in.close();
    }
    
}
