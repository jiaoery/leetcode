package leetcode128;

import leetcode02.ListNode;

public class Solution12802 {

    /**
     * 双指针
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode temp = new ListNode(0, head);
        ListNode slow = temp;
        ListNode fast = head;
        //较快的指针移动n位
        for (int i = 0; i < n; i++) {
            //如果位数不够，就直接返回原链表
            if (fast == null) {
                return head;
            }
            fast = fast.next;
        }
        //移动fast到尾部时，slow正好在倒数第n个位置处
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }

    public static void main(String[] args) {
        Solution12802 solution = new Solution12802();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = solution.removeNthFromEnd(node1, 2);
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }

        ListNode node6 = solution.removeNthFromEnd(new ListNode(2), 1);
        while (node6 != null) {
            System.out.println(node6.val);
            node6 = node6.next;
        }
    }
}
