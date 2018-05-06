/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.
 */

import java.util.LinkedList;
import java.util.Stack;

public class ValidParentheses {
    public boolean isValid(String s) {
        //{[]}
        Stack<Character> stack = new Stack<>();
        int len = s.length();
        boolean isValid = true;
        for(int i=0;i<len;i++) {
            char bracket = s.charAt(i);
            char lastBracket;
            switch(bracket) {
                case '(':
                case '{':
                case '[':
                    stack.push(bracket);
                    break;
                case ')':
                    if(stack.empty()) {
                        isValid = false;
                        break;
                    }
                    lastBracket = stack.pop();
                    if(lastBracket != '(') {
                        isValid = false;
                    }
                    break;
                case '}':
                    if(stack.empty()) {
                        isValid = false;
                        break;
                    }
                    lastBracket = stack.pop();
                    if(lastBracket != '{') {
                        isValid = false;
                    }
                    break;
                case ']':
                    if(stack.empty()) {
                        isValid = false;
                        break;
                    }
                    lastBracket = stack.pop();
                    if(lastBracket != '[') {
                        isValid = false;
                    }
                    break;
            }
            if(!isValid) {
                break;
            }

        }
        if(!stack.isEmpty()) {
            isValid = false;
        }
        return isValid;
    }
}
