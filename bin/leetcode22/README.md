# 解题思路

## 前言

本题目的关键点有三点：

* 什么是数组的度？数组的度的定义是指数组里任一元素出现频数的最大值
* 这里要寻找的目标？
  * 与nums度相同
  * 连续子串
  * 返回长度

## 1.1 算法思路

* 具有度数`d`的数组必须有一些元素会出现`d`次，如果某些子数组具备相同的度，那么某些元素`x`(出现`d`次)最短子数组应该是从`x`的第一次出现到`x`元素的最后一次出现.
* 所以，对于给定数组中的元素，让我们知道start是他第一次出现的索引，end是他最后一次出现的索引。例如数组n`ums={1,2,3,4,5}`时，`start[2]=1`和`end[2]=3`
* 然后，对于次数最多的每个元素`x`,`end[x]-start[x]+1`将是我们的候选答案，我们将取这些候选值的最小值。

## 1.2 代码

```
public int findShortestSubArray(int[] nums) {
		//保存左右位置参数以及元素出现次数
		HashMap<Integer, Integer> start =new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> end = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> count = new HashMap<Integer, Integer>();
		
		//统计数据
		for (int i = 0; i < nums.length; i++) {
			int key = nums[i];
			//未含有则保存
			if(!start.containsKey(key)) {
				start.put(key, i);
			}
			//最终放置最后一个
			end.put(key,i);
			count.put(key, count.getOrDefault(key, 0) + 1);
		}
		
		//求出值中最大值
		int counts = Collections.max(count.values());
		int ans = nums.length;
		//遍历count中key
		for(int key:count.keySet()) {
			if(counts==count.get(key)) {
				ans = Math.min(ans, end.get(key)-start.get(key)+1);
			}
		}
		return ans;
		
    }
```

## 1.3复杂度分析

* 时间复杂度：`O(n)`,需要循环`O(n)`时间
* 空间复杂度：`O(n)`,`start`,`end`,`count`使用的空间