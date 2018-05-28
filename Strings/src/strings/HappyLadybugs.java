/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class HappyLadybugs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for (int g_i = 0; g_i < g; g_i++) {
            int n = in.nextInt();
            String b = in.next();
            int charCount[] = new int[27];
            for (int j = 0; j < n; j++) {
                if (b.charAt(j) == '_') {
                    charCount[0] += 1;
                } else {
                    charCount[b.charAt(j) - 64] += 1;
                }
            }
            
            boolean isBugAlone = false;
            for (int j = 1; j < 27; j++) {
                if (charCount[j] == 1) {
                    isBugAlone = true;
                    break;
                }
            }
            if (isBugAlone) {
                System.out.println("NO");
            } else if (charCount[0] == 0) {
                // No space. Check if already arranged
                boolean isBugArranged = true;
                for (int j = 1; j < n - 1; j++) {
                    if (b.charAt(j) != b.charAt(j + 1) && b.charAt(j) != b.charAt(j - 1)) {
                        isBugArranged = false;
                    }
                }
                if (isBugArranged) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            } else {
                System.out.println("YES");
            }
        }
    }
}
