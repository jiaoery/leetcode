package leetcode154;

import leetcode02.ListNode;

import java.util.Stack;

public class Solution15401 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(l1!=null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        ListNode pre = null;
        int level = 0;
        while(!stack1.isEmpty()||!stack2.isEmpty()||level!=0){
            int sum = level;
            sum += stack1.isEmpty()?0:stack1.pop();
            sum += stack2.isEmpty()?0:stack2.pop();
            ListNode temp = new ListNode(sum%10);
            temp.next = pre;
            pre = temp;
            level = sum/10;
        }
        return pre;
    }
}
