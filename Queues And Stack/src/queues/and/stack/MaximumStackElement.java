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
public class MaximumStackElement {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Stack stack = new Stack();
        Stack maxStack = new Stack();
        int element;
        for(int i=0;i<n;i++) {
            int option = scan.nextInt();
            switch(option) {
                case 1:
                    element = scan.nextInt();
                    stack.push(element);
                    if(maxStack.isEmpty() || (int)maxStack.peek() <= element) {
                        maxStack.push(element);
                    }
                    break;
                case 2: 
                    element = (int)stack.pop();
                    if((int)maxStack.peek() == element) {
                        maxStack.pop();
                    }
                    
                    break;
                case 3: 
                    System.out.println((int)maxStack.peek());
            }
            
        }
        scan.close();
    }
}


