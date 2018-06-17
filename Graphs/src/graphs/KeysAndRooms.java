/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphs;

import java.util.Iterator;
import java.util.List;

/**
 * leetcode
 * There are N rooms and you start in room 0.  
 * Each room has a distinct number in 0, 1, 2, ..., N-1, and each 
 * room may have some keys to access the next room. 
 * You can walk back and forth between rooms freely. 
 * Return true if and only if you can enter every room.
 * @author anisha
 */
public class KeysAndRooms {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int totalRooms = rooms.size();
        boolean visited[] = new boolean[totalRooms];
        visited[0] = true;
        visitAllRooms(rooms, 0, visited);
        boolean canVisit = true;
        for(int i=0;i< totalRooms;i++) {
            if(!visited[i]) {
                canVisit = false;
                break;
            }
        }
        return canVisit;
    }
    
    //todo keep track of count for better runtime
    public void visitAllRooms(List<List<Integer>> rooms, int currentRoom, boolean visited[]) {
        if(rooms.size() <= 0 ||
           rooms.size() < currentRoom ||
           rooms.get(currentRoom).size() <= 0) {
            return;
        }
        
        //iterate through all rooms one by one
        Iterator roomIterator = rooms.get(currentRoom).iterator();
        while(roomIterator.hasNext()) {
            int key = (int)roomIterator.next();
            if(!visited[key]) {
                visited[key] = true;
                visitAllRooms(rooms, key, visited);    
            }
        }
        
    }
    
    public static void main(String[] args) {
        
    }
}
