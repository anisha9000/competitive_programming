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
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author anisha
 */
public class DeltaEncoding {
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

        int[] res;
        int array_size = 0;
        array_size = Integer.parseInt(in.nextLine().trim());

        int[] array = new int[array_size];
        for(int i = 0; i < array_size; i++) {
            int array_item;
            array_item = Integer.parseInt(in.nextLine().trim());
            array[i] = array_item;
        }

        res = delta_encode(array);
        for(int res_i = 0; res_i < res.length; res_i++) {
            bw.write(String.valueOf(res[res_i]));
            bw.newLine();
        }

        bw.close();
    }
    
    static int[] delta_encode(int[] array) {
        ArrayList<Integer> deltaEncoding = new ArrayList<>();
        int n = array.length;
        deltaEncoding.add(array[0]);
        for(int i=1;i<n;i++) {
            int encoding = array[i]- array[i-1];
            if(encoding<-128 || encoding>128) {
                deltaEncoding.add(-128);
            }
            deltaEncoding.add(encoding);
        }
        
        int[] encodedArray = new int[deltaEncoding.size()];
        for(int i=0;i<deltaEncoding.size();i++) {
            encodedArray[i] = deltaEncoding.get(i);
        }
        return encodedArray;
    }
}
