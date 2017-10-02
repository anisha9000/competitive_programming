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
public class DynamicArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        ArrayList<ArrayList<Integer>> seqList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            seqList.add(new ArrayList<>());
        }
        int lastAns = 0;
        for (int i = 0; i < q; i++) {
            int queryOption = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            ArrayList seq = seqList.get((x ^ lastAns) % n);
            switch (queryOption) {
                case 1:
                    seq.add(y);
                    break;
                case 2:
                    lastAns = (int)seq.get(y%seq.size());
                    System.out.println(lastAns);
                    break;
            }
        }
        in.close();

    }

}
