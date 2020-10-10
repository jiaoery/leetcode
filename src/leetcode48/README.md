# 解题思路

## 1.1 引入额外空间（不符合题意）

这个题目可以考虑引入额外的空间做标记，具体思路如下：

* 引入两个集合rows,cols;记录元素为0的行与列
* 遍历数组，将对应元素为0的行列分别记录在rows,cols里
* 再次数组，如果对应元素的行列在rows或cols里有记录，置为0



## 1.2 代码

```java
public void setZeroes(int[][] matrix) {
		//记录包含0元素的行列
		List<Integer> rows = new ArrayList<Integer>();
		List<Integer> cols = new ArrayList<Integer>();
		
		//记录
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(matrix[i][j] == 0) {
					rows.add(i);
					cols.add(j);
				}
			}
		}
		
		//赋值
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(rows.contains(i)||cols.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}
	}
```

## 1.3 复杂度分析

* 时间复杂度：O(MN),其中M,N的分别为矩阵对应的行与列
* 空间复杂度：O(M+N),其中M,N的分别为矩阵对应的行与列;为集合所需最大空间

## 2.1 本地标记

既然不允许使用额外的空间，那么是否可以原地标记呢？是的，可以使用矩阵的第一行和第一列完成相同效果：

* 将矩阵的第一行和第一列作为标记
* 引入两个boolean类型参数isRow ，isCol 标记第一行和第一列是否包含0元素
* 遍历数组；从矩阵的第二行和第二列开始，如果元素为0，则将对应行和列的第一个元素置为0
* 遍历数组：将行中为0的元素对应列全部置为0；将列中为0的元素对应行全部置为0；
* 根据isRow ，isCol；将矩阵第一行和第一列置为0

## 2.2 代码

```java
public void setZeroes(int[][] matrix) {
		// 是否首行首列为0
		boolean isRowzero = false, isColzero = false;
		// 判断第一列是否为0
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				isColzero = true;
				break;
			}
		}

		// 判断第一行是否为0
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				isRowzero = true;
				break;
			}
		}
		
		

		// 除第一行/列外，其他元素存在0，标记当前第一行，第一列对应元素为0
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}
		
		

		// 将第一行/列中元素为0的行/列置为0
		for (int i = 1; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				for (int j = 0; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 0; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}
		
		

		//重置第一行/列为0
		if (isRowzero) {
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i] = 0;
			}
		}

		if (isColzero) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}

	}
```

## 1.3 复杂度分析

* 时间复杂度：O(MN),其中M,N的分别为矩阵对应的行与列
* 空间复杂度：O(1),仅仅引入两个boolean类型参数作为标记

