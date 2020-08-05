# 解题思路

## 1.1 动态规划算法

这道题使用动态规划算法是最适合的：

* 首先考虑最简单的情况。如果只有一间房屋，则偷窃该房屋，可以偷窃到最高总金额

* 其次如果只有两间房，那么小偷肯定是选择两间房里最值钱的房间。也就是max(房间1，房间2)

* 然后如果房间数k>2,提供了两个选项：

  * 1.偷窃第k间房，但是不能偷窃第k-1间房，偷窃的总金额为前k-2间房的最高金额+第k间房的金额。
  * 2.不偷窃第k间房，那么偷窃总额为前k-1间房的最高金额。

* 那么肯定是在1，2两个方案里面选择最大金额的选项。对应的总金额就是第k间房能偷窃到的最高总金额。

  

  所以使用动态规划数组dp[i]表示前i间屋子能够偷窃的最高金额，那么就有如下的状态转移方程：

  > dp[i]=max(dp[i-2]+nums[i],dp[i-1])

​      边界条件：

> 1.dp[0]=nums[0] 只有一间房屋，则偷窃该房屋
> 2.dp[1]=max(nums[0],nums[1]) 只有两间房屋，选择其中金额较高的房屋进行偷窃

那么dp[n-1]就是最终答案，n为数组长度。



## 1.2 代码

```java
public int rob(int[] nums) {
        if(nums==null || nums.length == 0){
            return 0;
        }
        if(nums.length ==1){
            return nums[0];
        }
        int length = nums.length;
        int[] dp = new int[length];
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
         for (int i = 2; i < length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[length - 1];
    }
```

这里可以优化一下，不使用动态规划数组，只用两个参数缓存k,k-1的最优情况。（本来以为可以省空间，结果leetcode还用了更多的空间）

```
public  int rob(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		int one = nums[0];
		int two = Math.max(one, nums[1]);
		for (int i = 2; i < nums.length; i++) {
			int temp = two;
			two = Math.max(one+nums[i], two);
			one = temp;
		}
		return two;
	}
```

## 1.3 复杂度分析

* 时间复杂度：`O(n)`，其中`n` 是数组长度。只需要对数组遍历一次。

* 空间复杂度：
  * 方案1为`O(n)`，存储了整个数组。
  * 方案2为`O(1)`，可以只存储前两间房屋的最高总金额，而不需要存储整个数组的结果.

