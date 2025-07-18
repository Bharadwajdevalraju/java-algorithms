package org.bd.blind50.set2;

import org.bd.linkedlist.ListNode;

public class CycleInALinkedList {

    private boolean solve(ListNode<Integer> head) {
        var slow = head;
        var fast =head;
        while (fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast) {
                return true;
            }
        }
        return false;
    }

    //TC: 0(n)
    //SC: 0(1)

}
