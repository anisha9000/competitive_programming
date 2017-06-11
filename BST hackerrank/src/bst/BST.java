/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bst;

import java.util.*;
import java.io.*;

/**
 *
 * @author anisha
 */
class Node{
    Node left,right;
    int data;
    Node(int data){
        this.data=data;
        left=right=null;
    }
}

public class BST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
            int T=sc.nextInt();
            Node root=null;
            while(T-->0){
                int data=sc.nextInt();
                root=insert(root,data);
            }
            int height=getHeight(root);
            System.out.println("Height:"+height);
            System.out.println();
            levelOrder(root);
    }
    
    public static Node insert(Node root,int data){
        if(root==null){
            return new Node(data);
        }
        else{
            Node cur;
            if(data<=root.data){
                cur=insert(root.left,data);
                root.left=cur;
            }
            else{
                cur=insert(root.right,data);
                root.right=cur;
            }
            return root;
        }
    }
    
    public static int getHeight(Node root){
      //Write your code here
        if(root.left == null && root.right == null) {
            return 0;
        } else if(root.left == null) {
            return (1+ getHeight(root.right));
        } else if (root.right == null) {
            return (1+ getHeight(root.left));
        } else {
            return (1+ Math.max(getHeight(root.left), getHeight(root.right)));
        }
    }
    
    static void levelOrder(Node root){
      //Write your code here
      LinkedList<Integer> queue = new LinkedList<>();
      int index = 0;
      queue.add(root.data);
      Node curr = root;
      while(index < queue.size()) {
          curr = findMember(root, queue.get(index));
          if(curr == null) {
              index++;
              continue;
          }
          if(curr.left != null) {
            queue.add(curr.left.data);
          }
          if(curr.right != null) {
            queue.add(curr.right.data);
          }
          index++;
      }
      for(int i=0;i<queue.size();i++) {
          System.out.print(queue.get(i)+" ");
      }
    }   

    private static Node findMember(Node root, Integer get) {
        Node curr = root;
        if(root == null) {
            return null;
        }
        if(curr.data == get) {
            return curr;
        } else if(curr.data< get) {
            return findMember(curr.right, get);
        } else {
            return findMember(curr.left, get);
        }
    }
    
}
