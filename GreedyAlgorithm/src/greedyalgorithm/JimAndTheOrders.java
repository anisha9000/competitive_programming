/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greedyalgorithm;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class JimAndTheOrders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Order[] order = new Order[n];
        for(int i=0;i<n;i++) {
            order[i] = new Order(i+1, in.nextInt(),in.nextInt());
        }
        
        Arrays.sort(order);
        for(int i=0;i<n;i++) {
            System.out.print(order[i].orderId+" ");
        }
    }
}

class Order implements Comparable<Order>{
    int orderId;
    int startTime;
    int duration;
    int endTime;

    Order(int index, int start, int duration) {
        orderId = index;
        startTime = start;
        this.duration = duration;
        endTime = startTime+this.duration;
    }
    
    @Override
    public int compareTo(Order o) {
        return endTime - o.endTime;
    }
}
