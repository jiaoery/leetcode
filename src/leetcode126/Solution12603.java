package leetcode126;

import leetcode02.ListNode;

public class Solution12603 {

    /**
     * 递归反转法
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }

    public static void main(String[] args) {
        Solution12603 solution12603 =  new Solution12603();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode result = solution12603.reverseList(listNode1);
        int count = 0;
        while (result!=null){
            System.out.println("count:"+count+";value:"+result.val);
            count++;
            result  = result.next;
        }
    }
}
