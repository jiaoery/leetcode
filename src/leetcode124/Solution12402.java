package leetcode124;

import leetcode02.ListNode;

public class Solution12402 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }else if(l2==null){
            return l1;
        }else if (l2.val> l1.val){
            l1.next = mergeTwoLists(l1.next,l2);
            return l1;
        }else {
            l2.next = mergeTwoLists(l1,l2.next);
            return l2;
        }
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(3);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        Solution12402 solution12402 = new Solution12402();
        ListNode head = solution12402.mergeTwoLists(node1,node4);

        int count =1;
        while (head!=null){
            System.out.println("count:"+count+++";value:"+head.val);
            head =head.next;
        }


    }
}
