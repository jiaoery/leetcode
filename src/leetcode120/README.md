# 解题思路
这道题目有两个需求：
* 连续子数组的最大值
* 要求算法的时间复杂度为O(n)
那么暴力法时间复杂度为O(n^2)肯定是行不通的；那么这里用什么方式来做比较好呢？
  说到这两个需求满足的一个算法就是：`动态规划`
  
## 1.动态规划算法`
引入一个动态规划数组dp,长度为输入数组的长度；然后`dp[0] =nums[0]`;
然后比较`dp[i-1]+nums[i]`与`nums[i]`的大小，将其中最大值放在dp数组中;
遍历dp数组，找出其中的最大值，这个就是整个数组的子数组和最大值
* 引入dp数组，dp[0]=nums[0];
* 逐项计算max(dp[i-1]+nums[i],nums[i]),计入dp[i]中
* 计算dp数组中最大值max，返回max

### 1.1代码
```java
public class Solution{
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return Integer.MIN_VALUE;
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1]+nums[i],nums[i]);
            max = Math.max(max,dp[i]);
        }
        return max;
    }
}
```
### 1.2 复杂度分析
* 时间复杂度：`O(n)`,`n`为数组的长度，需要遍历一次数据，求出动态规划数组dp中的值
* 空间复杂度：`O(n)`,n为数组的长度,dp数组长度

## 2 动态规划算法`（优化版）
既然前面dp只关心最大值max 和 dp[i-1]的值；那么是否可以用有限的参数来表示dp中某一项的大小呢？
* 引入current = num[0];代替动态规划数组

### 2.1 代码
```java
public class Solution {
    public int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        int current = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(current + nums[i], nums[i]);
            max = Math.max(max, current);
        }
        return max;
    }
}
```
### 2.2 复杂度分析
* 时间复杂度：`O(n)`,`n`为数组的长度，需要遍历一次数据，求出max值
* 空间复杂度：`O(1)`