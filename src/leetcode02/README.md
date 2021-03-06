# 解题目思路

## 初等数学

这里使用变量来跟踪进位，并且从包含最低有效位的表头开始模拟逐位相加的过程：

![*图1，对两数相加方法的可视化: 342 + 465 = 807342+465=807，每个结点都包含一个数字，并且数字按位逆序存储。*](https://pic.leetcode-cn.com/Figures/2/2_add_two_numbers.svg)

# #算法

就像你在纸上计算两个数字的和那样，我们首先从最低有效位也就是列表 1 和 2 的表头开始相加。由于每位数字都应当处于0…9 的范围内，我们计算两个数字的和时可能会出现 “溢出”。例如，5 + 7 = 12。在这种情况下，我们会将当前位的数值设置为 2，并将进位 carry = 1 带入下一次迭代。进位 carry必定是0 或 1，这是因为两个数字相加（考虑到进位）可能出现的最大和为 9 + 9 + 1 = 19。

伪代码如下：

* 将当前结点初始化为返回链表的根结点。

* 将进位 carry初始化为 0。

* 将 p 和 q分别初始化为列表 1 和 2的头部。

  * 遍历链表1 和2 直至到达它们的尾端。
  * 将 x 设为结点 p 的值。如果 p已经到达1 的末尾，则将其值设置为 0。
  * 将 y设为结点 q 的值。如果 q 已经到达 2 的末尾，则将其值设置为 0。
  * 设定 sum = x + y + carry。
  * 更新进位的值，carry = sum / 10。
  * 创建一个数值为(sum%10) 的新结点，并将其设置为当前结点的下一个结点，然后将当前结点前进到下一个结点。
  * 同时，将 p 和 q 前进到下一个结点。

* 检查 carry = 1 是否成立，如果成立，则向返回链表追加一个含有数字 1 的新结点。
  返回结点的下一个结点。

  请注意，我们使用结点来简化代码。如果没有哑结点，则必须编写额外的条件语句来初始化表头的值。

  ## 代码效果

  ListNode

  ```java
  public class ListNode {
  	int val;
  	ListNode next;
  	public ListNode(int x) { val = x; }
  
  }
  ```

  Solution2

  ```java
  public class Solution{
  //递归的方式实现
      public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
          //链表的根节点
          ListNode root = new ListNode(0);
          //运算移动指针
          ListNode cursor = root;
          //向下一位带入参数
          int carry = 0;
  
          while(l1 != null || l2 !=null || carry!= 0){
              int l1var = l1!=null?l1.val:0;
              int l2var = l2!=null?l2.val:0;
              int sum = l1var + l2var + carry;
              //取进位
              carry = sum/10;
              ListNode next = new ListNode(sum%10);
              cursor.next = next;
              cursor = next;
              if(l1 != null) {
              	l1 = l1.next;
              }
              if(l2 != null) {
              	l2 = l2.next;
              }
      
          }
          return root.next;
      }
  }
  ```

  # 复杂度分析

* 时间复杂度：O(N),N为链表的长度

* 空间复杂度：O(1),除去返回空间，只有常数级的额外空间