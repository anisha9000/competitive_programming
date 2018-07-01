/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues.and.stack;

import java.util.*;
/**
 * Leetcode
 * Suppose you have a random list of people standing in a queue. Each person is 
 * described by a pair of integers (h, k), where h is the height of the person 
 * and k is the number of people in front of this person who have a height greater 
 * than or equal to h. Write an algorithm to reconstruct the queue.
 * @author anisha
 */
public class QueueReconstructionByHeight {
    public int[][] reconstructQueue(int[][] people) {
        // Sort people in decreasing order of h and increasing order of k
        Arrays.sort(people, new Comparator<int[]> (){
            @Override
            public int compare(int[] a, int[] b) {
                if(a[0] != b[0]) {
                    return b[0] - a[0];
                } else {
                    return a[1] - b[1];
                }
            }
        });
        
        
        List<int[]> constructedList = new LinkedList<>();
        for(int i=0;i<people.length;i++) {
            int[] currPerson = people[i];
            constructedList.add(currPerson[1], currPerson);
            
        }
        
        
        int[][] queue = new int[people.length][2];
        for(int i=0;i< people.length;i++) {
            queue[i] = constructedList.get(i);
        }
        
        return queue;
    }
}
