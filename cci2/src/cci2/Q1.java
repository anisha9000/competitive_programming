/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cci2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anisha
 */
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int i=0;
        Node<Character> head = null;
        while(i<str.length()) {
            head = Node.insert(head, str.charAt(i++));
            
        }
        Node.display(head);
        //head = removeDuplicatesMethod1(head);
        head = removeDuplicatesMethod2(head);
        Node.display(head);
        in.close();
    }

    //Method 1. Temporary buffer
    private static Node removeDuplicatesMethod1(Node head) {
        Node<Character> curr = head;
        Node<Character> prev = null;
        if(head == null) {
            return head;
        }
        ArrayList<Character> charBuffer = new ArrayList<>();
        while(curr.next != null) {
            if(charBuffer.contains(curr.data)) {
                //remove this index.
                prev.next = curr.next;
            } else {
                charBuffer.add(curr.data);
                prev = curr;
            }
            
            curr = curr.next;
        }
        return head;
    }
    
    //Method 2. No buffer
    private static Node removeDuplicatesMethod2(Node head) {
        Node curr = head;
        if(null == head) {
            return head;
        }
        while(null != curr.next) {
            Node temp = curr.next;
            Node prev = curr;
            while(temp != null) {
                if(temp.data == curr.data) {
                    prev.next = temp.next;
                } else {
                    prev = prev.next;
                }
                temp = temp.next;
            }
            curr = curr.next;
        }
        return head;
    }
    
}

class Node<D> {
    D data;
    Node next;
    
    Node(D data) {
        this.data = data;
        next = null;
    }
    
    public static <D> Node insert(Node head, D data) {
        //too check if return is not added
        Node temp = new Node(data);
        if(null == head) {
            head = temp;
        } else {
            Node curr = head;
            while(null != curr.next) {
                curr = curr.next;
            }
            curr.next = temp;
        }
        return head;
    }
    
    public static void display(Node head) {
        Node curr = head;
        System.out.println();
        while(null != curr) {
            System.out.print(curr.data);
            curr = curr.next;
        }
    }
}
