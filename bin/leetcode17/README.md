# 解题思路

## 前言

本题的解题思路非常多，按照分类可以分为：**遍历查询**,**排序查询**，**原地置换**

分别就三种方式讲解下思路

## 1.1 遍历查询

遍历查询很简单，但是需要引入数据结构，其原理在于按照顺序插入对应值到数据结构中（集合，Set,Map等），若其中已经包含这个数，则代表重复。

## 1.2 代码（HashMap）

```
public int findRepeatNumber(int[] nums) {
		if (nums == null) {
			return 0;
		}
		HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			if(hashMap.containsKey(nums[i])) {
				return nums[i];
			}else {
				hashMap.put(nums[i], 1);
			}
		}
		return -1;
	}
```

## 1.3 复杂度分析

* 时间复杂度：仅有一次遍历，复杂度为`O(n)`
* 空间复杂度：引入存储的数据结构，复杂度为`O(n)`

## 2.1 排序查询

因为数组本身无序，可以通过排序变成序列数组，并且当相邻两个数相同时，则代表有相同数。

这里可以采用快速排序`(JAVA API :Arrrays.sort(nums))`,具体的是实现原理，也可查看：[QuickSort](https://github.com/jiaoery/leetcode/blob/master/src/algorithm/QuickSort.java).

## 2.2 代码

```
public int findRepeatNumber(int[] nums) {
		 //先排序
		 Arrays.sort(nums);
		 for (int i = 0; i < nums.length-1; i++) {
			if(nums[i]==nums[i+1]) {
				return nums[i];
			}
		}
		 return -1;
	 }
```

## 2.3 复杂度分析

* 时间复杂度：`O(nlog2 n)`.因为引入了快速排序
* 空间复杂度：未引入缓存，复杂度为`O(1)`

## 3.1 原地置换

这里主要是书中最优解法，也是这道题最优化解法。原理在于，数组若是有序，且无重复数字。是可以按照`num[i]=i`的方式进行排列的。并且，如果`nums[i]==nums[num[i]`],则能找出重复数字。若没有，可以交换两者的数，最终若无重复数组。会变化成一个有序数组。

## 3.2 代码

```
public int findRepeatNumber(int[] nums) {
		  for (int i = 0; i < nums.length; i++) {
			  //位置对应正确，跳过本次循环
			  if(nums[i]==i) {
				  continue;
			  }
			  if(nums[i]==nums[nums[i]]) {
				  return nums[i];
			  }
			//交换
	            int temp = nums[nums[i]];
	            nums[nums[i]] = nums[i];
	            nums[i] = temp;
	            //这里的i--是为了抵消掉上面的i++，
	            //交换之后需要原地再比较
	            i--;
		  }
		  return -1;
	 }
```

## 3.3 复杂度分析

* 时间复杂度：`O（n）`
* 空间复杂度：`O(1)`