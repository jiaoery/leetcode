# 解题思路

# 1.暴力法

既然最后需要所有参数相等，那么可以找出数组中最大数下标max和最小数下标min,每次除max下标，其他参数自加1,计数器count++.最终判断max是否等于min。

![数组最小次移动.png](https://upload-images.jianshu.io/upload_images/2326194-bf35f40fecd8f22e.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 1.2 代码

```
public int minMoves(int[] nums) {
       //下标
		 int max=nums.length-1,min=0,count=0;
		 while(true) {
			 for (int j = 0; j < nums.length; j++) {
				if(nums[min]>nums[j]) {
					min = j;
				}
				if(nums[max]<nums[j]) {
					max = j;
				}
			}
			 //如果达到条件
			 if(nums[max] == nums[min]) {
				 break;
			 }
			 //除最大值外，其他位置都自加1
			for (int i = 0; i < nums.length; i++) {
				if(i!=max) {
					nums[i]++;
				}
			}
			count++;
		 }
		 return count;
    }
```

## 1.3 复杂度分析

* 时间复杂度：*O*(*n*2*k*)，其中` n` 为数组长度，`k`为最大值和最小值的差。所以，提交后，直接超时了
* 空间复杂度：`O(1)`,未使用额外空间

## 2.1 排序法

这里可以考虑把数组排序后。然后逆转一下题目意思：n-1个元素+1.是否可以理解为一个最大元素-1.当所有元素都处于最小值的情况下，达到平衡。

ps:可以理解为-----55个少数民族加分，相当于汉族学生减分。

## 2.2 代码

```
public int minMoves(int[] nums) {
       Arrays.sort(nums);
		int count =0;
		for (int i = 0; i < nums.length; i++) {
			count += nums[i]-nums[0];
		}
		return count;
    }
```

## 复杂度分析

* 时间复杂度： `O(nlogn)`,排序所使用的时间
* 空间复杂度：`O(n)`,排序使用的空间

## 3.1 数学优化

在方法2种，使用了排序的，但是我们在求解过程中只需要找到最小值.所以是否可以使用遍历而不使用排序算法的方式来优化解决方案呢？

* 将排序改成遍历查找最小值

## 3.2 代码

```
public int minMoves(int[] nums) {
		 int min =Integer.MAX_VALUE;
		 int count = 0;
		 //寻找数组种最小值
		for (int i = 0; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
		}
		//运算移动次数
		for (int i = 0; i < nums.length; i++) {
			count += nums[i]-min;
		}
		return count;
	 }
```

## 3.3 复杂度分析

* 时间复杂度：`O(n)`,遍历数组两次
* 空间复杂度：` O(1)`,只使用固定大小的额外空间



