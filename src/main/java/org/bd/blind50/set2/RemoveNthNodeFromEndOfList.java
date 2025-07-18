package org.bd.blind50.set2;

import org.bd.linkedlist.ListNode;

import java.util.List;

public class RemoveNthNodeFromEndOfList {

    public ListNode<Integer> solve(ListNode<Integer> head, int k) {
        dfs(head, k);
        return head;
    }

    private int dfs(ListNode<Integer> head, int k) {
        if(head == null) return 0;
        int value = 1 + dfs(head.next, k);
        if(value == k) {
            head.next = head.next.next;
        }
        return value;
    }

    // TC: 0(n)
    // SC: 0(1)

}
