/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author anisha
 */
public class AlternatingCharacters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i=0;i<t;i++) {
            String n = in.next();
            finddeletion(n);
        }
        in.close();
    }

    private static void finddeletion(String n) {
        Stack s = new Stack();
        int delectionCount = 0;
        for(int i=0;i<n.length();i++) {
            if(s.isEmpty()) {
                s.push(n.charAt(i));
            } else {
                char temp = (char)s.peek();
                if(temp == n.charAt(i)) {
                    //deletion
                    delectionCount++;
                } else {
                    s.push(n.charAt(i));
                }
            }
        }
        System.out.println(delectionCount);
    }
}
