/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timeconversion.hackerrank;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author anisha
 */
public class TimeconversionHackerrank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String time12 = scan.next();
        scan.close();
        
        SimpleDateFormat format12 = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat format24 = new SimpleDateFormat("HH:mm:ss");
        try {
            Date date = format12.parse(time12);
            System.out.println(format24.format(date));
        } catch (ParseException ex) {
            Logger.getLogger(TimeconversionHackerrank.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
