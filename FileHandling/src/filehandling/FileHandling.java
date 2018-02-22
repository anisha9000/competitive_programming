/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author anisha
 */
public class FileHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File f = new File("test.txt");
        Scanner in = new Scanner(System.in);
        
        try {
            FileWriter fw = new FileWriter("text.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            
            String str = "Hello";
            Pattern pattern = Pattern.compile(str);
            Matcher matcher = null;
            
            matcher = pattern.matcher(str);
            matcher.find();
            
            FileReader fr = new FileReader("text.txt");
            BufferedReader br = new BufferedReader(fr);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileOutputStream oStream = new FileOutputStream(f);
            ObjectOutputStream oOStream = new ObjectOutputStream(oStream);
            String message = "";
            while (!message.equalsIgnoreCase("exit")) {
                message = in.next();
                oOStream.writeBytes(message);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileHandling.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
