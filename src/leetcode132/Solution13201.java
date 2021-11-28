package leetcode132;

import leetcode02.ListNode;

public class Solution13201 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode next = head;
        while (next.next!=null){
            if(next.val==next.next.val){
                next.next = next.next.next;
            }else {
                next = next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        Solution13201 solution  =  new Solution13201();
        ListNode result = solution.deleteDuplicates(node1);
        while (result!=null){
            System.out.println("reslut is "+result.val);
            result = result.next;
        }

    }
}
