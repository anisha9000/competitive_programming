/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations.hackerrank;

import java.util.*;
/**
 *
 * @author anisha
 */
public class BeautifulDay {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        int k = in.nextInt();
        in.close();
        int count = 0;
        for(int x=i;x<=j;x++){
            StringBuilder strX = new StringBuilder(String.valueOf(x));
            StringBuilder strRev = strX.reverse();
            int rev = Integer.parseInt(strRev.toString());
            if(Math.abs(rev-x) % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
