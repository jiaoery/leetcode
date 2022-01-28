# 解题思路

本题的解题思路可以分为两个点：

* 链表是否有环
* 环的入口位置

问题1在leetcode问题 [141. 环形链表](https://leetcode-cn.com/problems/linked-list-cycle/)上使用**快慢指针**已经解决，可以沿用，那么问题2，如何找到环的入环节点呢？

首先分析下判断是否有环的时候，若是有环，快慢指针分别走的距离，假设有环的链表结构如下：![快慢指针寻找环](快慢指针寻找环.png)

那么slow指针移动距离为 `a+b`,那么fast指针的移动距离为` a+b+n(b+c)`,并且由于快指针是慢指针移动速度的两倍，那么fast指针的移动距离又可表示为`2*(a+b）`,那么形成公式` 2*（a+b） = a+b+n(b+c)`;简化后的公式为：

* `a=（n-1)(b+c)+c`

由于b+c是环的长度，也就是说 a的长度等于（n-1）个环的长度，并且相遇点到入环点的距离，如果此时把fast指针指回head位置，每次slow和fast指针移动一个节点，最终两个指针再次相遇的地方就是入环点。

## 1.1 代码

```java
public class Solution{
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
}
```



## 复杂度分析

* 时间复杂度：`O(N)`,`N`为链表的长度，第一次判断是否有环需要循环一次，第二次找入环口需要循环一次，总共是两次，`2N`次
* 空间复杂度：`O(1）`，仅仅使用快慢指针两个节点