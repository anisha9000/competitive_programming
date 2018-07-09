/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author anisha
 */
public class RectanlgeOverlap {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if((rec1[0] - rec2[2]) >=0 || 
          (rec2[0] - rec1[2]) >=0 ||
          (rec1[1] - rec2[3]) >=0 ||
          (rec2[1] - rec1[3]) >=0) {
            return false;
        }
        return true;
    }
}
