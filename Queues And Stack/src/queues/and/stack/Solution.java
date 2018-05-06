/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues.and.stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author anisha
 */
public class Solution {
    
    Stack stack = new Stack();
    LinkedList queue = new LinkedList();
        
    Solution() {
        
    }
    
    void pushCharacter(char c) {
        stack.push(c);
    }
    
    void enqueueCharacter(char c) {
        queue.add(c);
    }
    
    char popCharacter() {
        return (char)stack.pop();
    }
    
    char dequeueCharacter() {
        return (char)queue.remove();
    }
}
