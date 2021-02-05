# 解题思路

# 1.双指针+窗口滑动

这道题目可以将字符串`s`和`t`中每个字符的距离变成一个数组表示，假设这个数组为`arrs`，那么`arrs[i]=abs(s(i)-t(i))`;那么这道题最终变成另一个问题：

> 问题转化成计算数组`arrs` 的元素和不超过`maxCost `的最长子数组的长度

那么使用滑动窗口和双指针的方式是可行的。

具体的思路如下：

* 引入左右指针left和right(初始值为0),分别表示最大值开始位置和结束位置；他们之间的总合不超过maxCost,此时子数组的长度为right-left+1
* 在左右指针移动过程中需要一个变量sum来动态记录当前状态的最大值；同时为了得到长度的最大值，左右指针left和right应严格遵循以下两个条件：
  * 左指针的位置尽量小
  * 右指针的位置尽量大

### 1.1 代码

```java
public int equalSubstring(String s, String t, int maxCost) {
		int size = s.length();
		int[] arrs = new int[size];
		// 计算所有距离
		for (int i = 0; i < arrs.length; i++) {
			arrs[i] = Math.abs(s.charAt(i) - t.charAt(i));
		}
		
		//最小值为0
		int maxlength = 0;
		//双指针
		int left = 0,right=0;
		int sum  = 0;
		while (right<size) {
			sum += arrs[right];
			//左指针位移
			while (sum>maxCost) {
				sum-=arrs[left++];
			}
			maxlength = Math.max(maxlength, right - left + 1);
			right++;
		}
		return maxlength;
	}
```

### 1.2 复杂度分析

* 时间复杂度：O(N),其中 N 是字符串的长度,arr取值会遍历一次，左右指针移动极限情况下也各遍历一次
* 空间复杂度：O(N),引入的临时数组arrs的长度