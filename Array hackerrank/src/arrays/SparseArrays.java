/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;
import java.util.*;
/**
 *
 * @author Anisha
 */
public class SparseArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> arrayMap = new HashMap<>();
        for(int i=0;i<n;i++) {
            String temp = in.next();
            if(arrayMap.containsKey(temp)) {
                arrayMap.put(temp, arrayMap.get(temp)+1);
            } else {
                arrayMap.put(temp, 1);
            }
        }
        int q = in.nextInt();
        for(int i=0;i<q;i++) {
            String query = in.next();
            if(arrayMap.containsKey(query)) {
                System.out.println(arrayMap.get(query));
            } else {
                System.out.println("0");
            }
        }
        in.close();
    }
}
