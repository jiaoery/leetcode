# 解题思维

## 1.1遍历矩阵

直接遍历的方式实现，无需多言

![边界条件.png](https://upload-images.jianshu.io/upload_images/2326194-fd3042742986a3db.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 1.2 代码

```
public int[][] imageSmoother(int[][] M) {
        //行数
		int rows = M.length;
		//列数
		int column = M[0].length;
		int[][] result = new int[rows][column];
		//分别遍历行列
		for(int i = 0 ;i<rows;i++) {
			for(int j = 0;j<column;j++) {
				int count = 0;
				//只取前后数
				for (int kr = i-1; kr <=i+1; kr++) {
					for (int kc = j-1; kc <= j+1; kc++) {
						//判断边际条件
						if(kr>=0 && kc>=0&& kr<rows&&kc<column) {
							result[i][j]+=M[kr][kc];
							count++;
						}
					}
				}
				//求取平均值
				result[i][j]/=count;
			}
		}
		return result;
    }
```

## 1.3 复杂度分析

* 时间复杂度：`O(n)`,跟像素点数有关
* 空间复杂度：`O(n)`,使用计算后的像素点数的空间