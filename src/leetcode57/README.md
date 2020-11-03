# 解题思路

## 遍历直解

从题目可以看出山脉数组的特点：

* 有上山的步骤 ，条件就是A[i-1] < A[i]
* 有下山的步骤，条件就是A[i-1] > A[i]
* 必须同时存在上山和下山，也就是不能全是上山，或全是下山；
* 下山结束后，标记位应在数组最后的位置

### 1.1 代码

```java
public boolean validMountainArray(int[] A) {
		//先提条件判断
		if(A==null||A.length<3) {
			return false;
		}
		//标记
		int mark ;
		//上山
		for (mark = 1; mark < A.length&&A[mark-1]<A[mark]; mark++);
		//若一次爬到头或一次都爬不动
		if(mark==1||mark == A.length) {
			return false;
		}
		
		
		//下山
		for (; mark < A.length&&A[mark-1]>A[mark]; mark++) ;
	
		//判断是否达到山底
		return mark == A.length;
    }
```

### 1.2 复杂度分析

* 时间复杂度：O(n),n为数组的长度
* 空间复杂度：O(1),仅使用常数项的空间