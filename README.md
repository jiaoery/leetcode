# Leetcode刷题记录
leetcode题库网址：[https://leetcode-cn.com/](https://leetcode-cn.com/)
## Question1:两数之和
* 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。

>示例:
>给定 nums = [2, 7, 11, 15], target = 9
>因为 nums[0] + nums[1] = 2 + 7 = 9
>所以返回 [0, 1]

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode01)

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

# Question4：搜索插入位置

* 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
* 你可以假设数组中无重复元素。

**示例 1:**

```
输入: [1,3,5,6], 5
输出: 2
```

**示例 2:**

```
输入: [1,3,5,6], 2
输出: 1
```

**示例 3:**

```
输入: [1,3,5,6], 7
输出: 4
```

**示例 4:**

```
输入: [1,3,5,6], 0
输出: 0
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode04)

# Question5：打乱数组

* 打乱一个没有重复元素的数组。 

**示例:**

```java
// 以数字集合 1, 2 和 3 初始化数组。
int[] nums = {1,2,3};
Solution solution = new Solution(nums);

// 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
solution.shuffle();

// 重设数组到它的初始状态[1,2,3]。
solution.reset();

// 随机返回数组[1,2,3]打乱后的结果。
solution.shuffle();


```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode05)

# Question6:旋转数组

* 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。

**示例 1:**

```
输入: [1,2,3,4,5,6,7] 和 k = 3
输出: [5,6,7,1,2,3,4]
解释:
向右旋转 1 步: [7,1,2,3,4,5,6]
向右旋转 2 步: [6,7,1,2,3,4,5]
向右旋转 3 步: [5,6,7,1,2,3,4]
```

**示例 2:**

```
输入: [-1,-100,3,99] 和 k = 2
输出: [3,99,-1,-100]
解释: 
向右旋转 1 步: [99,-1,-100,3]
向右旋转 2 步: [3,99,-1,-100]
```


**说明:**

* 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
* 要求使用空间复杂度为 O(1) 的 原地 算法。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode06)

# Question7:除数博弈

爱丽丝和鲍勃一起玩游戏，他们轮流行动。爱丽丝先手开局。

最初，黑板上有一个数字 N 。在每个玩家的回合，玩家需要执行以下操作：

* 选出任一 x，满足 0 < x < N 且 N % x == 0 。
* 用 N - x 替换黑板上的数字 N 。
* 如果玩家无法执行这些操作，就会输掉游戏。

只有在爱丽丝在游戏中取得胜利时才返回 True，否则返回 false。假设两个玩家都以最佳状态参与游戏。

 

**示例 1：**

> 输入：2
> 输出：true
> 解释：爱丽丝选择 1，鲍勃无法进行操作。

**示例 2：**

> 输入：3
> 输出：false
> 解释：爱丽丝选择 1，鲍勃也选择 1，然后爱丽丝无法进行操作。

**提示：**

> 1 <= N <= 1000

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode07)

## Question8:二叉树最大深度

给定一个二叉树，找出其最大深度。

二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。

**说明:**叶子节点是指没有子节点的节点。

**示例：**
给定二叉树 [3,9,20,null,null,15,7]，

     3
    / \
    9  20
      /  \
     15   7

返回它的最大深度 3 。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode08)

## Question9:整数反转

给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

**示例 1:**

> 输入: 123
> 输出: 321

**示例 2:**

> 输入: -123
> 输出: -321

**示例 3:**

> 输入: 120
> 输出: 21

**注意:**

假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−231,  231 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode09)

## Question10：魔术索引

魔术索引。 在数组A[0...n-1]中，有所谓的魔术索引，满足条件A[i] = i。给定一个有序整数数组，编写一种方法找出魔术索引，若有的话，在数组A中找出一个魔术索引，如果没有，则返回-1。若有多个魔术索引，返回索引值最小的一个。

**示例1:**

> 输入：nums = [0, 2, 3, 4, 5]
>  输出：0
>  说明: 0下标的元素为0

**示例2:**

>  输入：nums = [1, 1, 1]
>  输出：1

**说明:**

​	此题为原书中的 Follow-up，即数组中可能包含重复元素的版本

**提示:**

​	nums长度在[1, 1000000]之间

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode10)

# Question11：字符串相加

给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。

**注意：**

> 1.num1 和num2 的长度都小于 5100.
> 2.num1 和num2 都只包含数字 0-9.
> 3.num1 和num2 都不包含任何前导零。
> **4.你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式。**

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode11)

# Question12:删除数组中重复项

给定一个排序数组，你需要在 原地 删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。 

**示例 1:**

> 给定数组 nums = [1,1,2], 
>
> 函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。 
>
> 你不需要考虑数组中超出新长度后面的元素。

**示例 2:**

> 给定 nums = [0,0,1,1,1,2,2,3,3,4],
>
> 函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
>
> 你不需要考虑数组中超出新长度后面的元素。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode12)

# Question13：打家劫舍

你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。

给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。

 

**示例 1：**

> 输入：[1,2,3,1]
> 输出：4
> 解释：偷窃 1 号房屋 (金额 = 1) ，然后偷窃 3 号房屋 (金额 = 3)。
>      偷窃到的最高金额 = 1 + 3 = 4 。

**示例 2：**

> 输入：[2,7,9,3,1]
> 输出：12
> 解释：偷窃 1 号房屋 (金额 = 2), 偷窃 3 号房屋 (金额 = 9)，接着偷窃 5 号房屋 (金额 = 1)。
>      偷窃到的最高金额 = 2 + 9 + 1 = 12 。

**提示：**

> 0 <= nums.length <= 100
> 0 <= nums[i] <= 400

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode13)

# Question14：斐波那契数列（剑指offer10-1）

写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：

> F(0) = 0,   F(1) = 1
> F(N) = F(N - 1) + F(N - 2), 其中 N > 1.

斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。

答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。

 

**示例 1：**

> 输入：n = 2
> 输出：1

**示例 2：**

> 输入：n = 5
> 输出：5

**提示：**

> 0 <= n <= 100

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode14)

# Question 15:相同的树（二叉树遍历）

给定两个二叉树，编写一个函数来检验它们是否相同。

如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

**示例 1:**

> 输入:       1         1
>                / \       / \
>               2   3     2   3
>
> ​            [1,2,3],   [1,2,3]
>
> 输出: true


**示例 2:**

> 输入:        1        1
>                 /           \
>               2             2
>
> ​           [1,2],     [1,null,2]
>
> 输出: false


**示例 3:**

> 输入:        1        1
>                 / \       / \
>                2   1     1   2
>
>  [1,2,1],   [1,1,2]
>
> 输出: false

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode15)

# Question16：计数二进制字串

给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。

重复出现的子串要计算它们出现的次数。

**示例 1 :**

> 输入: "00110011"
> 输出: 6
> 解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
>
> 请注意，一些重复出现的子串要计算它们出现的次数。
>
> 另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。

**示例 2 :**

> 输入: "10101"
> 输出: 4
> 解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。

**注意：**

> s.length 在1到50,000之间。
> s 只包含“0”或“1”字符。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode16)

# Question 17：数组中重复的数字

找出数组中重复的数字。


在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。

**示例 1：**

> **输入：**
> [2, 3, 1, 0, 2, 5, 3]
> **输出：**2 或 3 

**限制：**

> 2 <= n <= 100000

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode17)

# Question18：字符串相乘

**ps:本题目与Question11为相同类型**

给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。

**示例 1:**

> 输入: num1 = "2", num2 = "3"
> 输出: "6"

**示例 2:**

> 输入: num1 = "123", num2 = "456"
> 输出: "56088"

**说明：**

> 1.num1 和 num2 的长度小于110。
> 2.num1 和 num2 只包含数字 0-9。
> 3.num1 和 num2 均不以零开头，除非是数字 0 本身。
> 4.不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode18)

# Question19：有效括号

给定一个只包括 `'('`，`')'`，`'{'`，`'}'`，`'['`，`']'` 的字符串，判断字符串是否有效。

有效字符串需满足：

> 1. 左括号必须用相同类型的右括号闭合。
> 2. 左括号必须以正确的顺序闭合。

注意空字符串可被认为是有效字符串。

**示例 1:**

```
输入: "()"
输出: true
```

**示例 2:**

```
输入: "()[]{}"
输出: true
```

**示例 3:**

```
输入: "(]"
输出: false
```

**示例 4:**

```
输入: "([)]"
输出: false
```

**示例 5:**

```
输入: "{[]}"
输出: true
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode19)

# Question20：平衡二叉树（递归算法）

给定一个二叉树，判断它是否是高度平衡的二叉树。

本题中，一棵高度平衡二叉树定义为：

> 一个二叉树*每个节点* 的左右两个子树的高度差的绝对值不超过1。

**示例 1:**

给定二叉树 `[3,9,20,null,null,15,7]`

```
    3
   / \
  9  20
    /  \
   15   7
```

**示例 2:**

给定二叉树 `[1,2,2,3,3,null,null,4,4]`

```
       1
      / \
     2   2
    / \
   3   3
  / \
 4   4
```

返回 `false` 。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode20)

# Question21： 错误的集合(统计数组元素)

集合 `S` 包含从`1`到 `n` 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。

给定一个数组 `nums` 代表了集合 `S `发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。

**示例 1:**

```
输入: nums = [1,2,2,4]
输出: [2,3]
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode21)

# Question 22: 数组的度

给定一个非空且只包含非负数的整数数组 `nums`, 数组的度的定义是指数组里任一元素出现频数的最大值。

你的任务是找到与 `nums` 拥有相同大小的度的最短连续子数组，返回其长度。

**示例 1:**

> 输入: [1, 2, 2, 3, 1]
> 输出: 2
> 解释: 
> 输入数组的度是2，因为元素1和2的出现频数最大，均为2.
> 连续子数组里面拥有相同度的有如下所示:
> [1, 2, 2, 3, 1], [1, 2, 2, 3], [2, 2, 3, 1], [1, 2, 2], [2, 2, 3], [2, 2]
> 最短连续子数组[2, 2]的长度为2，所以返回2.

**示例 2:**

> 输入: [1,2,2,3,1,4,2]
> 输出: 6

**注意:**

> nums.length 在1到50,000区间范围内。
> nums[i] 是一个在0到49,999范围内的整数。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode22)

# Question23: 找到所有数字中消失的数字

给定一个范围在  `1 ≤ a[i] ≤ n ( n = 数组大小 )` 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。

找到所有在` [1, n]` 范围之间没有出现在数组中的数字。

您能在不使用额外空间且时间复杂度为`O(n)`的情况下完成这个任务吗? 你可以假定返回的数组不算在额外空间内。

**示例:**

```
输入:
[4,3,2,7,8,2,3,1]

输出:
[5,6]
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode23)

# Question24：数组中的重复元素

给定一个整数数组` a`，其中`1 ≤ a[i] ≤ n `（`n`为数组长度）, 其中有些元素出现两次而其他元素出现一次。

找到所有出现两次的元素。

你可以不用到任何额外空间并在`O(n)`时间复杂度内解决这个问题吗？

**示例：**

```
输入:
[4,3,2,7,8,2,3,1]

输出:
[2,3]
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode24)

# Question 25： 数的最小深度

ps；这道题跟question8是一个类型题目

给定一个二叉树，找出其最小深度。

最小深度是从根节点到最近叶子节点的最短路径上的节点数量。

**说明:** 叶子节点是指没有子节点的节点。

**示例:**

给定二叉树 `[3,9,20,null,null,15,7]`,

```
    3
   / \
  9  20
    /  \
   15   7
```

返回它的最小深度  2.

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode25)
# Question26：缺失的第一个正数
给你一个未排序的整数数组，请你找出其中没有出现的最小的正整数。
**示例 1:**

```
输入: [1,2,0]
输出: 3
```

**示例 2:**

```
输入: [3,4,-1,1]
输出: 2
```

**示例 3:**

```
输入: [7,8,9,11,12]
输出: 1
```


**提示：**

你的算法的时间复杂度应为O(n)，并且只能使用常数级别的额外空间。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode26)

# Question27：数字范围按位与

给定范围 `[m, n]`，其中 `0 <= m <= n <= 2147483647`，返回此范围内所有数字的按位与（包含 `m, n` 两端点）。

**示例 1:** 

```
输入: [5,7]
输出: 4
```

**示例 2:**

```
输入: [0,1]
输出: 0
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode27)

# Question28： 重复的子字符串

给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。

**示例 1:**

```
输入: "abab"

输出: True

解释: 可由子字符串 "ab" 重复两次构成。
```

**示例 2:**

```
输入: "aba"

输出: False
```

**示例 3:**

```
输入: "abcabcabcabc"

输出: True

解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
```



解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode28)

# Question29：H指数

给定一位研究者论文被引用次数的数组（被引用次数是非负整数）。编写一个方法，计算出研究者的 `h` 指数。

`h `指数的定义：`h` 代表“高引用次数”（high citations），一名科研人员的` h `指数是指他（她）的 （`N `篇论文中）总共有 `h` 篇论文分别被引用了至少 `h` 次。（其余的 `N - h` 篇论文每篇被引用次数 不超过` h `次。）

例如：某人的 `h` 指数是 20，这表示他已发表的论文中，每篇被引用了至少 20 次的论文总共有 20 篇。

**示例：**

```
输入：citations = [3,0,6,1,5]
输出：3 
解释：给定数组表示研究者总共有 5 篇论文，每篇论文相应的被引用了 3, 0, 6, 1, 5 次。
     由于研究者有 3 篇论文每篇 至少 被引用了 3 次，其余两篇论文每篇被引用 不多于 3 次，所以她的 h 指数是 3。
```

**提示：**如果 *h* 有多种可能的值，*h* 指数是其中最大的那个。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode29)

# Question30:最小移动次数使数组元素相等。

给定一个长度为 *n* 的**非空**整数数组，找到让数组所有元素相等的最小移动次数。每次移动将会使 *n* - 1 个元素增加 1。(每次除一个最大值外，其他元素增加1；)

**示例:**

```
输入:
[1,2,3]

输出:
3

解释:
只需要3次移动（注意每次移动会增加两个元素的值）：

[1,2,3]  =>  [2,3,3]  =>  [3,4,3]  =>  [4,4,4]
```


解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode30)

# Question31:如何判断一个链表具有环

如下图所示，有一个单向链表，如何验证该链表是否具备环？

![如何判定链表有环.png](https://upload-images.jianshu.io/upload_images/2326194-708f12d2e7511eb5.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode31)

# Question32: 非递减数列

给你一个长度为 `n `的整数数组，请你判断在 最多 改变 `1`个元素的情况下，该数组能否变成一个非递减数列。

我们是这样定义一个非递减数列的： 对于数组中所有的` i (0 <= i <= n-2)`，总满足 `nums[i] <= nums[i + 1]`。

**示例 1:**

```
输入: nums = [4,2,3]
输出: true
解释: 你可以通过把第一个4变成1来使得它成为一个非递减数列。
```

**示例 2:**

```
输入: nums = [4,2,1]
输出: false
解释: 你不能在只改变一个元素的情况下将其变为非递减数列。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode32)

# Question33：移动零

给定一个数组 `nums`，编写一个函数将所有 `0` 移动到数组的末尾，同时保持非零元素的相对顺序。

**示例:**

```
输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
```

**说明**:

>1. 必须在原数组上操作，不能拷贝额外的数组。
>2. 尽量减少操作次数。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode33)

# Question34:杨辉三角形

给定一个非负整数 *numRows，*生成杨辉三角的前 *numRows* 行。

![img](https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif)

在杨辉三角中，每个数是它左上方和右上方的数的和

**示例:**

```
输入: 5
输出:
[
     [1],
    [1,1],
   [1,2,1],
  [1,3,3,1],
 [1,4,6,4,1]
]
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode34)

# Question35：杨辉三角II

给定一个非负索引 *k*，其中 *k* ≤ 33，返回杨辉三角的第 *k* 行。

![img](https://upload.wikimedia.org/wikipedia/commons/0/0d/PascalTriangleAnimated2.gif)

在杨辉三角中，每个数是它左上方和右上方的数的和。

**示例:**

```
输入: 3
输出: [1,3,3,1]
```

**进阶：**

你可以优化你的算法到 *O*(*k*) 空间复杂度吗？

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode35)

# Question36：图片平滑器

包含整数的二维矩阵 M 表示一个图片的灰度。你需要设计一个平滑器来让每一个单元的灰度成为平均灰度 (向下舍入) ，平均灰度的计算是周围的8个单元和它本身的值求平均，如果周围的单元格不足八个，则尽可能多的利用它们。

**示例 1:**

```
输入:
[[1,1,1],
 [1,0,1],
 [1,1,1]]
输出:
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
解释:
对于点 (0,0), (0,2), (2,0), (2,2): 平均(3/4) = 平均(0.75) = 0
对于点 (0,1), (1,0), (1,2), (2,1): 平均(5/6) = 平均(0.83333333) = 0
对于点 (1,1): 平均(8/9) = 平均(0.88888889) = 0
```

**注意:**

1. 给定矩阵中的整数范围为 [0, 255]。
2. 矩阵的长和宽的范围均为 [1, 150]。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode36)

# Question37: 二叉树的中序遍历

给定一个二叉树，返回它的**中序 **遍历。

**示例:**

```
输入: [1,null,2,3]
   1
    \
     2
    /
   3

输出: [1,3,2]
```

**进阶:** 递归算法很简单，你可以通过迭代算法完成吗？

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode37)

# Question38：范围求和II

给定一个初始元素全部为 0，大小为 m*n 的矩阵 M 以及在 M 上的一系列更新操作。

操作用二维数组表示，其中的每个操作用一个含有两个正整数 a 和 b 的数组表示，含义是将所有符合 0 <= i < a 以及 0 <= j < b 的元素 M[i][j] 的值都增加 1。

在执行给定的一系列操作后，你需要返回矩阵中含有最大整数的元素个数。

**示例 1:**

```
输入: 
m = 3, n = 3
operations = [[2,2],[3,3]]
输出: 4
解释: 
初始状态, M = 
[[0, 0, 0],
 [0, 0, 0],
 [0, 0, 0]]
 
执行完操作 [2,2] 后, M = 
[[1, 1, 0],
 [1, 1, 0],
 [0, 0, 0]]

执行完操作 [3,3] 后, M = 
[[2, 2, 1],
 [2, 2, 1],
 [1, 1, 1]]

M 中最大的整数是 2, 而且 M 中有4个值为2的元素。因此返回 4。
```

**注意:**

> 1.m 和 n 的范围是 [1,40000]。
>
> 2.a 的范围是 [1,m]，b 的范围是 [1,n]。
>
> 3.操作数目不超过 10000。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode38)

# Question39：翻转二叉树

翻转一棵二叉树。

**示例：**

输入：

```
     4
   /   \
  2     7
 / \   / \
1   3 6   9
```

输出：

```
     4
   /   \
  7     2
 / \   / \
9   6 3   1
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode39)

# Question40：甲板上的战舰

给定一个二维的甲板， 请计算其中有多少艘战舰。 战舰用 `'X'`表示，空位用 `'.'`表示。 你需要遵守以下规则：

* 给你一个有效的甲板，仅由战舰或者空位组成。
* 战舰只能水平或者垂直放置。换句话说,战舰只能由 1xN (1 行, N 列)组成，或者 Nx1 (N 行, 1 列)组成，其中N可以是任意大小。
* 两艘战舰之间至少有一个水平或垂直的空位分隔 - 即没有相邻的战舰。

**示例 :**

```
X..X
...X
...X
```

在上面的甲板中有2艘战舰。

**无效样例 :**

```
...X
XXXX
...X
```

你不会收到这样的无效甲板 - 因为战舰之间至少会有一个空位将它们分开。

**进阶:**

你可以用**一次扫描算法**，只使用**O(1)额外空间，**并且**不修改**甲板的值来解决这个问题吗？

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode40)

## Question41：旋转数组

给定一个长度为 *n* 的整数数组 `A` 。

假设 `Bk` 是数组 `A` 顺时针旋转 *k* 个位置后的数组，我们定义 `A` 的“旋转函数” `F` 为：

`F(k) = 0 * Bk[0] + 1 * Bk[1] + ... + (n-1) * Bk[n-1]`。

计算`F(0), F(1), ..., F(n-1)`中的最大值。

**注意:**
可以认为 *n* 的值小于 105。

**示例:**

```
A = [4, 3, 2, 6]

F(0) = (0 * 4) + (1 * 3) + (2 * 2) + (3 * 6) = 0 + 3 + 4 + 18 = 25
F(1) = (0 * 6) + (1 * 4) + (2 * 3) + (3 * 2) = 0 + 4 + 6 + 6 = 16
F(2) = (0 * 2) + (1 * 6) + (2 * 4) + (3 * 3) = 0 + 6 + 8 + 9 = 23
F(3) = (0 * 3) + (1 * 2) + (2 * 6) + (3 * 4) = 0 + 2 + 12 + 12 = 26

所以 F(0), F(1), F(2), F(3) 中的最大值是 F(3) = 26 。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode41)

#	Question42: 螺旋矩阵

给定一个包含 *m* x *n* 个元素的矩阵（*m* 行, *n* 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。

**示例 1:**

```
输入:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
输出: [1,2,3,6,9,8,7,4,5]
```

**示例 2:**

```
输入:
[
  [1, 2, 3, 4],
  [5, 6, 7, 8],
  [9,10,11,12]
]
输出: [1,2,3,4,8,12,11,10,9,5,6,7]
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode42)

# Question43:合并二叉树

给定两个二叉树，想象当你将它们中的一个覆盖到另一个上时，两个二叉树的一些节点便会重叠。

你需要将他们合并为一个新的二叉树。合并的规则是如果两个节点重叠，那么将他们的值相加作为节点合并后的新值，否则**不为** NULL 的节点将直接作为新二叉树的节点。

**示例 1:**

```
输入: 
	Tree 1                     Tree 2                  
          1                         2                             
         / \                       / \                            
        3   2                     1   3                        
       /                           \   \                      
      5                             4   7                  
输出: 
合并后的树:
	     3
	    / \
	   4   5
	  / \   \ 
	 5   4   7

```

**注意:** 合并必须从两个树的根节点开始

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode43)

# Question44：螺旋矩阵II

给定一个正整数 *n*，生成一个包含 1 到 *n*2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。

**示例:**

```
输入: 3
输出:
[
 [ 1, 2, 3 ],
 [ 8, 9, 4 ],
 [ 7, 6, 5 ]
]
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode44)

# Question45: 对角线遍历

给定一个含有 M x N 个元素的矩阵（M 行，N 列），请以对角线遍历的顺序返回这个矩阵中的所有元素，对角线遍历如下图所示。

 

**示例:**

```
输入:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]

输出:  [1,2,4,7,5,3,6,8,9]

解释:

```

![img](https://assets.leetcode-cn.com/aliyun-lc-upload/uploads/2018/10/12/diagonal_traverse.png)

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode45)

# Question46:重塑矩阵

在MATLAB中，有一个非常有用的函数 `reshape`，它可以将一个矩阵重塑为另一个大小不同的新矩阵，但保留其原始数据。

给出一个由二维数组表示的矩阵，以及两个正整数`r`和`c`，分别表示想要的重构的矩阵的行数和列数。

重构后的矩阵需要将原始矩阵的所有元素以相同的**行遍历顺序**填充。

如果具有给定参数的`reshape`操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。

**示例 1:**

```
输入: 
nums = 
[[1,2],
 [3,4]]
r = 1, c = 4
输出: 
[[1,2,3,4]]
解释:
行遍历nums的结果是 [1,2,3,4]。新的矩阵是 1 * 4 矩阵, 用之前的元素值一行一行填充新矩阵。
```

**示例 2:**

```
输入: 
输入: 
nums = 
[[1,2],
 [3,4]]
r = 2, c = 4
输出: 
[[1,2],
 [3,4]]
解释:
没有办法将 2 * 2 矩阵转化为 2 * 4 矩阵。 所以输出原矩阵。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode46)

# Question47:旋转图像

给定一个 *n* × *n* 的二维矩阵表示一个图像。

将图像顺时针旋转 90 度。

**说明：**

你必须在**原地**旋转图像，这意味着你需要直接修改输入的二维矩阵。**请不要**使用另一个矩阵来旋转图像。

**示例 1:**

```
给定 matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

原地旋转输入矩阵，使其变为:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
```

**示例 2:**

```
给定 matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

原地旋转输入矩阵，使其变为:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode47)

# Question 48:矩阵置零

给定一个 *m* x *n* 的矩阵，如果一个元素为 0，则将其所在行和列的所有元素都设为 0。请使用**原地**算法**。**

**示例 1:**

```
输入: 
[
  [1,1,1],
  [1,0,1],
  [1,1,1]
]
输出: 
[
  [1,0,1],
  [0,0,0],
  [1,0,1]
]
```

**示例 2:**

```
输入: 
[
  [0,1,2,0],
  [3,4,5,2],
  [1,3,1,5]
]
输出: 
[
  [0,0,0,0],
  [0,4,5,0],
  [0,3,1,0]
]
```

**进阶:**

- 一个直接的解决方案是使用  O(*m**n*) 的额外空间，但这并不是一个好的解决方案。
- 一个简单的改进方案是使用 O(*m* + *n*) 的额外空间，但这仍然不是最好的解决方案。
- 你能想出一个常数空间的解决方案吗？

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode48)

# Question49： 生命游戏

根据 [百度百科](https://baike.baidu.com/item/生命游戏/2926434?fr=aladdin) ，生命游戏，简称为生命，是英国数学家约翰·何顿·康威在 1970 年发明的细胞自动机。

给定一个包含 m × n 个格子的面板，每一个格子都可以看成是一个细胞。每个细胞都具有一个初始状态：1 即为活细胞（live），或 0 即为死细胞（dead）。每个细胞与其八个相邻位置（水平，垂直，对角线）的细胞都遵循以下四条生存定律：

* 1.如果活细胞周围八个位置的活细胞数少于两个，则该位置活细胞死亡；

* 2.如果活细胞周围八个位置有两个或三个活细胞，则该位置活细胞仍然存活；
* 3.如果活细胞周围八个位置有超过三个活细胞，则该位置活细胞死亡；
* 4.如果死细胞周围正好有三个活细胞，则该位置死细胞复活；

根据当前状态，写一个函数来计算面板上所有细胞的下一个（一次更新后的）状态。下一个状态是通过将上述规则同时应用于当前状态下的每个细胞所形成的，其中细胞的出生和死亡是同时发生的。

**示例：**

```
输入： 
[
  [0,1,0],
  [0,0,1],
  [1,1,1],
  [0,0,0]
]
输出：
[
  [0,0,0],
  [1,0,1],
  [0,1,1],
  [0,1,0]
]
```

**进阶：**

* 你可以使用原地算法解决本题吗？请注意，面板上所有格子需要同时被更新：你不能先更新某些格子，然后使用它们的更新后的值再更新其他格子。
* 本题中，我们使用二维数组来表示面板。原则上，面板是无限的，但当活细胞侵占了面板边界时会造成问题。你将如何解决这些问题？

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode49)

# Question 50 ：区域检索-数组不可变

给定一个整数数组  *nums*，求出数组从索引 *i* 到 *j*  (*i* ≤ *j*) 范围内元素的总和，包含 *i,  j* 两点。

**示例：**

```
给定 nums = [-2, 0, 3, -5, 2, -1]，求和函数为 sumRange()

sumRange(0, 2) -> 1
sumRange(2, 5) -> -1
sumRange(0, 5) -> -3
```

**说明:**

1. 你可以假设数组不可变。
2. 会多次调用 *sumRange* 方法。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode50)

# Question51: 二维区域检索-矩阵不可变

给定一个二维矩阵，计算其子矩形范围内元素的总和，该子矩阵的左上角为 (*row*1, *col*1) ，右下角为 (*row*2, *col*2)。![Range Sum Query 2D](https://assets.leetcode-cn.com/aliyun-lc-upload/images/304.png)

上图子矩阵左上角 (row1, col1) = **(2, 1)** ，右下角(row2, col2) = **(4, 3)，**该子矩形内元素的总和为 8。

**示例:**

```
给定 matrix = [
[3, 0, 1, 4, 2],
  [5, 6, 3, 2, 1],
  [1, 2, 0, 1, 5],
  [4, 1, 0, 1, 7],
  [1, 0, 3, 0, 5]
]

sumRegion(2, 1, 4, 3) -> 8
sumRegion(1, 1, 2, 2) -> 11
sumRegion(1, 2, 2, 4) -> 12
```

**说明:**

1. 你可以假设矩阵不可变。
2. 会多次调用 *sumRegion* 方法*。*
3. 你可以假设 *row*1 ≤ *row*2 且 *col*1 ≤ *col*2。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode51)

# Question52:除自身以外数组乘积

给你一个长度为 *n* 的整数数组 `nums`，其中 *n* > 1，返回输出数组 `output` ，其中 `output[i]` 等于 `nums` 中除 `nums[i]` 之外其余各元素的乘积。

**示例:**

```
输入: [1,2,3,4]
输出: [24,12,8,6]
```

**提示：**题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。

**说明:** 请**不要使用除法，**且在 O(*n*) 时间复杂度内完成此题。

**进阶：**
你可以在常数空间复杂度内完成这个题目吗？（ 出于对空间复杂度分析的目的，输出数组**不被视为**额外空间。）

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode52)

# Question53: 检测大写字母

给定一个单词，你需要判断单词的大写使用是否正确。

我们定义，在以下情况时，单词的大写用法是正确的：

1. 全部字母都是大写，比如"USA"。
2. 单词中所有字母都不是大写，比如"leetcode"。
3. 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。

否则，我们定义这个单词没有正确使用大写字母。

**示例 1:**

```
输入: "USA"
输出: True
```

**示例 2:**

```
输入: "FlaG"
输出: False
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode53)

# Question54：验证回文字符串

给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。

**说明：**本题中，我们将空字符串定义为有效的回文串。

**示例 1:**

```
输入: "A man, a plan, a canal: Panama"
输出: true
```

**示例 2:**

```
输入: "race a car"
输出: false
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode54)