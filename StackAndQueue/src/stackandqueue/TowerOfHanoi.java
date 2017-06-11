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
public class TowerOfHanoi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stack<Integer> origin = new Stack();
        Stack<Integer> dest = new Stack();
        Stack<Integer> buffer = new Stack();
        origin.push(10);
        origin.push(8);
        origin.push(5);
        origin.push(3);
        System.out.println("stack a:" + origin.toString());
        System.out.println("stack b:" + dest.toString());
        System.out.println("stack c:" + buffer.toString());
        towerOfHanoi(origin, dest, buffer, 4);
        System.out.println("stack a:" + origin.toString());
        System.out.println("stack b:" + dest.toString());
        System.out.println("stack c:" + buffer.toString());
    }

    static void towerOfHanoi(Stack origin, Stack dest, Stack buffer, int n) {
        if (n <= 0) {
            return;
        }
        towerOfHanoi(origin, buffer, dest, n - 1);
        dest.push(origin.pop());
        towerOfHanoi(buffer, dest, origin, n-1);
    }

}
