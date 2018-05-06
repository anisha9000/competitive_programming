/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueue;

import java.math.BigInteger;
import java.util.*;

/**
 *
 * @author Anisha
 */
public class Waiter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        Stack<Integer> a0 = new Stack<>();
        for (int i = 0; i < n; i++) {
            a0.push(in.nextInt());
        }
        in.close();
        ArrayList<Stack<Integer>> b = new ArrayList<>();
        Stack<Integer> buffer = new Stack<>();
        findStacks(a0, q, 1, b, buffer, 0);
        for(int i=0;i<b.size();i++) {
            while(!b.get(i).isEmpty()) {
                System.out.println(b.get(i).pop());
            }
        }
        if(q%2 == 0) {
            while(!a0.isEmpty()) {
                System.out.println(a0.pop());
            }
        } else {
            while(!buffer.isEmpty()) {
                System.out.println(buffer.pop());
            }
        }
    }

    private static void findStacks(Stack<Integer> a0, int q, int lastPrime,
            ArrayList<Stack<Integer>> b, Stack<Integer> buffer, int iteration) {
        if (iteration >= q) {
            return;
        }
        int nextPrime = findPrime(lastPrime);
        b.add(new Stack<>());
        while (!a0.isEmpty()) {
            if (a0.peek() % nextPrime == 0) {
                b.get(iteration).push(a0.pop());
            } else {
                buffer.push(a0.pop());
            }
        }
        findStacks(buffer, q, nextPrime, b, a0, ++iteration);
        
    }

    private static int findPrime(int lastPrime) {
        //todo
        BigInteger nextPrime = new BigInteger(String.valueOf(lastPrime)).nextProbablePrime();
        return nextPrime.intValue();

    }
}
