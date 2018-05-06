/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;

/**
 *
 * @author anisha
 */
public class ArrayHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        pairInArray();
    }

    private static void pairInArray() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int pairCount = 0;
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++) {
            int count = 1;
            if(map.containsKey(c[i])) {
                count = map.get(c[i]);
                count++;
            } 
            map.put(c[i], count);
        }
        System.out.println(map);
        for(int elements : map.values()) {
            pairCount += (elements/2);
        }
        System.out.println(pairCount);
    }
    
}
