/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode90;

import java.util.LinkedList;

/**
 * leetcode
 * Given a balanced parentheses string S, compute the score of the string based
 * on the following rule:
 * () has score 1
 * AB has score A + B, where A and B are balanced parentheses strings.
 * (A) has score 2 * A, where A is a balanced parentheses string.
 * @author anisha
 */
public class ScoreOfParentheses {
    public int scoreOfParentheses(String S) {
        LinkedList<String> stack = new LinkedList<>();
        int i = 0;
        int len = S.length();
        while(i < len) {
            switch(S.charAt(i)) {  
                case '(': stack.push(Character.toString(S.charAt(i)));
                    break;
                case ')' : processPop(stack, ')');
                    break;
                    
            }
            i++;
             
        }
        
        int result = 0;
        while(stack.size() > 1) {
            result += Integer.parseInt(stack.pop());
        }
        
        if(stack.size() == 1)
        result += Integer.parseInt(stack.pop());
        
        return result;
    }
    
    public void processPop(LinkedList<String> stack, char lastChar) {
        while(!stack.isEmpty()) {
            String lastElem = (String)stack.peek();
            if(lastElem.equals("(")) {
                stack.pop();
                stack.push("1");
                break;
            } else {
                int num = Integer.parseInt(lastElem);
                if(stack.size() == 1) {
                    break;
                }
                stack.pop();
                while(!stack.peek().equals("(")) {
                    num+= Integer.parseInt(stack.pop());
                    if(stack.size() == 0) {
                        stack.push(String.valueOf(num));
                        break;
                    }
                }
                if(stack.peek().equals("(")) {
                    stack.pop();
                    stack.push(String.valueOf(2*num));
                    break;
                } else {
                    stack.push(String.valueOf(num));
                }
            }
        }
        
    }
}
