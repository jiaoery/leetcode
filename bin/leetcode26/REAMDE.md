# 解题思路

## 2.1 原地hash法

原本可以引入一个hashmap用来保存数组中每个参数出现的次数，最后遍历1>>n，查找缺失数。但是这里引入其他存储空间。所以可以使用原地hash法：（数组n标准结构应该是数字n在数组n+1的下标位置，如下图）

![标准数组.png](https://upload-images.jianshu.io/upload_images/2326194-9198d6d0cd5c667b.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

* 遍历数组nums，如果nums[i]符合在[1，n]区间中，且nums[nums[i]-1]!=nums[i].交换两个位置的参数
* 完成数组重组后，遍历1..n,j校验数组nums中nums[i]!=i+1;找出缺失数
* 如果本身为标准数组，返回数组长度length+1;

![hash变换.png](https://upload-images.jianshu.io/upload_images/2326194-f63c136da8bcb8d2.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 1.2 代码

```
public int firstMissingPositive(int[] nums) {
		int length = nums.length;
		for(int i=0;i<length;i++) {
			//循环找到对应的位置
			while(nums[i]>=1&&nums[i]<=length&&nums[nums[i]-1]!=nums[i]) {
				swap(nums,i,nums[i]-1);
			}
		}
		//遍历查找丢失数字
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=i+1) {
				return i+1;
			}
		}
		return length+1;
	}
	
	public void swap(int[] nums,int i, int j) {
		int temp = nums[i];
		nums[i]=nums[j];
		nums[j]= temp;
	}
```

## 3.3 复杂度分析

* 时间复杂度：`O(n)`,两次遍历`n`
* 空间复杂度：`O(1）`