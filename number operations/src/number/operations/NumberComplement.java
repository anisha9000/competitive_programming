/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.operations;

/**
 *
 * @author anisha
 */
public class NumberComplement {
    public int findComplement(int num) {
        String numAsBits = Integer.toBinaryString(num);
        String invert0Temp = numAsBits.replace("0","2");
        String invert1 = invert0Temp.replace("1","0");
        String invert0 = invert1.replace("2","1");
        int result = Integer.parseInt(invert0,2);
        return result;
    }
}
