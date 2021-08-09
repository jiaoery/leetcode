package leetcode124;

import leetcode02.ListNode;

public class Solution12401 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dump = head;
        while(l1!=null&&l2!=null){
            //判断l1和l2大小
            if(l1.val< l2.val){
                dump.next =l1;
                dump = dump.next;
                l1 = l1.next;
            }else {
                dump.next = l2;
                dump = dump.next;
                l2 = l2.next;
            }
        }

        //如果l1和l2一个存在空，就将另一个接到dump的尾部
        if(l1==null){
            dump.next = l2;
        }else {
            dump.next = l1;
        }
        return head.next;
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

        Solution12401 solution12401 = new Solution12401();
        ListNode head = solution12401.mergeTwoLists(node1,node4);

        int count =1;
        while (head!=null){
            System.out.println("count:"+count+++";value:"+head.val);
            head =head.next;
        }
    }
}
