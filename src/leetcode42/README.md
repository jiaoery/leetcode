# 解题思路

从题目的意思是需要顺时针输出矩阵中所有元素，轮询顺序如下：

![顺时针.png](https://upload-images.jianshu.io/upload_images/2326194-59a27b780a36ebc0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

旋转方向分别是 右，下，左，上；右，下，左，上...循环如此；这里可以考虑引入一个4*2的矩阵，

作为方向矩阵。

然后，整个矩阵所有元素都要求被遍历，所以，结果集合长度为m*n;

其次，需要判断边界条件：

* 1.行是否超界
* 2.列是否超界
* 需要判断边界元素是否已经被遍历

这里需要引入一个m*n的boolean矩阵标记当前节点是否已经被遍历；

最后，结束条件就是当所有元素都被遍历，也就是集合长度为m*n时，结束循环；



## 1.1 遍历

引入方向矩阵

```java
//方向矩阵 分别为 向右，向下，向左，向上
int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
```

引入标记矩阵

```java
//标记矩阵
boolean[][] remark = new boolean[rows][columns];
```

边界条件判断

```java
nextRow<0||nextRow>=rows||nextColumn<0||nextColumn>=columns||remark[nextRow][nextColumn]==true
```

## 1.2 代码

```java
public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();
		//判空
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return result;
		}
		//行列
		int rows = matrix.length;
		int columns =  matrix[0].length;
		//标记矩阵
		boolean[][] remark = new boolean[rows][columns];
		//总元素个数
		int size = rows*columns;
		int row = 0,column = 0;
		int directionIndex = 0;
		//方向矩阵 分别为 向右，向下，向左，向上
		int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
		for (int i = 0; i < size; i++) {
			result.add(matrix[row][column]);
			remark[row][column]= true;
			//检查边际条件
			int nextRow = row + directions[directionIndex][0], nextColumn = column + directions[directionIndex][1];
			if(nextRow<0||nextRow>=rows||nextColumn<0||nextColumn>=columns||remark[nextRow][nextColumn]==true) {
				//旋转方向
				directionIndex = (directionIndex + 1) % 4;
			}
			row += directions[directionIndex][0];
			column += directions[directionIndex][1];
		}
		return result;
	}
```

## 1.3 复杂度分析

* 时间复杂度：O(m*n),其中m为矩阵得行数，n为矩阵得列数；每个元素都将遍历一次
* 空间复杂度：O(m*n),标记矩阵引入m*n的空间。