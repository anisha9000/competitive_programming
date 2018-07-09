/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

import java.util.*;
/**
 * Leetcode
 * 
 * @author anisha
 */
public class MyCalendarI {
    List<int[]> bookings;

    public MyCalendarI() {
        bookings = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        if(start > end) {
            return false;
        }
        if(bookings.isEmpty()) {
            bookings.add(new int[]{start,end});
            return true;
        }
        // Iterate through all previous bookings
        
        for (int[] currBooking : bookings) {
            if(end <= currBooking[0] || start >= currBooking[1] ) {
                // no overlap
            } else {
                // overlap
                return false;
            }
        }
        
        bookings.add(new int[]{start,end});
        return true;
        
    }
}
