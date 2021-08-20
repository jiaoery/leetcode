

# 解题思路

## 1.头插法反转

所谓头插法，是指在原有链表的基础上，依次将位于链表头部的节点摘下，然后采用从头部插入的方式生成一个新链表，则此链表即为原链表的反转版。

* 1) 创建一个新的空链表

![创建一个新链表](http://c.biancheng.net/uploads/allimg/200713/0U2342546-11.gif)

* 2) 从原链表中摘除头部节点 1，并以头部插入的方式将该节点添加到新链表中

![](http://c.biancheng.net/uploads/allimg/200713/0U2342R3-12.gif)

* 3)从原链表中摘除头部节点 2，以头部插入的方式将该节点添加到新链表中

![从原链表摘除节点 2，再添加到新链表中](http://c.biancheng.net/uploads/allimg/200713/0U23451H-13.gif)

* 4)继续重复以上工作，先后将节点 3、4 从原链表中摘除，并以头部插入的方式添加到新链表中

![从原链表摘除节点 3、4，再添加到新链表中](http://c.biancheng.net/uploads/allimg/200713/0U234C44-14.gif)

到这里完成了反转



### 1.1代码

```java
 public class Solution{
   public ListNode reverseList(ListNode head) {
        ListNode temp;
        ListNode p = null;
        while (head!=null) {
            temp = head;
            //head 向后移动
            head = head.next;
            //将temp取到的值指向p
            temp.next =p;
            //p指向temp所在位置
            p = temp;
        }
        return p;
    }
 }

```

### 1.2复杂度分析

* 时间复杂度分析：O(n),n为链表的长度，需要遍历一次链表
* 空间复杂度分析：O(n)，需要新建一条链表，长度为原链表长度

## 2.就地逆转法

那么是否可以在原来链表的基础上做逆转呢？当然可以的。但是，在原链表的基础上做修改，需要额外借助 2 个指针（假设分别为 beg 和 end），接下来用就地逆置法实现对该链表的反转：

* 初始状态下，令 beg 指向第一个节点，end 指向 beg->next，如图 

![就地反转链表的初始状态](http://c.biancheng.net/uploads/allimg/200713/0U2342L7-15.gif)

* 将 end 所指节点 2 从链表上摘除，然后再添加至当前链表的头部。如图 

![反转节点2](http://c.biancheng.net/uploads/allimg/200713/0U2341592-16.gif)

* 将 end 指向 beg->next，然后将 end 所指节点 3 从链表摘除，再添加到当前链表的头部

![反转节点3](http://c.biancheng.net/uploads/allimg/200713/0U2343N4-17.gif)

* 将 end 指向 beg->next，再将 end 所示节点 4 从链表摘除，并添加到当前链表的头部

![反转节点 4](http://c.biancheng.net/uploads/allimg/200713/0U2342259-18.gif)

到此就完成了对链表的反转



### 2.1 代码

```java
public classs Solution{
  public ListNode reverseList(ListNode head) {
        if (head==null||head.next==null){
            return head;
        }
        ListNode pre = head;
        ListNode end = head.next;
        while (end!=null){
            pre.next = end.next;
            end.next  = head;
            head = end;
            end = pre.next;
        }
        return head;
    }
}
```

### 2.2 复杂度分析

* 时间复杂度：O(n),n为链表长度，所有链表节点都需要被遍历一遍

* 空间复杂度：O(1)

## 3.迭代反转法

该算法的实现思想非常直接，就是从当前链表的首元节点开始，一直遍历至链表的最后一个节点，这期间会逐个改变所遍历到的节点的指针域，另其指向前一个节点。

具体的实现方法也很简单，借助 3 个指针即可。![迭代反转链表的初始状态](http://c.biancheng.net/uploads/allimg/200713/0U23460R-2.gif)

* 我们先改变 mid 所指节点的指针域指向，另其和 beg 相同（即改为 NULL），然后再将 3 个指针整体各向后移动一个节点

![迭代反转链表过程一](http://c.biancheng.net/uploads/allimg/200713/0U2345228-3.gif)

* 先改变 mid 所指节点的指针域指向，另其和 beg 相同（指向节点 1 ），再将 3 个指针整体各向后移动一个节点

![迭代反转链表过程二](http://c.biancheng.net/uploads/allimg/200713/0U2343502-4.gif)

* 持续以上操作，到end 到null节点

  ![迭代反转链表过程三](http://c.biancheng.net/uploads/allimg/200713/0U2345331-5.gif)

* ​		将mid的指针指向beg，此时完成了链表反转

  ![迭代反转链表过程四](http://c.biancheng.net/uploads/allimg/200713/0U23460G-6.gif)

### 3.1 代码

```java
public class Solution{
   public ListNode reverseList(ListNode head) {
        ListNode temp;
        ListNode p = null;
        while (head!=null) {
            temp = head;
            //head 向后移动
            head = head.next;
            //将temp取到的值指向p
            temp.next =p;
            //p指向temp所在位置
            p = temp;
        }
        return p;
    }
}
```

### 3.2 复杂度分析

* 时间复杂度：O(n),n为链表长度，所有链表节点都需要被遍历一遍

* 空间复杂度：O(1)

## 4.递归反转法

和迭代反转法的思想恰好相反，递归反转法的实现思想是从链表的尾节点开始，依次向前遍历，遍历过程依次改变各节点的指向，即另其指向前一个节点

具体思路如下：

* 符合极限条件下，第一次递归返回点

![递归反转链表过程一](http://c.biancheng.net/uploads/allimg/200713/0U2343055-7.gif)

* 这里完成第一个递归点的返回后，head向前移动一位

![递归反转链表过程二](http://c.biancheng.net/uploads/allimg/200713/0U23413F-8.gif)

* 继续向前递归，每次head向前移动一位

![递归反转链表过程三](http://c.biancheng.net/uploads/allimg/200713/0U234D49-9.gif)

* 完成所有递归后

  ![递归反转链表过程四](http://c.biancheng.net/uploads/allimg/200713/0U2345454-10.gif)

  返回new_head

  ### 4.1代码

  ```java
  public class Solution{
    public ListNode reverseList(ListNode head) {
          if(head==null||head.next==null){
              return head;
          }
          ListNode newNode = reverseList(head.next);
          head.next.next = head;
          head.next = null;
          return newNode;
      }
  }
  ```

  ### 4.2 复杂度分析

* 时间复杂度：O(n),n为链表长度，所有链表节点都需要被遍历一遍

* 空间复杂度：O(1)