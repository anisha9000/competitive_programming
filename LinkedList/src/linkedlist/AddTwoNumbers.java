/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author anisha
 */
public class AddTwoNumbers {

    public static class ListNode {

        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }

        ListNode l3 = new ListNode(0);
        int carry = 0;
        ListNode head = l3;
        while (l1 != null || l2 != null || carry != 0) {
            int sum = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + carry;
            carry = sum / 10;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
            l3.next = new ListNode(sum%10);
            l3 = l3.next;
        }
        
        return head.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        l1.next = new ListNode(4);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(4);

        ListNode l3 = addTwoNumbers(l1, l2);

    }

}
