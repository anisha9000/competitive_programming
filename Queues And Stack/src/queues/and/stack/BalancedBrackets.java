/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues.and.stack;

import java.util.*;

/**
 *
 * @author anisha
 */
public class BalancedBrackets {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String s = in.next();
            boolean balanced = isBalanced(s);
            if (balanced) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        in.close();
    }

    private static boolean isBalanced(String s) {
        Stack stack = new Stack();
        boolean isBalanced = true;
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            if (curr == '(' || curr == '{' || curr == '[') {
                stack.push(s.charAt(i));
            } else {
                if (stack.isEmpty()) {
                    isBalanced = false;
                    break;
                }
                char popped = (char) stack.pop();
                if (curr == ')' && popped != '(') {
                    isBalanced = false;
                    break;
                } else if (curr == '}' && popped != '{') {
                    isBalanced = false;
                    break;
                } else if (curr == ']' && popped != '[') {
                    isBalanced = false;
                    break;
                }
            }

        }
        if (!isBalanced) {
            return false;
        } else {
            if (!stack.isEmpty()) {
                return false;
            }
            return true;
        }
    }

}
