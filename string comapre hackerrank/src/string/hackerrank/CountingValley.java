/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.*;

/**
 *
 * @author anisha
 */
public class CountingValley {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String steps = in.next();
        in.close();
        int sea = 0, currentLevel = 0;
        int valleyCount = 0;
        for(int i=0;i<n;i++) {
            if(steps.charAt(i) == 'U') {
                currentLevel++;
            } else {
                if(currentLevel == sea) {
                    valleyCount++;
                }
                currentLevel--;
            }
        }
        System.out.println(valleyCount);
    }
}
