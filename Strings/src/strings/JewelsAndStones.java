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
public class JewelsAndStones {
    public int numJewelsInStones(String J, String S) {
        int totalStones = S.length();
        int jewelCount = 0;
        for(int i=0;i<totalStones;i++) {
            if(J.contains(Character.toString(S.charAt(i)))) {
                jewelCount++;
            }
            
        }
        return jewelCount;
    }
}
