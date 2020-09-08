# 解题思路

这里第一个想到的方式就是引入一个数组，将原数组内容插入其中。但是由于题目要求不允许引入额外的数组，这里直接抛弃这种方法（引入数组不可用）

第二个思维就是使用双指针算法，引入两个指针i,j,i指向非零元素，j指向零元素；当发现一个非零元素，判断i>j(代表零元素在非零元素前)，交换两者位置；看起来这个可行。

## 1.1 双指针算法

![双指针解决非零问题.png](https://upload-images.jianshu.io/upload_images/2326194-6976db417843cbde.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)



## 1.2 代码

```
public static void moveZeroes(int[] nums) {
		if(nums==null||nums.length <=1) {
			return ;
		}
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if(nums[i]!=0) {
				if(i>j) {
					nums[j] = nums[i];
					nums[i]=0;
				}
				j++;
			}
		}
    }
```

## 1.3 复杂度分析

* 时间复杂度：`O(n)`,轮询数组一次
* 空间复杂度：`O(1)`,使用固定的额外空间