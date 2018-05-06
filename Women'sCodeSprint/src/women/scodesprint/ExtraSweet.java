/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package women.scodesprint;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class ExtraSweet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        boolean[] isTaken = new boolean[n];

        for (int a0 = 0; a0 < s; a0++) {

            int l = in.nextInt();
            int r = in.nextInt();
            long sum = 0;
            // Write Your Code Here
            for (int i = l; i <= r; i++) {
                if (!isTaken[i]) {
                    sum += i;
                    isTaken[i] = true;
                }
            }
            l--;
            while (l >= 0) {
                if (isTaken[l]) {
                    l--;
                } else {
                    sum += l;
                    isTaken[l] = true;
                    break;
                }
            }
            r++;
            while (r < n) {
                if (isTaken[r]) {
                    r++;
                } else {
                    sum += r;
                    isTaken[r] = true;
                    break;
                }
            }
            System.out.println(sum);
        }

        in.close();
    }
}
