# 解题思路

## 1、暴力法

和49题一眼，直接轮询相加即可；但是查询耗时非常严重

### 1.2 代码

```java
public class Solution5101 {

	private int[][] data;

    public Solution5101(int[][] matrix) {
        this.data = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
		for (int row = row1; row <= row2; row++) {
			for (int col = col1; col <= col2; col++) {
				sum += data[row][col];
			}
		}
		return sum;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O（MN).M为需要计算的行数；N为需要计算的列数
* 空间复杂度：O（1）,未引入额外的储存空间



## 2. 按行动态规划

尝试将二维矩阵视为一维数组的 m*m* 行。为了找到区域和，我们只需要在区域中逐行累积和。

### 2.1 代码

```java
private int[][] sums;

	public Solution5102(int[][] matrix) {
		if (matrix.length == 0 || matrix[0].length == 0) return;
		sums = new int[matrix.length][matrix[0].length+1];
		//动态规划算法
		 for (int r = 0; r < matrix.length; r++) {
		        for (int c = 0; c < matrix[0].length; c++) {
		        	sums[r][c + 1] = sums[r][c] + matrix[r][c];
		        }
		    }
	}
	
	public int sumRegion(int row1, int col1, int row2, int col2) {
		int sum = 0;
		for (int i = row1; i <= row2; i++) {
			sum += sums[i][col2+1] - sums[i][col1];
		}
		return sum;
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(M) 查询时间为O(M).M为查询的行数
* 空间复杂度：O(MN)需要引入M*N的动态规划数组

## 3.动态规划

在方法2 的基础上是否可以继续优化；答案是可以的。这需要一部分的数学知识；这里可以修改动态规划数组的定义规则；

我们在一维版本中使用了累积和数组。我们注意到累积和是根据索引 0 处的原点计算的。将这个类比扩展到二维情况，我们可以预先计算出一个与原点相关的累积区域和，即 (0,0)；效果如下图![image.png](https://pic.leetcode-cn.com/dca167f68285ff2353eb3c186792098aaf866459958af0bf0dbe8c82602e2fa0-image.png)

**Sum(OD)**是相对于原点(0,0)的累计区域和。
如何使用预先计算的累积区域和得出**Sum(ABCD) **呢？

![image.png](https://pic.leetcode-cn.com/d4ad28b52f13edcc7fa09517e2f425d9b4dfbaaad7b56a9ec0b1e7e97e8e0888-image.png)

**Sum(OB)**是矩形顶部的累积区域和。

![image.png](https://pic.leetcode-cn.com/da44239ca4e857d4d1974f449a3f283a3863403d5ce677f86bd61fb63b34ac04-image.png)

**Sum(OC)**是矩形左侧的累积区域和。

![image.png](https://pic.leetcode-cn.com/227db43a25fb52ddccbc07c09afdc66ea60f97f8d636bbdaf68f167005bf6f75-image.png)

**Sum(OA) **是矩形左上角的累积区域和。

区域 **Sum(OA)**由 **Sum(OB)Sum(OB) **和 **Sum(OC)Sum(OC)**两次覆盖。我们可以使用包含排除原则计算 **Sum(ABCD)**如下：

>  sum(abcd)=sum(od)-sum(ob)-sum(oc)+sum(oa)

## 3.1代码

```java
public class Solution5103 {
	
	private int[][] sums;
	
	public Solution5103(int[][] matrix) {
		if(matrix.length == 0 || matrix[0].length == 0) return;
		sums = new int[matrix.length+1][matrix[0].length+1];
		//动态规划数组
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				sums[i+1][j+1] = sums[i+1][j] + sums[i][j+1] + matrix[i][j] - sums[i][j];
			}
		}
	}
	 
	
	public int sumRegion(int row1, int col1, int row2, int col2) {
		return sums[row2+1][col2+1] - sums[row1][col2+1] - sums[row2+1][col1] + sums[row1][col1];			
	}
	
	
}
```

### 3.2 复杂度分析

* 时间复杂度：O(1),查询使用的时间复杂度为O(1)
* 空间复杂度：O(MN),引入动态规划数组，占据M+1行，N+1列的数据空间