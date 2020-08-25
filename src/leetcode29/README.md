# 解题思路

## 1.1 排序

这道题目可以按照以下的方法来解决：

* 1、首先看到h个元素大于等于某个值，N-h个元素小于等于某个值，这显然是一个有序序列的特征，所以自然而然的想到先将数组排序；
* 2.将数组排序后，对于给定的某个i,我们知道citations.length-i篇论文的引用数 >=citations[i],i篇论文引用数<=citations[i]
* 3.不妨设h=citations.length-i,即至多有h篇论文分别引用了至少citations[i]次，其中citations.length-h论文的引用数不多于citation[i]次。

既然如此，只要citations[i]>=h，就满足题意

## 1.2 代码

```
public int hIndex(int[] citations) {
		//先排序
		Arrays.sort(citations);
		for (int i = 0; i < citations.length; i++) {
			//当前的h的度
			int h = citations.length - i;
			if(h<=citations[i]) {
				return h;
			}
		}
		return 0;
    }
```

## 1.3 复杂度分析

* 时间复杂度：`O(nlogn)`,使用排序算法
* 空间复杂度：`O(1)`,不使用额外空间



