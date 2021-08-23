package leetcode129;

import leetcode02.ListNode;

public class Solution12902 {

    /**
     * 快慢指针
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode slow = new ListNode(0,head);
        ListNode fast = new ListNode(0,head);
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
            if(fast==null){
                return slow;
            }else {
                fast = fast.next;
            }
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution12902 solution = new Solution12902();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        ListNode node = solution.middleNode(node1);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
