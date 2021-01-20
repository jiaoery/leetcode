# 解题思路

## 1. 排序

由于有两种情况出现最大值：

* 存在负数时，取两个最小负数和一个最大正数相乘的乘积最大
* 全为正数时，三个最大正数的乘积最大

所以这里考虑使用排序，然后取上面两个规则结果的最大数；

### 1.1 代码

```java
public int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		//存在负数时，两个负数加最大正数最大
		int p = nums[0]*nums[1]*nums[nums.length-1];
		//全为正数的情况下，最大三个正数乘积最大
		int q = nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
		return Math.max(p, q);
    }
```

### 1.2 复杂度分析

* 时间复杂度：`O(nlogn)`,排序所需要的时间复杂度
* 空间复杂度：`O(nlogn)`,排序所需要的空间复杂度

### 2.线性扫描

在方法一中，我们实际上只要求出数组中最大的三个数以及最小的两个数，因此我们可以不用排序，用线性扫描直接得出这五个数。

### 2.1 代码

```java
public int maximumProduct(int[] nums) {
		int min1 = Integer.MAX_VALUE,min2 = Integer.MAX_VALUE;
		int max1 = Integer.MIN_VALUE,max2 = Integer.MIN_VALUE,max3=Integer.MIN_VALUE;
		
		for (int i = 0; i < nums.length; i++) {
			//若是比最小值还小
			if(min1>nums[i]) {
				min2 = min1;
				min1 = nums[i];		
			}else if(min2>nums[i]) {
				//大于最小数，小于第二小数
				min2 = nums[i];		
			}
			
			if(max1<nums[i]) {
				max3 = max2;
				max2 = max1;
				max1 = nums[i];
			}else if (max2<nums[i]) {
				max3 = max2;
				max2 = nums[i];
			}else if (max3<nums[i]) {
				max3 = nums[i];
			}
		}
		return Math.max(min1*min2*max1, max1*max2*max3);
	}
```

### 2.2 复杂度分析

* 时间复杂度：*O*(*N*)，其中 N 为数组长度。我们仅需遍历数组一次。
* 空间复杂度：O(1)。