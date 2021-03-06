# 解題思路

这道题目的解题点在于，发现最大值的范围；从题目中可以知道以下几点：

* 1.目标矩阵初始元素都为0
* 2.目标矩阵大小为m*n
* 3.操作矩阵包含a,b两个数；且操作范围为0<=i<a,以及0<=j<b;(这里是解题的关键点)
* 4.每次操作范围内的元素值都增加1

## 1.暴力枚举法

可以按照暴力法解决，先将操作矩阵的操作执行完毕后，再遍历查询最大值个数；这样的话就务必引入m*n大小的矩阵（空间复杂度O(mn)）,并且每次操作都会遍历一次矩阵，时间复杂度也将达到O(xmn);x为操作次数；这里写出来肯定超时，pass

## 2.几何区间解法

从上面思路点第3点，可以知道，由于:0<=i<a,以及0<=j<b每次的操作都是从M(0,0)开始.

![image.png](https://pic.leetcode-cn.com/26e0a0c8beab6fcc0edfc099a9188179210b6b627f5a77970b672338a99f864a-image.png)

这里就可以看出，最大值区域应该是在所有区间的相交区间。那么只需要求出这个最小区间就可以了。

### 2.1 算法

* 1.求解所有行操作ops中与m的最小值
* 2.求解所有列操作ops中与n的最小值
* 3.返回两个最小值的乘积，即为结果

### 2.2 代码

```
public int maxCount(int m, int n, int[][] ops) {
		 for(int[] op:ops){
		        m = Math.min(op[0],m);
		        n = Math.min(op[1],n);
		    }
		    return m*n;
	    }
```

### 2.3 复杂度分析

* 时间复杂度：`O(x)`,`x`为矩阵操作次数
* 空间复杂度：`O(1)`,未引入额外的存储空间