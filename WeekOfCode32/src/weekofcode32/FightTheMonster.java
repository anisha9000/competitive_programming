/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package weekofcode32;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Anisha
 */
public class FightTheMonster {

    static int getMaxMonsters(int n, int hit, int t, int[] h) {
        // Complete this function
        int killCount = 0;
        Arrays.sort(h);
        int monsterIndex = 0;
        while (t > 0 && monsterIndex < n) {
            h[monsterIndex] -= hit;
            if (h[monsterIndex] <= 0) {
                killCount++;
                monsterIndex++;
            }
            t--;
        }
        return killCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hit = in.nextInt();
        int t = in.nextInt();
        int[] h = new int[n];
        for (int h_i = 0; h_i < n; h_i++) {
            h[h_i] = in.nextInt();
        }
        int result = getMaxMonsters(n, hit, t, h);
        System.out.println(result);
    }
}
