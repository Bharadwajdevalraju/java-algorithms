package org.bd.blind50.set2;

import org.bd.linkedlist.ListNode;

import java.util.List;

public class ReverseALinkedList {

    public static ListNode<Integer> solve(ListNode<Integer> head){
        ListNode<Integer> prev = null;
        while (head!=null) {
            var next = head.next;
            head.next=prev;
            prev=head;
            head=next;
        }
        return prev;
    }

    //TC: 0(n)
    //SC: 0(1);
}
