 # 解题思路

## 1.Hash表

引入一个hash表，key-value的格式为：ListNode -Integer，默认value为0；每取出一个head，判断hashmap是否有这个key，若存在就返回true；不存在就返回，遇到head为null跳出循环，默认返回false



### 1.1 代码

```java
public class Solution{
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
}
```

### 1.2 复杂度分析

* 时间复杂度：O(n),n为链表长度，需要遍历一次链表
* 空间复杂度：O(n),引入hashmap的长度

## 2.迭代追及

显然方法一不符合题目进阶条件，那还有什么优化空间复杂度的方法吗？有的。这里需要引入一个物理学中的概念，追及概念：

> 在一个环形跑道中，如果两个人有速度差，那么当快的一方（A）再次遇到慢的一方（B），A肯定已经领先B一圈了

我们也可以用这个概念来判断是否有环的问题，构建两个指针 slow，fast

其中slow一次移动一步，fast一次移动两步，当fast == slow的时候，说明整个链表有环

![](https://github.com/jiaoery/leetcode/tree/master/img/追及-物理.png)

### 2.1 代码

```java
public class Solution {
    //迭代
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head.next;

        if (slow==null){
            return false;
        }
        ListNode fast = slow.next;
        if(fast==null){
            return false;
        }

        while (slow!=null&&fast!=null){
            //fast reach slow
            if(slow==fast){
                return true;
            }
            //move slow to next
            slow = slow.next;
            //fast twice next
            fast = fast.next;
            if(fast==null){
                return false;
            }
            fast = fast.next;
        }
        return false;
    }
}
```

### 2.2 复杂度分析

* 时间复杂度：O(n),n为链表长度，需要遍历一次链表
* 空间复杂度：O(1)