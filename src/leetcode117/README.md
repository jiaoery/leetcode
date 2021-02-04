# 解题思路

## 1. 暴力解法

暴力解法的方法很简单，从数组中次序取出k个元素，求取总合的最大值。

### 1.1 代码

```java
public double findMaxAverage(int[] nums, int k) {
		int size = nums.length;
		// 特殊条件
		if (size < k) {
			return 0;
		}
		// 滑动窗口
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < size - k+1; i++) {
			int sum = 0;
			for (int j = 0; j < k; j++) {
				sum += nums[i + j];
			}
			max = Math.max(max, sum);
		}
		return (float)max/k;
	}
```

### 1.2 复杂度分析

* 复杂度分析：O(MK),M为数组的长度，K为需要查询的个数
* 空间复杂度：O（1）

## 2.动态规划

既然想要降低复杂度，而且结果与数组有关，那么可以使用动态规划来降低复杂度；

这里引入长度为N+1（N为数组长度）的动态规划数组dp[];初始dp[0]=0;

然后dp[i]=dp[i-1]+nums[i];然后从i到j的数组总合大小为 dp[i]-dp[j];求取它的最大值即可

### 2.1 代码 

```java
public double findMaxAverage(int[] nums, int k) {
		int size = nums.length;
		if (size < k) {
			return 0;
		}
		// 动态规划数组
		int[] dp = new int[size+1];
		dp[0] = 0;
		for (int i = 1; i < size+1; i++) {
			dp[i] = dp[i - 1] + nums[i-1];
		}
	
		int max = Integer.MIN_VALUE;
		for (int i = size; i >k-1; i--) {
			max = Math.max(dp[i]-dp[i-k], max);
		}
		return (double)max/k;
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(M+l);M为数组的长度，K为需要查询的个数
* 空间复杂度：O(M),引入了一个长度为M+1的动态规划数组

## 3.滑动窗口

由于这个跟K的大小有关，向右移动时，将K个元素中左边元素取出，右边引入一个元素；那么可以引入一个sum参数来动态获取K个参数的总合；并引入一个max参数来比较最大数

### 3.1 代码

```java
public double findMaxAverage(int[] nums, int k) {
		int size = nums.length;
		if (size < k) {
			return 0;
		}
		int sum=0;
		//从零到k
		for (int i = 0; i <k; i++) {
			sum+=nums[i];
		}
		System.out.println(sum);
		if(size==k) {
			return (double)sum/k;
		}
		int max =sum;
		for (int i = k; i < size; i++) {
			//前方移除一位，后方加上一位
			sum += nums[i]-nums[i-k];
			max = Math.max(sum, max);
			System.out.println(max);
		}
		System.out.println(max);
		return (double)max/k;
	}
```

### 3.2 复杂度分析

* 时间复杂度：O(M+l);M为数组的长度，K为需要查询的个数
* 空间复杂度：O(1)