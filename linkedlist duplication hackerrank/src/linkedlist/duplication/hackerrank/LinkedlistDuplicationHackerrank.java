/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist.duplication.hackerrank;

import java.io.*;
import java.util.*;

/**
 *
 * @author anisha
 */
class Node{
	int data;
	Node next;
	Node(int d){
        data=d;
        next=null;
    }
	
}

public class LinkedlistDuplicationHackerrank {

    /**
     * @param args the command line arguments
     */
    
    public static  Node insert(Node head,int data)
    {
        Node p=new Node(data);			
        if(head==null)
            head=p;
        else if(head.next==null)
            head.next=p;
        else
        {
            Node start=head;
            while(start.next!=null)
                start=start.next;
            start.next=p;

        }
        return head;
    }
    public static void display(Node head)
        {
              Node start=head;
              while(start!=null)
              {
                  System.out.print(start.data+" ");
                  start=start.next;
              }
        }
    
    public static void main(String[] args) {
        // TODO code application logic here
        {
              Scanner sc=new Scanner(System.in);
              Node head=null;
              int T=sc.nextInt();
              while(T-->0){
                  int ele=sc.nextInt();
                  head=insert(head,ele);
              }
              head=removeDuplicates(head);
              display(head);

       }
    }

    private static Node removeDuplicates(Node head) {
        if(head == null || (head.next == null)) {
            return head;
        } else {
            Node curr = head;
            while(curr != null && curr.next!= null) {
                if(curr.data == curr.next.data) {
                    Node temp = curr.next;
                    curr.next = curr.next.next;
                    
                } else {
                    curr = curr.next;
                }
                
            }
        }
        return head;
    }
    
}
