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
public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Queue queue = new Queue();
        int q = in.nextInt();
        for(int i=0;i<q;i++) {
            int type = in.nextInt();
            switch(type) {
                case 1:
                    int element = in.nextInt();
                    queue.equeue(element);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.peek();
                    break;
            }
        }
        in.close();
    }
}

class Queue {
    Stack<Integer> enqueueStack = new Stack<>();
    Stack<Integer> dequeueStack = new Stack<>();
    
    void equeue(int element) {
        enqueueStack.push(element);
    }
    
    int dequeue() {
        if(!dequeueStack.isEmpty()) {
            return (int)dequeueStack.pop();
        }
        while(!enqueueStack.isEmpty()) {
            dequeueStack.push(enqueueStack.pop());
        }
        return (int)dequeueStack.pop();
    }
    
    void peek() {
        if(!dequeueStack.isEmpty()) {
            System.out.println((int)dequeueStack.peek());
            return;
        }
        while(!enqueueStack.isEmpty()) {
            dequeueStack.push(enqueueStack.pop());
        }
        System.out.println((int)dequeueStack.peek());
    }
}
