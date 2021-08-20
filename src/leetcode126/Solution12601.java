package leetcode126;

import leetcode02.ListNode;

public class Solution12601 {

    //头插法反转链表
    public ListNode reverseList(ListNode head) {
        ListNode temp;
        ListNode p = null;
        while (head!=null) {
            temp = head;
            //head 向后移动
            head = head.next;
            //将temp取到的值指向p
            temp.next =p;
            //p指向temp所在位置
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
        Solution12601 solution12601 =  new Solution12601();
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;

        ListNode result = solution12601.reverseList(listNode1);
        int count = 0;
        while (result!=null){
            System.out.println("count:"+count+";value:"+result.val);
            count++;
            result  = result.next;
        }
    }
}
