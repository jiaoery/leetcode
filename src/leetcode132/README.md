# 解题思路

由于这道题中给定的链表是升序的，可以直接遍历整个链表完成判断，若`next.val = next.next.val`,判断条件`next.next!=null`,边界条件`next！=null`.

## 1.1 代码

```java
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode next = head;
        while (next.next!=null){
            if(next.val==next.next.val){
                next.next = next.next.next;
            }else {
                next = next.next;
            }
        }
        return head;
    }
}
```

## 1.2复杂度分析

*  时间复杂度：`O(n)`，需要遍历一次所有链表结点
* 空间复杂度：`O(1)`,由于使用原链表操作，不需要使用超出常量级的额外空间