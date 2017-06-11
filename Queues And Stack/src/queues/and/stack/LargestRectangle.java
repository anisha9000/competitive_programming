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
public class LargestRectangle {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Stack stack = new Stack();
        for(int i=0;i<n;i++) {
            stack.push(in.nextInt());
        }   
        int area = Integer.MIN_VALUE;
        int minHeight = (int)stack.peek();
        for(int count = 1;count <= n;count++) {
            int topHeight = (int)stack.pop();
            if(topHeight < minHeight) {
                minHeight = topHeight;
            }
            int newArea = minHeight*count;
            if(newArea > area) {
                area = newArea;
            }
        }
        System.out.println(area);
        
        in.close();
    }
    
}
