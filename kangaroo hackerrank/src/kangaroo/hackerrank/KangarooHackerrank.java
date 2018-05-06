/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kangaroo.hackerrank;

import java.util.*;

/**
 *
 * @author anisha
 */
public class KangarooHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        in.close();
        if((x1 < x2 && v1<v2) || (x2<x1 && v2<v1)) {
            System.out.println("NO");
        } else {
            float n = ((float)x2-x1) / (v1-v2);
//            System.out.println(x2-x1);
//            System.out.println(v1-v2);
//            System.out.println(n);
//            System.out.println((int)n);
//            System.out.println(n == (int)n);
            if(n == (int)n) {
                System.out.println("YES");
            } else {
                System.out.println("NO" );
            }
        }
    }
    
}
