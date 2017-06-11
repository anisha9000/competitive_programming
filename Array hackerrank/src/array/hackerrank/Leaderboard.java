/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.hackerrank;

import java.math.*;
import java.util.*;
/**
 *
 * @author anisha
 */
public class Leaderboard {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> scores = new ArrayList();
        for(int i=0;i<n;i++) {
            int tempScore = in.nextInt();
            if(!scores.contains(tempScore)) {
                scores.add(tempScore);
            }
        }
        int m = in.nextInt();
        Collections.reverse(scores);
        for(int i=0;i<m;i++) {
            int aliceScore = in.nextInt();
            int index = Collections.binarySearch(scores, aliceScore);
            System.out.println(index >= 0 ? scores.size() - index : scores.size() - ~index + 1);
        }
        in.close();
    }
}
