/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appleorange.hackerrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author anisha
 */
public class AppleorangeHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        int countApple = 0, countOrange = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
            //System.out.println((a + apple[apple_i]) + ","+(t - a - apple[apple_i]));
            if(apple[apple_i] > 0 
                    && (a + apple[apple_i] - s >= 0) 
                    && (t - a - apple[apple_i] >= 0)) {
                countApple++;
            }
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
            //System.out.println((t - b + orange[orange_i])+","+(b + orange[orange_i] - s));
            if(orange[orange_i] < 0 
                    && (t - b - orange[orange_i] >= 0)
                    && (b + orange[orange_i] - s >= 0) 
                    ) {
                countOrange++;
            }
        }
        in.close();
        System.out.println(countApple);
        System.out.println(countOrange);
    }
    
}
