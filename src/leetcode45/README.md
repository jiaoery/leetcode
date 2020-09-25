# 解题思路

根据题目有两种遍历方向开始为右上，然后方向改为左下，依次循环；大致思路是这样的，每次循环把一个方向的数据放入答案数组中，到达边界，改变方向；

## 1.1 分析问题

对于一个m*n的矩阵，所有的方向应该有m+n-1次。![image.png](https://pic.leetcode-cn.com/3c947d882c52cb893262275db1d40a22b8db0faf4f74126c1b8a16a87b5f8925-image.png)

* 方向的变更次数：遍历次数对2取余

  代码整体伪代码：

```java
int rows = matrix.length;
int columns = matrix[0].length;
		
//当前行列
int row = 0;
int column = 0;
//循环次数
int turn = rows+columns-1;
int[] result = new  int[rows*columns];
//当前项
int index = 0;
for (int i = 0; i < turn; i++) {
    //偶数向上,从0开始
	if((row+column)%2==0) {
	...
	}else{
	//偶数向下
	...
	}
}
```

* 向上走和向下走的方向判定：

  row,column 代表当前位置的横纵坐标，上方移动为 row--；column++;向下移动为row++，column--；所以根据条件的话，上方移动的范围条件为row>=0&&column<columns;向下移动的范围条件是column>=0&&row<rows;

  ```
  //向上移动
  while (row >= 0&& column<columns) {
  	result[index++] = matrix[row][column];
  	column++;
  	row--;
  }
  
  //向下移动
  while (column >= 0 && row<rows ) {
  	result[index++]=matrix[row][column];
  	column--;
  	row++;	
  }
  ```

  

* 移动越界条件处理：向上走的方向中会遇到两种越界情况

  * 1.column<columns 但是row<0的情况，如下图1--->2的情况；此时只需要row++即可
  * 2.colum>=columns 但是row>=0的情况，如下图 3---->6的情况；此时需要row+=2,column--

  ![InkedSnipaste_2020-08-09_20-48-50_LI.jpg](https://pic.leetcode-cn.com/8294a7c293676630a02d0ebd1e203e1cce7827eb22658e1625f97aa5cf524665-InkedSnipaste_2020-08-09_20-48-50_LI.jpg)

  ```java
  //顶部出界
  if(column<columns) {
  	row++;
  }else {//右边出界
  	column--;
  	row+=2;
  }
  ```

  向下移动越界情况依理

## 1.2 代码

```java
public int[] findDiagonalOrder(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return new int[] {};
		}
		int rows = matrix.length;
		int columns = matrix[0].length;
		
		//当前行列
		int row = 0;
		int column = 0;
		//循环次数
		int turn = rows+columns-1;
		int[] result = new  int[rows*columns];
		//当前项
		int index = 0;
		for (int i = 0; i < turn; i++) {
			//偶数向上
			if((row+column)%2==0) {
				while (row >= 0&& column<columns) {
					result[index++] = matrix[row][column];
					column++;
					row--;
				}
				//顶部出界
				if(column<columns) {
					row++;
				}else {//右边出界
					column--;
					row+=2;
				}
			}else {//奇数向下
				while (column >= 0 && row<rows ) {
					result[index++]=matrix[row][column];
					column--;
					row++;	
				}
				//左边出界
				if(row<rows) {
					column++;
				}else{//底部出界
					column+=2;
					row--;
				}
			}
		}
		return result;

	}
```

## 1.3 复杂度分析

* 时间复杂度： O(mn),m,n分别为数组的长度和宽度
* 空间复杂度：O(mn),需要存储结果空间为m*n