# 解题思路

本题需要复制原有的链表，并且还附带一个随机结点的需求；那么问题可以分解为两个：

* 复制原有链表结构
* 复制原有链表随机结点的结构

问题1：复制原有链表结构，可以分解为以下几个步骤：

* 构建一个用来同步的同步结点temp = head

* 构建一个前置结点pre
* 构建一个哨兵结点 sentry
* sentry = pre（用来返回结点，和做二次操作）
* 每次复制一个新节点newNode，让pre指向它，并移动temp结点
* 当temp完成遍历时，pre结点也完成了链表基本结构复制

问题2：复制原有链表随机结点的结构？

如何解决新旧链表结点中随机结点的复制问题呢，其实问题的关键就在一新旧节点的对应；这里就可以使用HashMap构建新旧节点的关系表，在上面复制原有链表结构时，就构建出对应key-value关系。

* 再次遍历两个链表，按HashMap对应关系处理random结点



## 1.1 代码

~~~java
public class Solution {

    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hashMap = new HashMap<>();
        Node temp = head;
        Node pre = new Node(-1);
        //sentry 为哨兵结点
        Node sentry = pre;
        //第一次构建next的结构
        while(temp !=null){
            Node newNode = new Node(temp.val);
            pre.next = newNode;
            //记录结点对应位置
            hashMap.put(temp,newNode);
            pre = pre.next;
            temp = temp.next;
        }
        temp = head;
        pre = sentry.next;
        while (temp!=null){
            pre.random =                 hashMap.getOrDefault(temp.random,null);
            temp = temp.next;
            pre = pre.next;
        }
        return sentry.next;
    }
}
~~~

## 1.2 复杂度分析

* 时间复杂度：O(N),N为链表长度，需要遍历链表两次，分别完成结构和随机结点复制
* 空间复杂度：O(N),N为链表长度，用来存储新旧节点的HashMap使用