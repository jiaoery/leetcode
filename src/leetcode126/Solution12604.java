package leetcode126;

import leetcode02.ListNode;

public class Solution12604 {
    //就地逆转法反转链表
    public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode pre = head;
        ListNode end = head.next;
        while (end!=null){
            pre.next = end.next;
            end.next  = head;
            head = end;
            end = pre.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Solution12604 solution12604 =  new Solution12604();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode result = solution12604.reverseList(listNode1);
        int count = 0;
        while (result!=null){
            System.out.println("count:"+count+";value:"+result.val);
            count++;
            result  = result.next;
        }
    }
}
