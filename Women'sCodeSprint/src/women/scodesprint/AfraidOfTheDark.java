/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package women.scodesprint;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class AfraidOfTheDark {
    
    static class Room {
        int roomId;
        boolean isLightOn;
        Room[] neighbour = new Room[2];
        
        public Room(int roomId, int light) {
            this.roomId = roomId;
            isLightOn = (light==1)?true:false;
        }
        
        public void addRoom(Room r) {
            if(neighbour[0] == null) {
                neighbour[0] = r;
            } else {
                neighbour[1] = r;
            }
        }
        
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int[] s = new int[n];
            int totalOffCount = 0;
            Room[] rooms= new Room[n+1];
            
            for(int s_i = 0; s_i < n; s_i++){
                s[s_i] = in.nextInt();
                if(s[s_i] == 0) {
                    totalOffCount++;
                }
            }
            
            for(int a1 = 0; a1 < n-1; a1++){
                int a = in.nextInt();
                int b = in.nextInt();
                if(rooms[a] == null) {
                    rooms[a] = new Room(a, s[a-1]);
                }
                if(rooms[b] == null) {
                    rooms[b] = new Room(b, s[b-1]);
                }
                rooms[a].addRoom(rooms[b]);
                rooms[b].addRoom(rooms[a]);
                // Write Your Code Here
            }
            
            for(int roomId = 1;roomId<=n;roomId++) {
                boolean[] isRoomVisited = new boolean[n+1];
                int currentOffCount = totalOffCount;
                int currentSum = 0;
                LinkedList<Room> roomPath = new LinkedList<>();
                roomPath.add(rooms[roomId]);
                
                while(!roomPath.isEmpty()) {
                    Room currRoom = roomPath.removeFirst();
                    if(currRoom.isLightOn && !isRoomVisited[currRoom.roomId]) {
                        currentSum++;
                        isRoomVisited[currRoom.roomId] = true;
                        for(int i=0;i<=1;i++) {
                            if(currRoom.neighbour[i]!= null && !isRoomVisited[currRoom.neighbour[i].roomId]) {
                                roomPath.add(currRoom.neighbour[i]);
                            }
                        }
                    } else if(!currRoom.isLightOn && currentOffCount < 1) {
                        continue;
                    } else if(!currRoom.isLightOn && currentOffCount > 1) {
                        currentOffCount--;
                        currentSum++;
                        isRoomVisited[currRoom.roomId] = true;
                        for(int i=0;i<=1;i++) {
                            if(currRoom.neighbour[i]!= null && !isRoomVisited[currRoom.neighbour[i].roomId]) {
                                roomPath.add(currRoom.neighbour[i]);
                            }
                        }
                    }
                }
                System.out.println(currentSum);
            }
            
        }
        in.close();
    }
}
