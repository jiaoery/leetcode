# 解题思路

## 1.1变形杨辉三角

原有的杨辉三角的结构不适合进行计算机运算和表达。变形为其他格式

```
变形后----> 帕斯卡三角形
       1
       1 1
       1 2 1
       1 3 3 1
       1 4 6 4 1
       1 5 10 10 5 1
```

分析规律可以发现：

第一列的数据都为1.当行数==列数的时候也都为1.其他位置为上一行前后两个数之和。假设当前行为`i`,当前列为`j`，总结如下：

* 当`i==0`;或者`i==j`；`a[i][j]=1`
* 其他情况下`a[i][j]=a[i-1][j-1]+a[i-1][j]`

## 1.2 代码

```
public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> resultList = new ArrayList<List<Integer>>();
		int[][] arrays = new int[numRows][numRows];
		// 行数据
		for (int i = 0; i < numRows; i++) {
		     List<Integer> subList = new ArrayList<Integer>();
		     for(int j=0;j<=i;j++) {
		    	 //对角线和第一列元素均为1
		    	 if(j==0||i==j) {
		    		 arrays[i][j]=1;
		    	 }else {
					arrays[i][j]=arrays[i-1][j-1]+arrays[i-1][j];
				}
		    	 subList.add(arrays[i][j]);
		     }
		     resultList.add(subList);
		}
		
		return resultList;
    }
```

## 1.3 复杂度分析

* 时间复杂度：`O(n^2)`行列各循环一次
* 空间复杂度：`O(n^2)`,引入数组空间