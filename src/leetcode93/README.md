# 解题思路

我考虑的办法是在本题中引入一个额外的存储空间nums;

* 首先，nums[0],因为第一个孩子至少有一颗糖；
* 从左向右遍历，若当前孩子评分比上一个孩子高，该孩子获得比上一个孩子多一颗糖；默认情况下每个孩子只获得一颗糖
* 从右向左遍历，若当前孩子比后一个孩子高，并且后一个孩子在上一轮遍历获得糖果数比当前孩子多，该孩子获得比后一个孩子多一颗糖；
* 统计结果并返回结果

## 1.1 代码

```java
public int candy(int[] ratings) {
		int[] nums = new int[ratings.length];
		//初始第一位小朋友获得一个糖果
		nums[0] = 1;
		//从左到右
		for (int i = 1; i < ratings.length; i++) {
			//满足从左到右，右边的小朋友表现分更高，得到比左边的小朋友多一颗糖
			if(ratings[i]>ratings[i-1]) {
				nums[i]=nums[i-1]+1;
			}else {
				//满足条件1：每个小朋友都至少有一颗糖
				nums[i] = 1;
			}
		}
		
		//逆序一次
		for (int i = ratings.length-1; i >0; i--) {
			//满足从左到右，右边的小朋友表现分更高，得到比右边的小朋友多一颗糖
			if(ratings[i-1]>ratings[i]&&nums[i-1]<=nums[i]) {
				nums[i-1]++;
			}
		}
		//统计结果
		int count =0;
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			count+=nums[i];
		}
		return count;
    }
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为孩子的个数，需要两次（从左向右，从右向左遍历）；之后还需对结果空间遍历一次获取结果
* 时间复杂度：O(N),引入一个数组用来存储每个孩子获得糖果的个数；