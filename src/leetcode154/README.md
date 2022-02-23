# 解题思路

这个与之前的链表相加不同，是倒序相加，高位数在左，低位数在右；这种思路都会想到栈，栈是先进后出，所以这里引入两个栈来保存两个链表的值，用一个参数level记录进位值；



## 1.1 代码

```java
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
```

## 1.2 复杂度分析

* 时间复杂度：O(M+N),M N 分别为两个链表的长度，需要入栈和出栈两个操作
* 空间复杂度：O(M+N),M N 分别为两个链表的长度，使用两个栈完成数据存储