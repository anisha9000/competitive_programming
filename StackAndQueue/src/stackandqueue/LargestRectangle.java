/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackandqueue;

import java.util.*;
/**
 *
 * @author Anisha
 */
public class LargestRectangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for(int i=0;i<n;i++) {
            height[i] = in.nextInt();
        }
        in.close();
        int area = findMaxArea(height,0,n-1);
        System.out.println(area);
    }

    private static int findMaxArea(int[] height, int lowerIndex, int upperIndex) {
        if(upperIndex-lowerIndex <= 0) {
            if(lowerIndex == height.length) {
                return height[upperIndex];
            }
            if(upperIndex < 0) {
                return height[lowerIndex];
            }
            return height[lowerIndex];
        }
        int minheight = height[lowerIndex];
        int minIndex = lowerIndex;
        for(int i=lowerIndex+1;i<=upperIndex;i++) {
            if(minheight > height[i]) {
                minheight = height[i];
                minIndex = i;
            }
        }
        int maxArea = (upperIndex-lowerIndex+1) * minheight;
        int maxAreaLeft = findMaxArea(height, lowerIndex, minIndex-1);
        int maxAreaRight = findMaxArea(height, minIndex+1, upperIndex);
        return Math.max(maxArea, Math.max(maxAreaLeft, maxAreaRight));
    }
}
