# 解题思路

## 1.动态规划

第一个解题思路就是动态规划，引入一个动态规划数组`dp`长度为`cost.length`;

* `dp[0]=cost[0];dp[1]= cost[1]`;初始条件
* 遍历动态规划 `dp[i] = min(dp[i-1]+cost[i],dp[i]+cost[i])`;
* 最后返回`min(dp[cost.length-2],dp[cost.length-1])`;(最后两步台阶最小的消耗)

### 1.1 代码

```java
public int minCostClimbingStairs(int[] cost) {
		int[] dp =  new int[cost.length];
		dp[0]= cost[0];
		dp[1]= cost[1];
		//动态规划
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.min(dp[i-1]+cost[i], dp[i-2]+cost[i]);
		}
		return Math.min(dp[dp.length-1], dp[dp.length-2]);
    }
```

### 1.2 复杂度分析

* 时间复杂度：`O(N)`,N为cost数组的长度，这里遍历动态规划消耗的时间
* 空间复杂度：`O(N)`,N为cost数组长度，这里引入了一个长度为N的动态规划数组

# 2.使用变量

在空间方面按照这题目需求，还可以继续优化；就是把动态规划数组变为两个临时变量 `p1`,`p2`;

* `p1`代表当前阶梯上一步的最小消耗
* `p2`代表当前阶梯上两步的最小消耗

### 2.1 代码

```java
public int minCostClimbingStairs(int[] cost) {
		int p1 = cost[0];
		int p2 = cost[1];
		//动态规划
		for (int i = 2; i < cost.length; i++) {
			int min = Math.min(p1+cost[i], p2+cost[i]);
			p1 = p2;
			p2 = min;
		}
		return Math.min(p1, p2);
    }
```

### 2.2 时间复杂度

* 时间复杂度：`O(N)`,N为cost数组的长度，这里遍历动态规划消耗的时间

* 空间复杂度：O(1),仅使用了两个临时变量。