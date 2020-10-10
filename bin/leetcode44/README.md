# 解题思路

改题目与Quesrtion42的问题有些类似.这里可以采用相关操作实现。

![顺时针.png](https://upload-images.jianshu.io/upload_images/2326194-59a27b780a36ebc0.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 1.1 遍历

引入方向矩阵

```java
//方向矩阵 分别为 向右，向下，向左，向上
int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
```

边界条件判断

```java
nextRow<0||nextRow>=rows||nextColumn<0||nextColumn>=columns||nums[nextRow][nextColumn]!=0
```

## 1.2 代码

```java
public static int[][] generateMatrix(int n) {
		//结果存储
		int[][] nums = new int[n][n];
		//方向矩阵
		int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
		int row = 0;
		int colomn = 0;
		//总大小
		int size = n*n;
		int direction = 0; 
		for (int i = 1; i <= size; i++) {
			nums[row][colomn] = i;
			//预计下一个位置信息
			int nextRow = row + directions[direction][0];
			int nextColomn = colomn +directions[direction][1];
			if(nextColomn<0||nextColomn>=n||nextRow<0||nextRow>=n||nums[nextRow][nextColomn]!=0) {
				direction = (direction+1)%4;
			}
			row+=directions[direction][0];
			colomn+=directions[direction][1];
		}
		return nums;
    }
```

## 1.3 复杂度分析

* 时间复杂度：O（n^2）,需要循环n^2次完成数组
* 空间复杂度度：O（n^2）,只引入了n*n大小的数组记录结果