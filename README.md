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

**提示：**

题目数据保证数组之中任意元素的全部前缀元素和后缀（甚至是整个数组）的乘积都在 32 位整数范围内。

**说明:** 

请**不要使用除法，**且在 O(*n*) 时间复杂度内完成此题。

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

**说明：**

本题中，我们将空字符串定义为有效的回文串。

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

# Question 55:最长公共前缀

编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 `""`。

**示例 1:**

```
输入: ["flower","flow","flight"]
输出: "fl"
```

**示例 2:**

```
输入: ["dog","racecar","car"]
输出: ""
解释: 输入不存在公共前缀。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode55)

# Question 56:两个数组的交集

给定两个数组，编写一个函数来计算它们的交集。

 **示例 1：**

```
输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2]
```

**示例 2：**

```
输入：nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出：[9,4]
```

**说明：**

- 输出结果中的每个元素一定是唯一的。
- 我们可以不考虑输出结果的顺序。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode56)

# Question57:有效的山脉函数

给定一个整数数组 `A`，如果它是有效的山脉数组就返回 `true`，否则返回 `false`。

让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：

- `A.length >= 3`
- 在 `0 < i < A.length - 1` 条件下，存在 `i` 使得：
  - `A[0] < A[1] < ... A[i-1] < A[i]`
  - `A[i] > A[i+1] > ... > A[A.length - 1]`

![img](https://assets.leetcode.com/uploads/2019/10/20/hint_valid_mountain_array.png)

**示例 1：**

```
输入：[2,1]
输出：false
```

**示例 2：**

```
输入：[3,5,5]
输出：false
```

**示例 3：**

```
输入：[0,3,2,1]
输出：true
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode57)

# Question58：字符串中的单词数

统计字符串中的单词个数，这里的单词指的是连续的不是空格的字符。

请注意，你可以假定字符串里不包括任何不可打印的字符。

**示例:**

```
输入: "Hello, my name is John"
输出: 5
解释: 这里的单词是指连续的不是空格的字符，所以 "Hello," 算作 1 个单词。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode58)

# Question59: 最后一个单词的长度

给定一个仅包含大小写字母和空格 `' '` 的字符串 `s`，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。

如果不存在最后一个单词，请返回 0 。

**说明：**一个单词是指仅由字母组成、不包含任何空格字符的 **最大子字符串**。

**示例:**

```
输入: "Hello World"
输出: 5
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode59)

# Question60：反转字符串

编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 `char[]` 的形式给出。

不要给另外的数组分配额外的空间，你必须**原地修改输入数组**、使用 O(1) 的额外空间解决这一问题。

你可以假设数组中的所有字符都是 [ASCII](https://baike.baidu.com/item/ASCII) 码表中的可打印字符。

**示例 1：**

```
输入：["h","e","l","l","o"]
输出：["o","l","l","e","h"]
```

**示例 2：**

```
输入：["H","a","n","n","a","h"]
输出：["h","a","n","n","a","H"]
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode60)

# Qusetion61：反转字符串II

给定一个字符串 `s` 和一个整数 `k`，你需要对从字符串开头算起的每隔 `2k` 个字符的前 `k` 个字符进行反转。

*  如果剩余字符少于 `k` 个，则将剩余字符全部反转
*  如果剩余字符小于 `2k` 但大于或等于 `k` 个，则反转前 `k` 个字符，其余字符保持原样

**示例:**

```
输入: s = "abcdefg", k = 2
输出: "bacdfeg"
```

**提示：**

1. 该字符串只包含小写英文字母。
2. 给定字符串的长度和 `k` 在 `[1, 10000]` 范围内。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode61)

# Question62:反转字符串中的单词II

给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

**示例：**

```
输入："Let's take LeetCode contest"
输出："s'teL ekat edoCteeL tsetnoc"
```

**提示：**

- 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode62)

# Question63：翻转字符串里面的单词

#### [翻转字符串里的单词](https://leetcode-cn.com/problems/reverse-words-in-a-string/)

给定一个字符串，逐个翻转字符串中的每个单词。

**说明：**

* 无空格字符构成一个 **单词** 
* 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
* 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。

**示例 1：**

```
输入："the sky is blue"
输出："blue is sky the"
```

**示例 2：**

```
输入："  hello world!  "
输出："world! hello"
解释：输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
```

**示例 3：**

```
输入："a good   example"
输出："example good a"
解释：如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
```

**示例 4：**

```
输入：s = "  Bob    Loves  Alice   "
输出："Alice Loves Bob"
```

**示例 5：**

```
输入：s = "Alice does not even like bob"
输出："bob like even not does Alice"
```

**提示：**

- `1 <= s.length <= 104`
- `s` 包含英文大小写字母、数字和空格 `' '`
- `s` 中 **至少存在一个** 单词

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode63)

# Question64:字符串中第一个唯一字符

给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。

**示例：**

```
s = "leetcode"
返回 0

s = "loveleetcode"
返回 2
```

**提示：**

你可以假定该字符串只包含小写字母。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode64)

# Question65： 找不同

给定两个字符串 ***s*** 和 ***t***，它们只包含小写字母。

字符串 **t** 由字符串 **s** 随机重排，然后在随机位置添加一个字母。

请找出在 ***t*** 中被添加的字母。

**示例 1：**

```
输入：s = "abcd", t = "abcde"
输出："e"
解释：'e' 是那个被添加的字母。
```

**示例 2：**

```
输入：s = "", t = "y"
输出："y"
```

**示例 3：**

```
输入：s = "a", t = "aa"
输出："a"
```

**示例 4：**

```
输入：s = "ae", t = "aea"
输出："a"
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode65)

# Question66：赎金信

给定一个赎金信 (`ransom`) 字符串和一个杂志(`magazine`)字符串，判断第一个字符串 `ransom` 能不能由第二个字符串 `magazines` 里面的字符构成。

(题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。杂志字符串中的每个字符只能在赎金信字符串中使用一次。)

**注意：**

你可以假设两个字符串均只含有小写字母。

```
canConstruct("a", "b") -> false
canConstruct("aa", "ab") -> false
canConstruct("aa", "aab") -> true
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode66)

# Question67:字母异位词分组

给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。

**示例:**

```
输入: ["eat", "tea", "tan", "ate", "nat", "bat"]
输出:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]
```

**说明：**

- 所有输入均为小写字母。
- 不考虑答案输出的顺序。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode67)

# Question68： 根据字符出现的频率排序

给定一个字符串，请将字符串里的字符按照出现的频率降序排列。

**示例 1:**

```
输入:
"tree"

输出:
"eert"

解释:
'e'出现两次，'r'和't'都只出现一次。
因此'e'必须出现在'r'和't'之前。此外，"eetr"也是一个有效的答案。
```

**示例 2:**

```
输入:
"cccaaa"

输出:
"cccaaa"

解释:
'c'和'a'都出现三次。此外，"aaaccc"也是有效的答案。
注意"cacaca"是不正确的，因为相同的字母必须放在一起。
```

**示例 3:**

```
输入:
"Aabb"

输出:
"bbAa"

解释:
此外，"bbaA"也是一个有效的答案，但"Aabb"是不正确的。
注意'A'和'a'被认为是两种不同的字符。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode68)

# Question69:从英文中重建数字

给定一个**非空**字符串，其中包含字母顺序打乱的英文单词表示的数字`0-9`。按升序输出原始的数字。

**注意:**

1. 输入只包含小写英文字母。
2. 输入保证合法并可以转换为原始的数字，这意味着像 "abc" 或 "zerone" 的输入是不允许的。
3. 输入字符串的长度小于 50,000。

**示例 1:**

```
输入: "owoztneoer"

输出: "012" (zeroonetwo)
```

**示例 2:**

```
输入: "fviefuro"

输出: "45" (fourfive)
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode69)

# Question70：替换所有的问号

给你一个仅包含小写英文字母和 `'?'` 字符的字符串 `s`，请你将所有的 `'?'` 转换为若干小写字母，使最终的字符串不包含任何 **连续重复** 的字符。

注意：你 **不能** 修改非 `'?'` 字符。

题目测试用例保证 **除** `'?'` 字符 **之外**，不存在连续重复的字符。

在完成所有转换（可能无需转换）后返回最终的字符串。如果有多个解决方案，请返回其中任何一个。可以证明，在给定的约束条件下，答案总是存在的。

**示例 1：**

```
输入：s = "?zs"
输出："azs"
解释：该示例共有 25 种解决方案，从 "azs" 到 "yzs" 都是符合题目要求的。只有 "z" 是无效的修改，因为字符串 "zzs" 中有连续重复的两个 'z' 。
```

**示例 2：**

```
输入：s = "ubv?w"
输出："ubvaw"
解释：该示例共有 24 种解决方案，只有替换成 "v" 和 "w" 不符合题目要求。因为 "ubvvw" 和 "ubvww" 都包含连续重复的字符。
```



**示例 3：**

```
输入：s = "j?qg??b"
输出："jaqgacb"
```

**示例 4：**

```
输入：s = "??yw?ipkj?"
输出："acywaipkja"
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode70)

# Question71:对链表进行插入排序

对链表进行插入排序。

![img](https://upload.wikimedia.org/wikipedia/commons/0/0f/Insertion-sort-example-300px.gif)

插入排序的动画演示如上。从第一个元素开始，该链表可以被认为已经部分排序（用黑色表示）。

每次迭代时，从输入数据中移除一个元素（用红色表示），并原地将其插入到已排好序的链表中。

**插入排序算法：**

1. 插入排序是迭代的，每次只移动一个元素，直到所有元素可以形成一个有序的输出列表。
2. 每次迭代中，插入排序只从输入数据中移除一个待排序的元素，找到它在序列中适当的位置，并将其插入。
3. 重复直到所有输入数据插入完为止。

**示例 1：**

```
输入: 4->2->1->3
输出: 1->2->3->4
```

**示例 2：**

```
输入: -1->5->3->4->0
输出: -1->0->3->4->5
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode71)

# Question57:机器人是否返回原点

在二维平面上，有一个机器人从原点 (0, 0) 开始。给出它的移动顺序，判断这个机器人在完成移动后是否在 **(0, 0) 处结束**。

移动顺序由字符串表示。字符 move[i] 表示其第 i 次移动。机器人的有效动作有 `R`（右），`L`（左），`U`（上）和 `D`（下）。如果机器人在完成所有动作后返回原点，则返回 true。否则，返回 false。

**注意：**机器人“面朝”的方向无关紧要。 “R” 将始终使机器人向右移动一次，“L” 将始终向左移动等。此外，假设每次移动机器人的移动幅度相同。

**示例 1:**

```
输入: "UD"
输出: true
解释：机器人向上移动一次，然后向下移动一次。所有动作都具有相同的幅度，因此它最终回到它开始的原点。因此，我们返回 true。
```

**示例 2:**

```
输入: "LL"
输出: false
解释：机器人向左移动两次。它最终位于原点的左侧，距原点有两次 “移动” 的距离。我们返回 false，因为它在移动结束时没有返回原点。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode72)

# Question73:学生出勤记录

给定一个字符串来代表一个学生的出勤记录，这个记录仅包含以下三个字符：

1. **'A'** : Absent，缺勤
2. **'L'** : Late，迟到
3. **'P'** : Present，到场

如果一个学生的出勤记录中不**超过一个'A'(缺勤)**并且**不超过两个连续的'L'(迟到)**,那么这个学生会被奖赏。

你需要根据这个学生的出勤记录判断他是否会被奖赏。

**示例 1:**

```
输入: "PPALLP"
输出: True
```

**示例 2:**

```
输入: "PPALLL"
输出: False
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode73)

# Question74：猜数字游戏

你在和朋友一起玩 [猜数字（Bulls and Cows）](https://baike.baidu.com/item/猜数字/83200?fromtitle=Bulls+and+Cows&fromid=12003488&fr=aladdin)游戏，该游戏规则如下：

1. 你写出一个秘密数字，并请朋友猜这个数字是多少。
2. 朋友每猜测一次，你就会给他一个提示，告诉他的猜测数字中有多少位属于数字和确切位置都猜对了（称为“Bulls”, 公牛），有多少位属于数字，猜对了但是位置不对（称为“Cows”, 奶牛）
3. 朋友根据提示继续猜，直到猜出秘密数字。

请写出一个根据秘密数字和朋友的猜测数返回提示的函数，返回字符串的格式为 `xAyB` ，`x` 和 `y` 都是数字，`A` 表示公牛，用 `B` 表示奶牛。

* `xA` 表示有 `x` 位数字出现在秘密数字中，且位置都与秘密数字一致
* `yB` 表示有 `y` 位数字出现在秘密数字中，但位置与秘密数字不一致。

请注意秘密数字和朋友的猜测数都可能含有重复数字，每位数字只能统计一次。

**示例 1:**

```
输入: secret = "1807", guess = "7810"
输出: "1A3B"
解释: 1 公牛和 3 奶牛。公牛是 8，奶牛是 0, 1 和 7。
```

**示例 2:**

```
输入: secret = "1123", guess = "0111"
输出: "1A1B"
解释: 朋友猜测数中的第一个 1 是公牛，第二个或第三个 1 可被视为奶牛。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode74)

# Question75：字符串压缩

字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串`aabcccccaaa`会变为`a2b1c5a3`。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。

**示例1:**

```
输入："aabcccccaaa"
输出："a2b1c5a3"
```

**示例2:**

```
输入："abbccd"
输出："abbccd"
解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode75)

# Question76：角谷猜想

角谷猜想：角谷静夫是日本的一位著名学者．他提出了两条极简单的规则，可以对任何一个自然数进行变换，最终使它陷入“4－2－1”的死循环

> 以一个正整数n为例，如果n为偶数，就将它变为n/2，如果除后变为奇数，则将它乘3加1（即3n+1）。不断重复这样的运算，经过有限步后，一定可以得到1吗？
>
> 这就是角古猜想（1930）。人们通过大量的验算，从来没有发现反例，但是也没有人能证明。
>
> 任意选一个整数N，规则如下：如果N为奇数，那么运算N*3+1；如果N为偶数，那么运算N/2。
>
> 得到第一个结果之后，再重复按规则运算。
>
> 这样一直算下去，你会发现最后数字会在一个循环圈里循环，这个循环圈是（4→2→1→4）。

请编写角谷猜想的函数。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode76)

# Question77：Fizz Buzz

写一个程序，输出从 1 到 *n* 数字的字符串表示。

1. 如果 *n* 是3的倍数，输出“Fizz”；
2. 如果 *n* 是5的倍数，输出“Buzz”；
3. 如果 *n* 同时是3和5的倍数，输出 “FizzBuzz”。

**示例：**

```
n = 15,
返回:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode77)

# Question78：相对名次

给出 **N** 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。

(注：分数越高的选手，排名越靠前。)

**示例 1:**

```
输入: [5, 4, 3, 2, 1]
输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and "Bronze Medal").
余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
```

**提示:**

1. N 是一个正整数并且不会超过 10000。
2. 所有运动员的成绩都不相同。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode78)

# Question79:最小时间差

给定一个 24 小时制（小时:分钟 **"HH:MM"**）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。

**示例 1：**

```
输入：timePoints = ["23:59","00:00"]
输出：1
```

**示例 2：**

```
输入：timePoints = ["00:00","23:59","00:00"]
输出：0
```

**提示：**

- `2 <= timePoints <= 2 * 104`
- `timePoints[i]` 格式为 **"HH:MM"**

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode79)

# Question80:柠檬水找零

在柠檬水摊上，每一杯柠檬水的售价为 `5` 美元。

顾客排队购买你的产品，（按账单 `bills` 支付的顺序）一次购买一杯

每位顾客只买一杯柠檬水，然后向你付 `5` 美元、`10` 美元或 `20` 美元。你必须给每个顾客正确找零，也就是说净交易是每位顾客向你支付 `5` 美元。

注意，一开始你手头没有任何零钱。

如果你能给每位顾客正确找零，返回 `true` ，否则返回 `false` 。

**示例 1：**

```
输入：[5,5,5,10,20]
输出：true
解释：
前 3 位顾客那里，我们按顺序收取 3 张 5 美元的钞票。
第 4 位顾客那里，我们收取一张 10 美元的钞票，并返还 5 美元。
第 5 位顾客那里，我们找还一张 10 美元的钞票和一张 5 美元的钞票。
由于所有客户都得到了正确的找零，所以我们输出 true。
```

**示例 2：**

```
输入：[5,5,10]
输出：true
```

**示例 3：**

```
输入：[10,10]
输出：false
```

**示例 4：**

```
输入：[5,5,10,10,20]
输出：false
解释：
前 2 位顾客那里，我们按顺序收取 2 张 5 美元的钞票。
对于接下来的 2 位顾客，我们收取一张 10 美元的钞票，然后返还 5 美元。
对于最后一位顾客，我们无法退回 15 美元，因为我们现在只有两张 10 美元的钞票。
由于不是每位顾客都得到了正确的找零，所以答案是 false。
```

**提示：**

- `0 <= bills.length <= 10000`
- `bills[i]` 不是 `5` 就是 `10` 或是 `20` 

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode80)

# Question81：黑白方格画

小扣注意到秋日市集上有一个创作黑白方格画的摊位。摊主给每个顾客提供一个固定在墙上的白色画板，画板不能转动。画板上有 `n * n` 的网格。绘画规则为，小扣可以选择任意多行以及任意多列的格子涂成黑色，所选行数、列数均可为 0。

小扣希望最终的成品上需要有 `k` 个黑色格子，请返回小扣共有多少种涂色方案。

注意：两个方案中任意一个相同位置的格子颜色不同，就视为不同的方案。

**示例 1：**

> 输入：`n = 2, k = 2`
>
> 输出：`4`
>
> 解释：一共有四种不同的方案：
> 第一种方案：涂第一列；
> 第二种方案：涂第二列；
> 第三种方案：涂第一行；
> 第四种方案：涂第二行。

**示例 2：**

>输入：`n = 2, k = 1`
>
>输出：`0`
>
>解释：不可行，因为第一次涂色至少会涂两个黑格。

**示例 3：**

>输入：`n = 2, k = 4`
>
>输出：`1`
>
>解释：共有 2*2=4 个格子，仅有一种涂色方案。

**限制：**

- `1 <= n <= 6`
- `0 <= k <= n * n`

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode81)



# Question82:单调递增的数字

给定一个非负整数 N，找出小于或等于 N 的最大的整数，同时这个整数需要满足其各个位数上的数字是单调递增。

（当且仅当每个相邻位数上的数字 x 和 y 满足 x <= y 时，我们称这个整数是单调递增的。）

**示例 1:**

```
输入: N = 10
输出: 9
```

**示例 2:**

```
输入: N = 1234
输出: 1234
```

**示例 3:**

```
输入: N = 332
输出: 299
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode82)

# Question83：复数乘法

给定两个表示[复数](https://baike.baidu.com/item/复数/254365?fr=aladdin)的字符串。返回表示它们乘积的字符串。注意，根据定义 i2 = -1 。

**示例 1:**

```
输入: "1+1i", "1+1i"
输出: "0+2i"
解释: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i ，你需要将它转换为 0+2i 的形式。
```

**示例 2:**

```
输入: "1+-1i", "1+-1i"
输出: "0+-2i"
解释: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i ，你需要将它转换为 0+-2i 的形式。
```

**注意:**

1. 输入字符串不包含额外的空格。
2. 输入字符串将以 **a+bi** 的形式给出，其中整数 **a** 和 **b** 的范围均在 [-100, 100] 之间。**输出也应当符合这种形式**。

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode83)

# Question84：单词规律

给定一种规律 `pattern` 和一个字符串 `str` ，判断 `str` 是否遵循相同的规律。

这里的 **遵循** 指完全匹配，例如， `pattern` 里的每个字母和字符串 `str` 中的每个非空单词之间存在着双向连接的对应规律。

**示例1:**

```
输入: pattern = "abba", str = "dog cat cat dog"
输出: true
```

**示例 2:**

```
输入:pattern = "abba", str = "dog cat cat fish"
输出: false
```

**示例 3:**

```
输入: pattern = "aaaa", str = "dog cat cat dog"
输出: false
```

**示例 4:**

```
输入: pattern = "abba", str = "dog dog dog dog"
输出: false
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode84)

# Question85：外观数列

给定一个正整数 `n` ，输出外观数列的第 `n` 项。

「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。

你可以将其视作是由递归公式定义的数字字符串序列：

- `countAndSay(1) = "1"`
- `countAndSay(n)` 是对 `countAndSay(n-1)` 的描述，然后转换成另一个数字字符串。

前五项如下：

```
1.     1
2.     11
3.     21
4.     1211
5.     111221
第一项是数字 1 
描述前一项，这个数是 1 即 “ 一 个 1 ”，记作 "11"
描述前一项，这个数是 11 即 “ 二 个 1 ” ，记作 "21"
描述前一项，这个数是 21 即 “ 一 个 2 + 一 个 1 ” ，记作 "1211"
描述前一项，这个数是 1211 即 “ 一 个 1 + 一 个 2 + 二 个 1 ” ，记作 "111221"
```

要 描述 一个数字字符串，首先要将字符串分割为 最小 数量的组，每个组都由连续的最多 相同字符 组成。然后对于每个组，先描述字符的数量，然后描述字符，形成一个描述组。要将描述转换为数字字符串，先将每组中的字符数量用数字替换，再将所有描述组连接起来。

例如，数字字符串 `"3322251"` 的描述如下图：

![img](https://assets.leetcode.com/uploads/2020/10/23/countandsay.jpg)

**示例 1：**

```
输入：n = 1
输出："1"
解释：这是一个基本样例。
```

**示例 2：**

```
输入：n = 4
输出："1211"
解释：
countAndSay(1) = "1"
countAndSay(2) = 读 "1" = 一 个 1 = "11"
countAndSay(3) = 读 "11" = 二 个 1 = "21"
countAndSay(4) = 读 "21" = 一 个 2 + 一 个 1 = "12" + "11" = "1211"
```

**提示：**

- `1 <= n <= 30`

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode85)

# Question86：压缩字符串（太难了，直接看的官解）

给定一组字符，使用[原地算法](https://baike.baidu.com/item/原地算法)将其压缩。

压缩后的长度必须始终小于或等于原数组长度。

数组的每个元素应该是长度为1 的**字符**（不是 int 整数类型）。

在完成[原地](https://baike.baidu.com/item/原地算法)**修改输入数组**后，返回数组的新长度。

**进阶：**
你能否仅使用O(1) 空间解决问题？

**示例 1：**

```
输入：
["a","a","b","b","c","c","c"]

输出：
返回 6 ，输入数组的前 6 个字符应该是：["a","2","b","2","c","3"]

说明：
"aa" 被 "a2" 替代。"bb" 被 "b2" 替代。"ccc" 被 "c3" 替代。
```

**示例 2：**

```
输入：
["a"]

输出：
返回 1 ，输入数组的前 1 个字符应该是：["a"]

解释：
没有任何字符串被替代。
```

**示例 3：**

```
输入：
["a","b","b","b","b","b","b","b","b","b","b","b","b"]

输出：
返回 4 ，输入数组的前4个字符应该是：["a","b","1","2"]。

解释：
由于字符 "a" 不重复，所以不会被压缩。"bbbbbbbbbbbb" 被 “b12” 替代。
注意每个数字在数组中都有它自己的位置。
```

解：[点击查看答案](https://github.com/jiaoery/leetcode/tree/master/src/leetcode86)

