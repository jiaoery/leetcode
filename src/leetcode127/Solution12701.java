package leetcode127;

import leetcode02.ListNode;

public class Solution12701 {
    //迭代
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head.next;

        if (slow==null){
            return false;
        }
        ListNode fast = slow.next;
        if(fast==null){
            return false;
        }

        while (slow!=null&&fast!=null){
            //fast reach slow
            if(slow==fast){
                return true;
            }
            //move slow to next
            slow = slow.next;
            //fast twice next
            fast = fast.next;
            if(fast==null){
                return false;
            }
            fast = fast.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Solution12701 solution12701 = new Solution12701();
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        System.out.println("isCircle:"+solution12701.hasCycle(listNode1));

        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(2);
        ListNode listNode7 = new ListNode(0);
        ListNode listNode8 = new ListNode(-4);
        System.out.println("isCircle:"+solution12701.hasCycle(listNode5));
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode6;
        System.out.println("isCircle:"+solution12701.hasCycle(listNode6));
    }
}
