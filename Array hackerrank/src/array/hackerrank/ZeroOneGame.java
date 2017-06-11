/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.hackerrank;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author anisha
 */
public class ZeroOneGame {
    public static void main(String[] args) {
        method1();
        //method2();
        //method3();
        //method4();
    }

    private static void method1() {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            ArrayList<Integer> sequence = new ArrayList();
            int player = 0; // 0 for alice and 1 for bob
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence.add(sequence_i,in.nextInt());
            }
            int i = 1;
            while(i<sequence.size()-1) {
                if((sequence.get(i-1) == 0) && (sequence.get(i-1) == sequence.get(i+1))) {
                    sequence.remove(i);
                    player = (player+1) % 2;
                    if(i>1)
                        i--;
                } else {
                    i++;
                }
            }
            System.out.println(((player+1)%2 == 0)?"Alice":"Bob");
            // If Alice wins, print 'Alice' on a new line; otherwise, print 'Bob'
        }
    }

    //incorrect
    private static void method2() {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int player = 0;
            int[] sequence = new int[n];
            Stack<Integer> stack = new Stack();
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence[sequence_i] = in.nextInt();
            }
            for(int i=n-1;i>=0;i--) {
                stack.push(sequence[i]);
            }
            //System.out.println(stack.toString());
            boolean remove = false;
            while(stack.size() >= 3) {
                if(stack.peek() == 1) {
                    stack.pop();
                } else {
                    int first = stack.pop();
                    int mid = stack.pop();
                    int last = stack.peek();
                    if(last ==1) {
                        stack.push(mid);
                        remove = false;
                    } else {
                        player = (player+1)%2;
                        stack.push(first);
                        remove = true;
                    }
                }
            }
            if(remove) {
                System.out.println(((player+1)%2 == 0)?"Alice":"Bob");
            } else {
                System.out.println(((player+1)%2 == 0)?"Bob":"Alice");
            }
            
            // If Alice wins, print 'Alice' on a new line; otherwise, print 'Bob'
        }
    }
    //Incorrect
    private static void method3() {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            int[] sequence = new int[n];
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                sequence[sequence_i] = in.nextInt();
            }
            int i=1;
            int player = 0;
            while(i<n-1) {
                if(sequence[i-1] == 0 && sequence[i-1] == sequence[i+1]) {
                    player = (player+1) % 2;
                    sequence[i] = sequence[i-1];
                    
                } 
                i++;
            }
            System.out.println(((player+1)%2 == 0)?"Alice":"Bob");
            // If Alice wins, print 'Alice' on a new line; otherwise, print 'Bob'
        }
    }
    
    
    private static void method4() {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            LinkedList<Integer> list = new LinkedList();
            for(int sequence_i=0; sequence_i < n; sequence_i++){
                list.add(in.nextInt());
            }
            int i=1;
            int player = 0;
            while(i> 0 && i<list.size()-1) {
                if((list.get(i-1) == 0) && (list.get(i-1) == list.get(i+1))) {
                    list.remove(i);
                    player = (player+1) % 2;
                    if(i>1) {
                        i--;
                    }
                    
                } else {
                    i++;
                }
            }
            System.out.println(((player+1)%2 == 0)?"Alice":"Bob");
            // If Alice wins, print 'Alice' on a new line; otherwise, print 'Bob'
        }
    }
    
}
