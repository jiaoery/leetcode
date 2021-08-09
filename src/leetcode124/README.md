# 解题思路
# 1.迭代
首先，我们设定一个哨兵节点 `head` ，这可以在最后让我们比较容易地返回合并后的链表。
我们维护一个 `dump` 指针，我们需要做的是调整它的 `next` 指针。然后，我们重复以下过程，
直到 `l1 `或者 `l2` 指向了 `null` ：如果 `l1` 当前节点的值小于等于 `l2` ，我们就把 `l1` 当前的节点接在
`dump` 节点的后面同时将 `l1 `指针往后移一位。否则，我们对 `l2 `做同样的操作。不管我们将哪一个元素接在
了后面，我们都需要把 dump 向后移一位。

在循环终止的时候， `l1` 和 `l2` 至多有一个是非空的。由于输入的两个链表都是有序的，所以不管哪个链表是
非空的，它包含的所有元素都比前面已经合并链表中的所有元素都要大。这意味着我们只需要简单地将非空链表
接在合并链表的后面，并返回合并链表即可。

## 1.1 代码
```java
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode dump = head;
        while (l1 != null && l2 != null) {
            //判断l1和l2大小
            if (l1.val < l2.val) {
                dump.next = l1;
                dump = dump.next;
                l1 = l1.next;
            } else {
                dump.next = l2;
                dump = dump.next;
                l2 = l2.next;
            }
        }

        //如果l1和l2一个存在空，就将另一个接到dump的尾部
        if (l1 == null) {
            dump.next = l2;
        } else {
            dump.next = l1;
        }
        return head.next;
    }
}
```

## 1.2 复杂度分析
* 时间复杂度：`O(m+n)`,`m`为`l1`的长度，`n`为`l2`的长度；新的链表需要遍历原链表
* 空间复杂度：`O(1)`,仅使用若干变量

# 2.递归
如果 `l1` 或者 `l2` 一开始就是空链表 ，那么没有任何操作需要合并，所以我们只需要返回非空链表。
否则，我们要判断 `l1` 和 `l2`哪一个链表的头节点的值更小，然后递归地决定下一个添加到结果里的节点。
如果两个链表有一个为空，递归结束。

## 2.1 代码
```java
public class Solution12402 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l2.val > l1.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
```

## 2.2 复杂度分析
* 时间复杂度：`O(m+n)`,`m`为`l1`的长度，`n`为`l2`的长度；新的链表需要遍历原链表
* 空间复杂度：`O(m+n)`,`m`为`l1`的长度，`n`为`l2`的长度；新的链表需要遍历原链表



