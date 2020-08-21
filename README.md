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