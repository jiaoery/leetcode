# 解题思路

## 1.1二次遍历

这个题目可以用二次遍历实现



### 1.1 代码

```java
public class Solution{
  public ListNode middleNode(ListNode head) {
        ListNode temp = new ListNode(0,head);
        int length = 0;
        while (head!=null){
            length++;
            head = head.next;
        }
        for (int i = 0; i < length/2; i++) {
            temp = temp.next;
        }
        return temp.next;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O(n),n为链表长度
* 空间复杂度：O(1)

## 2.双指针

这可以可以用快慢双指针，其中慢指针slow一次走一下，快指针fast一次走两下；最终当快指针到达末尾的时候，慢指针正好在中间位置；



### 2.1 代码

```java
public class Solution{
 public ListNode middleNode(ListNode head) {
        ListNode slow = new ListNode(0,head);
        ListNode fast = new ListNode(0,head);
        while (fast!=null){
            slow = slow.next;
            fast = fast.next;
            if(fast==null){
                return slow;
            }else {
                fast = fast.next;
            }
        }
        return slow;
    }
}
```

### 2.2 复杂度分析

* 时间复杂度：O(n),n为链表长度
* 空间复杂度：O(1)