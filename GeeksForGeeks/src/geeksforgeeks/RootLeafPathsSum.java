/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geeksforgeeks;

import java.util.Stack;

/**
 *
 * @author anisha
 */
public class RootLeafPathsSum {

    class Tree {

        int data;
        Tree left, right;

        Tree(int d) {
            data = d;
            left = null;
            right = null;
        }

    }
    
    static class Sum {
        int currSum;
        Tree currNode;
        
        public Sum(int sum, Tree node) {
            currSum = sum;
            currNode = node;
            
        }
    }

    public static int treePathsSum(Tree root) {
        //add code here.
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return root.data;
        }
        
        Stack<Sum> stack = new Stack<>();
        Sum sumelement = new Sum(root.data,root);
        stack.push(sumelement);
        int total = 0;
        while(!stack.isEmpty()) {
            Sum currstats = stack.pop();
            Tree currNode = currstats.currNode;
            int currSum = currstats.currSum;
            // leaf node case
            if(currNode.left == null && currNode.right == null) {
                //handle leaf node case TODO
                total += currSum;
            } else {
                if(currNode.left != null) {
                    Sum leftElement = new Sum(currSum*10+currNode.left.data, currNode.left);
                    stack.push(leftElement);
                }
                if(currNode.right != null) {
                    Sum rightElement = new Sum(currSum*10+currNode.right.data, currNode.right);
                    stack.push(rightElement);
                }

            }
            
            
            
        }

        return total;
    }
}
