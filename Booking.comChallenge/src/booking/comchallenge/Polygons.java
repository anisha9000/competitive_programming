/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booking.comchallenge;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Polygons {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = null;
        if (fileName != null) {
            bw = new BufferedWriter(new FileWriter(fileName));
        }
        else {
            bw = new BufferedWriter(new OutputStreamWriter(System.out));
        }

        int res;
        int a;
        a = Integer.parseInt(in.nextLine().trim());

        int b;
        b = Integer.parseInt(in.nextLine().trim());

        int c;
        c = Integer.parseInt(in.nextLine().trim());

        int d;
        d = Integer.parseInt(in.nextLine().trim());

        res = polygon(a, b, c, d);
        bw.write(String.valueOf(res));
        bw.newLine();

        bw.close();
    }
    
    static int polygon(int a, int b, int c, int d) {
        if(a<=0 || b<=0 || c<=0 || d<=0) {
            return 0;
        }
        if(a==b && b==c && c==d) {
            return 2;
        } else if(a==c && b==d) {
            return 1;
        }
        return 0;
    }
}
