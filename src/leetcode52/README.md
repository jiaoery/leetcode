# 解题思路

这道题目第一想法就是暴力法和，乘积除数的方式来解决，但是题目明确规定，时间复杂度必须为O(N);而且乘积除数的方法会存在乘积超过当前数据类型的最大值；导致超域；

![握了个大草_大草表情](http://ww3.sinaimg.cn/bmiddle/6af89bc8gw1f8oegqfz9tj204g04qgli.jpg)

那么是否有可以解决的方案，其实在提示中已经提到使用任意元素的前缀和后缀法来解决这个问题；而且保证了前后缀乘积不会超过32位整数类型；满足了题目范围

## 1.前后缀乘积法

首先，什么是前缀？什么是后缀？![前后缀.png](https://upload-images.jianshu.io/upload_images/2326194-2cfe7909a9b7928e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

那么这里可以引入两个数组L,R用来分别表示数组元素的前缀和后缀元素；同时给定索引位置i;

L[i]未i左侧所有数字的乘积，R[i]代表的是i右侧所有数字的乘积。

### 1.1 算法

* 1.使用两个乘积来循环填充L和R数组的值。对于数组L，L[0]应该是1，因为第一个元素的左边没有其他元素。其他元素前缀L[i] = L[i-1]*num[i-1];
* 2.同理对于后缀R，R[length-1]为1。其中length为输入数组的长度。其他元素R[i] = R[i+1]*num[i+1];
* 当L和R元素填充完成时。我们只需要在结果数组上迭代；且索引处 i的值为：L[i]*R[i];

以上过程可以总结为下图

![img](https://assets.leetcode-cn.com/solution-static/238/5.PNG)

![img](https://assets.leetcode-cn.com/solution-static/238/10.PNG)

### 1.2 代码

```java
public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

		// 前缀
		int[] L = new int[length];
		// 后缀
		int[] R = new int[length];
		// 结果数组
		int[] result = new int[length];

		// 求解前缀
		L[0] = 1;
		for (int i = 1; i < length; i++) {
			L[i] = L[i - 1] * nums[i - 1];
		}
		

		// 求解后缀
		R[length - 1] = 1;
		for (int i = length - 2; i >= 0; i--) {
			R[i] = R[i + 1] * nums[i + 1];
		}
		

		// 结果数组
		for (int i = 0; i < length; i++) {
			result[i] = L[i] * R[i];
		}
		return result;

    }
```

### 1.3 复杂度分析

* 时间复杂度：O(N),整个数组循环三次。
* 空间复杂度：O(N),使用前缀，后缀（结果数组不排入额外空间），空间为2N



## 2. 优化空间

虽然时间复杂度已经达到标准了，那是否有更好的方法可以降低空间复杂度呢？

这里发现了我们引入了前缀和后缀；那么是否可以将前缀数据L的结果直接放到结果数组result里面呢？

哎，好像时可以的。但是后缀的空间不是还有吗？ 是不是可以也放进结果数组里面呢？

哎，好像也是可以的。那说干就干，试试效果

### 2.1 代码

```java
 public int[] productExceptSelf(int[] nums) {
        int length = nums.length;

		// 结果数组
		int[] result = new int[length];

		// 求解前缀
		result[0] = 1;
		for (int i = 1; i < length; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
		// 求解后缀，结果
		int r = 1;
		for (int i = length - 1; i >= 0; i--) {
			result[i] = r*result[i];
			r = r * nums[i];		
		}
		
		return result;
    }
```

### 2.2 复杂度分析

* 时间复杂度：O(N),循环数组两次
* 空间复杂度：O(1),只是用常数级额外空间（结果数组除外）