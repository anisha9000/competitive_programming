/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.hackerrank;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class PermutationPossibility {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int[] s = new int[m];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        boolean isPermutationPossible = true;
        for(int s_i=0; s_i < m; s_i++){
            s[s_i] = in.nextInt();
            if(map.containsKey(s[s_i])) {
                isPermutationPossible = false;
                
            } else {
                map.put(s[s_i], 1);
            }
            
        }
        System.out.println(isPermutationPossible?"YES":"NO");
        
    }
}
