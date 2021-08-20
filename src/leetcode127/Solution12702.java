package leetcode127;

import leetcode02.ListNode;

import java.util.HashMap;

public class Solution12702 {

    /**
     * hash表
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> hashMap = new HashMap<>();
        while (head!=null){
            if(hashMap.getOrDefault(head,0)==1){
                return true;
            }else {
                hashMap.put(head,1);
            }
            head = head.next;
        }
        return false;
    }


    public static void main(String[] args) {
        Solution12702 solution12702 = new Solution12702();
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(0);
        ListNode listNode4 = new ListNode(-4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode2;
        System.out.println("isCircle:"+solution12702.hasCycle(listNode1));

        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(2);
        ListNode listNode7 = new ListNode(0);
        ListNode listNode8 = new ListNode(-4);
        System.out.println("isCircle:"+solution12702.hasCycle(listNode5));
        listNode6.next = listNode7;
        listNode7.next = listNode8;
        listNode8.next = listNode6;
        System.out.println("isCircle:"+solution12702.hasCycle(listNode6));
    }
}
