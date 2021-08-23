package leetcode129;

import leetcode02.ListNode;
import leetcode128.Solution12801;

public class Solution12901 {

    /**
     * 两次遍历
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        ListNode temp = new ListNode(0,head);
        int length = 0;
        while (head!=null){
            length++;
            head = head.next;
        }
        for (int i = 0; i < length/2; i++) {
            temp = temp.next;
        }
        return temp.next;
    }

    public static void main(String[] args) {
        Solution12901 solution = new Solution12901();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = solution.middleNode(node1);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }
    }
}
