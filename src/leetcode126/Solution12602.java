package leetcode126;

import leetcode02.ListNode;

public class Solution12602 {
    //迭代反转法
    public ListNode reverseList(ListNode head) {
       if(head==null||head.next==null){
           return head;
       }
       //前置位
       ListNode beg = null;
       ListNode mid = head;
       //后位
       ListNode end = head.next;
       while (end!=null){
           //改变位
           mid.next = beg;
           //向后移动所有指针
           beg = mid;
           mid = end;
           end = end.next;
       }
       //处理最后一个节点
       mid.next = beg;
       return mid;
    }

    public static void main(String[] args) {
        Solution12602 solution12602 =  new Solution12602();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode result = solution12602.reverseList(listNode1);
        int count = 0;
        while (result!=null){
            System.out.println("count:"+count+";value:"+result.val);
            count++;
            result  = result.next;
        }
    }
}
