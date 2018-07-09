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
class MyCalendarTwo {

    List<int[]> bookings;
    public MyCalendarTwo() {
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
        
        MyCalendarI overlaps = new MyCalendarI();
        
        // Iterate through all previous bookings
        boolean isOverlap = false;
        for (int[] currBooking : bookings) {
            int overlapStart = Math.max(start, currBooking[0]);
            int overlapEnd = Math.min(end, currBooking[1]);
            
            if(overlapStart < overlapEnd) {
                if(!overlaps.book(overlapStart, overlapEnd)) {
                    return false;
                }                
            }
            
        }
        
        bookings.add(new int[]{start,end});
        return true;
        
        
    }
    
    private static class MyCalendarI {
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
    
    
    
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */