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
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String num1, String num2) {
        // a+bi, c+di
        //parse to get a,b,c,d
        //calculate e = ac-bd
        // calculate f = bc+ad
        // convert to e+fi
        int a = Integer.parseInt(num1.split("\\+")[0]);
        int b = Integer.parseInt(num1.split("\\+")[1].split("i")[0]);
        int c = Integer.parseInt(num2.split("\\+")[0]);
        int d = Integer.parseInt(num2.split("\\+")[1].split("i")[0]);
        int e = a*c - b*d;
        int f = b*c + a*d;
        String result = String.valueOf(e)+"+"+String.valueOf(f)+"i";
        return result;
        
    }
}
