# 解题思路

## 1.二次遍历

第一思路就是可以先遍历一次获取链表长度，记为length，然后二次遍历到length-n前一个位置，也就是被删除目标结点前一个位置。这里为了方便统一处理，使用一个哨兵结点temp，指向head；

### 1.1代码

```java
public class Solution{
   public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return head;
        }
        int length = 0;
        ListNode temp = new ListNode(0);
        temp.next = head;
        //length
        while (head!=null){
            length++;
            head = head.next;
        }
        //lenth less than n
        if(length<n){
            return head;
        }
        //哨兵节点
        ListNode temp1 = temp;
        for (int i =0;i<length-n;i++){
            temp1 = temp1.next;
        }
        temp1.next = temp1.next.next;
        return temp.next;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度:O(n),其中n是链表长度
* 空间复杂度:O(1)

# 2.双指针

但是按照题意，这样无法满足只使用一遍扫描的办法；所以这里引入双指针，一个快指针fast先走n次，然后跟慢指针slow跟随，当fast处于最后位置时，慢指针正好在倒数第n个结点前。

### 2.1 代码

```java
public class Solution{}
 public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return head;
        }
        ListNode temp = new ListNode(0, head);
        ListNode slow = temp;
        ListNode fast = head;
        //较快的指针移动n位
        for (int i = 0; i < n; i++) {
            //如果位数不够，就直接返回原链表
            if (fast == null) {
                return head;
            }
            fast = fast.next;
        }
        //移动fast到尾部时，slow正好在倒数第n个位置处
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return temp.next;
    }
```

### 2.2 复杂度分析

* 时间复杂度:O(n),其中n是链表长度
* 空间复杂度:O(1)