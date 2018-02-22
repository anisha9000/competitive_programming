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
public class CountAndSay {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int start = 1;
        String lastResult = "1";
        for (int i = 1; i < n; i++) {
            lastResult = getCountAndSay(lastResult);
        }

        System.out.println(lastResult);

    }

    private static String getCountAndSay(String lastResult) {
        System.out.println("LastResult:" + lastResult);
        int len = lastResult.length();
        StringBuilder sb = new StringBuilder();
        int lastcount = 1;
        for (int index = 1; index <= len; index++) {
            if (index == len || lastResult.charAt(index - 1) != lastResult.charAt(index)) {
                sb.append(lastcount);
                sb.append(lastResult.charAt(index - 1));
                lastcount = 1;

            } else {
                lastcount++;
            }

        }
        System.out.println("New result:" + sb.toString());
        return sb.toString();
    }

}
