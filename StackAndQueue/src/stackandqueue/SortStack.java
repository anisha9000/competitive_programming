/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueue;

import java.util.*;

/**
 *
 * @author Anisha
 */
public class SortStack {

    public static void main(String[] args) {
        Stack<Integer> origin = new Stack();
        Stack<Integer> buffer = new Stack();
        origin.push(5);
        origin.push(2);
        origin.push(1);
        origin.push(9);
        System.out.println("stack origin:" + origin.toString());
        System.out.println("stack buffer:" + buffer.toString());
        sortBuffer(origin, buffer);
        System.out.println("stack origin:" + origin.toString());
        System.out.println("stack buffer:" + buffer.toString());
        while(!buffer.isEmpty()) {
            origin.push(buffer.pop());
        }
        System.out.println("stack origin:" + origin.toString());
        System.out.println("stack buffer:" + buffer.toString());
    }

    private static void sortBuffer(Stack<Integer> origin, Stack<Integer> buffer) {
        if (origin.isEmpty()) {
            return;
        }
        if (buffer.isEmpty()) {
            buffer.push(origin.pop());
        } else if (origin.peek() < buffer.peek()) {
            buffer.push(origin.pop());
        } else {
            int itemOrigin = origin.pop();
            while (itemOrigin > buffer.peek()) {
                origin.push(buffer.pop());
            }
            buffer.push(itemOrigin);
        }
        sortBuffer(origin, buffer);
    }

}

