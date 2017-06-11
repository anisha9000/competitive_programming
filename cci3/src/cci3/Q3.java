/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci3;

import java.util.*;

/**
 *
 * @author anisha
 */
public class Q3 {

    public static void main(String[] args) {
        SetOfStack setOfStack = new SetOfStack(5);
        for(int i=0;i<20;i++) {
            setOfStack.push(i);
        }
        System.out.println(setOfStack.pop());
    }

}

class SetOfStack {

    int threshold;
    ArrayList<Stack> stackSet = new ArrayList<>();

    SetOfStack(int threshold) {
        this.threshold = threshold;
    }

    int pop() {
        int lastStack = stackSet.size() - 1;
        if (lastStack == -1 || stackSet.get(lastStack).isEmpty()) {
            return -1;
        }
        int temp = (int) stackSet.get(lastStack).pop();
        if (stackSet.get(lastStack).isEmpty()) {
            stackSet.remove(lastStack);
        }
        return temp;
    }

    void push(int element) {
        int lastStack = stackSet.size() - 1;
        if (lastStack > -1 && stackSet.get(lastStack).size() < threshold) {
            stackSet.get(lastStack).push(element);
        } else {
            Stack<Integer> newStack = new Stack<>();
            newStack.push(element);
            stackSet.add(newStack);
        }
    }

    int peek() {
        int lastStack = stackSet.size() - 1;
        return (int) stackSet.get(lastStack).peek();
    }
}
