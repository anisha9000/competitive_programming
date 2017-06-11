/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Anisha
 */
public class ArraySimpleQueries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        Node head;
        
        in.close();
    }
    
}

class Node {
    int data;
    Node next;
    
    public Node(int data) {
        this.data = data;
    }
}

