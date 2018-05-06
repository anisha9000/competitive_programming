/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rookierank3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
/**
 *
 * @author anisha
 */
public class ComparingTimes {
    
    static String timeCompare(String t1, String t2) throws ParseException{
        // Complete this function
        String result ="";
        SimpleDateFormat sf = new SimpleDateFormat("hh:mma");
        Date date1 = sf.parse(t1);
        Date date2 = sf.parse(t2);
        if(date1.compareTo(date2) < 0) {
            result = "First";
        } else {
            result = "Second";
        }
        return result;
    }

    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String t1 = in.next();
            String t2 = in.next();
            String result = timeCompare(t1, t2);
            System.out.println(result);
        }
    }
}
