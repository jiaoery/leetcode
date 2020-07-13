# Leetcode刷题记录
leetcode题库网址：[https://leetcode-cn.com/](https://leetcode-cn.com/)
## Question1:两数之和
* 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

>示例:
>给定 nums = [2, 7, 11, 15], target = 9
>因为 nums[0] + nums[1] = 2 + 7 = 9
>所以返回 [0, 1]

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode1)

## Question2:两数相加
* 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
您可以假设除了数字 0 之外，这两个数都不会以 0 开头。示例：

>输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
>输出：7 -> 0 -> 8
>原因：342 + 465 = 807

使用到的数据结构:链表结构
```
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
```
 解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode02)



# Questtion3:寻找数组的中心索引

* 给定一个整数类型的数组 `nums`，请编写一个能够返回数组 **“中心索引”** 的方法。

  我们是这样定义数组 **中心索引** 的：数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。

  如果数组不存在中心索引，那么我们应该返回 -1。如果数组有多个中心索引，那么我们应该返回最靠近左边的那一个。

  **示例 1：**

  ```
  输入：
  nums = [1, 7, 3, 6, 5, 6]
  输出：3
  解释：
  索引 3 (nums[3] = 6) 的左侧数之和 (1 + 7 + 3 = 11)，与右侧数之和 (5 + 6 = 11) 相等。
  同时, 3 也是第一个符合要求的中心索引。
  ```

  **示例 2：**

  ```
  输入：
  nums = [1, 2, 3]
  输出：-1
  解释：
  数组中不存在满足此条件的中心索引。
  ```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode03)