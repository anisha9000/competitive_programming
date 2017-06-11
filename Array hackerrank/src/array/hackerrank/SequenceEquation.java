/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.hackerrank;

import java.util.*;
/**
 *
 * @author anisha
 */
public class SequenceEquation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> seq = new ArrayList<>();
        for(int i=0;i<n;i++) {
            seq.add(in.nextInt());
        }
        for(int i=1;i<=n;i++) {
            int indexTemp = seq.indexOf(i) + 1;
            System.out.println(seq.indexOf(indexTemp)+1);
        }
        in.close();
    }
}
