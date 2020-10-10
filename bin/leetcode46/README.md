# 解题思路

最简单的方法是通过以行方式读取元素来提取给定矩阵的所有元素。然后在新的数组中赋值。



## 1.1 代码

```
public int[][] matrixReshape(int[][] nums, int r, int c) {
		if(nums == null||nums.length ==0) {
			return new int[][] {};
		}
		int rows = nums.length;
		int columns = nums[0].length;
		//是否符合能reshape
		if(r*c!=rows*columns) {
			return nums;
		}
		int[][] result = new int[r][c];
		//逐项赋值
		for (int i = 0; i < rows*columns; i++) {
			result[i/c][i%c] = nums[i/columns][i%columns];
		}
		
		return result;

	}
```

## 1.2 复杂度分析

*  时间复杂度：O(m*n), m为行数，n为列数；
* 空间复杂度：O(m*n), 使用额外空间m*n

