/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations.hackerrank;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author anisha
 */
public class QueensAttackII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int rQueen = in.nextInt();
        int cQueen = in.nextInt();
        TreeSet<Point> kPoints = new TreeSet<>();
        for(int a0 = 0; a0 < k; a0++){
            int rObstacle = in.nextInt();
            int cObstacle = in.nextInt();
            kPoints.add(new Point(rObstacle, cObstacle));
            // your code goes here
        }
        long attackPoints = 0;
        //attack points for columns
        for(int i=cQueen+1;i<=n;i++) {
            Point p = new Point(rQueen,i);
            if(kPoints.contains(p)) {
                break;
            }
            attackPoints++;
        }
        
        for(int i=cQueen-1;i>=1;i--) {
            Point p = new Point(rQueen,i);
            if(kPoints.contains(p)) {
                break;
            }
            attackPoints++;
        }
        //Attack points for rows
        for(int i=rQueen+1;i<=n;i++) {
            Point p = new Point(i,cQueen);
            if(kPoints.contains(p)) {
                break;
            }
            attackPoints++;
        }
        
        for(int i=rQueen-1;i>=1;i--) {
            Point p = new Point(i,cQueen);
            if(kPoints.contains(p)) {
                break;
            }
            attackPoints++;
        }
        
        // Attack points for diagonals
        int r = rQueen+1, c = cQueen+1;
        while(r<=n && c<=n) {
            Point p = new Point(r++,c++);
            if(kPoints.contains(p)) {
                break;
            }
            attackPoints++;
        }
        
        r = rQueen-1;
        c = cQueen-1;
        while(r>=1 && c>=1) {
            Point p = new Point(r--,c--);
            if(kPoints.contains(p)) {
                break;
            }
            attackPoints++;
        }
        
        // Attack points for diagonals
        r = rQueen+1; 
        c = cQueen-1;
        while(r<=n && c>=1) {
            Point p = new Point(r++,c--);
            if(kPoints.contains(p)) {
                break;
            }
            attackPoints++;
        }
        
        r = rQueen-1;
        c = cQueen+1;
        while(r>=1 && c<=n) {
            Point p = new Point(r--,c++);
            if(kPoints.contains(p)) {
                break;
            }
            attackPoints++;
        }
        System.out.println(attackPoints);
    }
}

class Point implements Comparable<Point> {
    int x,y;
    public Point(int x,int y) {
        this.x = x;
        this.y = y;
    }
    
    int getX(){
        return x;
    }
    
    int getY(){
        return y;
    }

    @Override
    public int compareTo(Point o) {
        return Comparator.comparingInt(Point::getX)
              .thenComparingInt(Point::getY)
              .compare(this, o);
    }
}
