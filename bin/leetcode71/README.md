# 解题思路

这道题目是链表排排序的题目类型，难点就在于如何移动节点。基本的思路就是可以维护一个新的有序序列，初始时整个序列只有一个节点，取原链表的数据，逐渐加入到这个新的序列中。

对链表进行插入排序的具体过程如下。

 * 1.首先判断给定的链表是否为空，若是为空，则不需要进行排序，直接返回即可。

 * 2.创造虚拟节点`temp`，令`temp.next = next`.引入虚拟节点的目的就是为了方便在原序列head节点之前也能插入节点

 * 3.定义两个节点 `lastSorted`为链表已排序部分的最后一个节点，初始时 `lastSorted = head`

 * 4.维护一个节点`cur`用来取待插入的元素，初始时`curr = head.next`

 * 5.比较 `lastSorted` 和 `curr` 的节点值。

    * 若 `astSorted.val <= curr.val`，说明 `curr` 应该位于 `lastSorted` 之后，将 `lastSorted` 后移一位，`curr` 变成新的 `lastSorted`。

    * 否则，从链表的头节点开始往后遍历链表中的节点，寻找插入 `curr` 的位置。令 `prev` 为插入 `curr` 的位置的前一个节点，进行如下操作，完成对 `curr` 的插入：

      ```java
      lastSorted.next = curr.next
      curr.next = prev.next
      prev.next = curr
      ```

* 6.令 `curr = lastSorted.next`，此时 `curr` 为下一个待插入的元素。

* 7.重复第 5 步和第 6 步，直到 `curr` 变成空，排序结束。

* 8.返回 `dummyHead.next`，为排序后的链表的头节点。

## 1.1 代码

```java
public ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return null;
		}
		//虚拟一个头结点
		ListNode temp = new ListNode(Integer.MAX_VALUE);
		temp.next = head;
		//已经排序的节点
		ListNode lastSorted =   head;
		//检查节点
		ListNode curr = head;
		//检查当前节点是否为空
		 while (curr != null) {
	            if (lastSorted.val <= curr.val) {
	                lastSorted = lastSorted.next;
	            } else {
	                ListNode prev = temp;
	                while (prev.next.val <= curr.val) {
	                    prev = prev.next;
	                }
	                lastSorted.next = curr.next;
	                curr.next = prev.next;
	                prev.next = curr;
	            }
	            curr = lastSorted.next;
	        }

		return temp.next;
    }
```

##  1.2 复杂度分析

* 时间复杂度：O(N^2）,其中n是链表的长度
* 空间复杂度：O(1)