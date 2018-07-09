/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.*;
/**
 *
 * @author anisha
 */
class MyCalendar {
    
    List<int[]> bookings;

    public MyCalendar() {
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
        Iterator i = bookings.iterator();
        while(i.hasNext()) {
            int[] currBooking = (int[])i.next();
            if(end <= currBooking[0] || start >= currBooking[1] ) {
                // no overlap
                continue;
            } else {
                // overlap
                return false;
            }
        }
        
        bookings.add(new int[]{start,end});
        return true;
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */