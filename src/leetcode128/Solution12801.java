package leetcode128;

import leetcode02.ListNode;

public class Solution12801 {
    /**
     * 两次遍历
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        int length = 0;
        ListNode temp = new ListNode(0);
        temp.next = head;
        //length
        while (head!=null){
            length++;
            head = head.next;
        }
        //lenth less than n
        if(length<n){
            return head;
        }
        //哨兵节点
        ListNode temp1 = temp;
        for (int i =0;i<length-n;i++){
            temp1 = temp1.next;
        }
        temp1.next = temp1.next.next;
        return temp.next;
    }

    public static void main(String[] args) {
        Solution12801 solution = new Solution12801();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        ListNode node = solution.removeNthFromEnd(node1,2);
        while (node!=null){
            System.out.println(node.val);
            node = node.next;
        }


    }
}
