package leetcode150;

import leetcode02.ListNode;

public class Solution15001 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head,fast  = head;
        while (true){
            //快指针为空，或快指针的下一个节点为null,代表没有环
            if(fast==null||fast.next==null){
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;
            //移动指针后比较，若相同，必存在环
            if(fast == slow){
                break;
            }
        }
        fast = head;
        //每次移动一个节点
        while (slow!=fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Solution15001 solution = new Solution15001();
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        System.out.println("result:"+solution.detectCycle(solution.detectCycle(node1)).val);
    }
}
