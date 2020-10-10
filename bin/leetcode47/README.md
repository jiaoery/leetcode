# 解题思路

## 1.1 从外向内旋转矩阵

![矩阵分层.png](https://pic.leetcode-cn.com/ab4d64994f3b7b174eef572ff596728f142cceb51beae3679f0c8e230342b521-image.png)

每次的交换位置有四个对应位置

![图片.png](https://pic.leetcode-cn.com/9862d85a4282a4914bb0b3d480a3286307723f9ef27e295b6353e41e01bed63d-%E5%9B%BE%E7%89%87.png)

![image.png](https://pic.leetcode-cn.com/53f57c473f06d8e63eeba0f4874700d508bdc5367c614ac601f0fec7a7fe8dfe-image.png)

可以看出，第二次旋转的时候比第一次旋转偏移了一格，这里我们使用add变量来记录矩阵块的偏移量，首先不考虑偏移量的时候写出左上角的坐标为(pos1,pos1),右上角的坐标为(pos1,pos2),左下角的坐标为(pos2,pos1),右下角的坐标为(pos2,pos2),则能够写出偏移之后对应的坐标![坐标变换.png](https://pic.leetcode-cn.com/58c76a0a3b1fed08f9546aa0993c99f3d1fff08a63987c960a5ccf23f7c71678-image.png)

每计算完一层后，往内走一层继续循环

![矩阵向内收缩图.png](https://pic.leetcode-cn.com/caa134c9e2a8d6626cf66315720f67f40b863ee90d2e01d97a77943eba45039c-%E5%9B%BE%E7%89%87.png)

所以有pos1 = pos1+1,pos2 = pos2-1,终止的条件为pos1 < pos2

## 1.2 代码

```java
public void rotate(int[][] matrix) {
		if(matrix==null || matrix.length ==0) {
			return;
		}
		int pos1=0,pos2= matrix.length-1;
		//标记边界条件
		while (pos1<pos2) {
			//偏移量
			int add = 0;
			while (add < pos2-pos1) {
				//左上角标记为0，右上角为1块，右下角为2块，左下角为3块
				//缓存3
				int temp = matrix[pos2-add][pos1];
				// 3=2
				matrix[pos2-add][pos1] = matrix[pos2][pos2-add];
				//2=1
				matrix[pos2][pos2-add] = matrix[pos1+add][pos2];
				//1=0
				matrix[pos1+add][pos2] = matrix[pos1][pos1+add];
				//0 = temp
				matrix[pos1][pos1+add] = temp;
				//偏移量增加
				add++;
			}
			pos1++;
			pos2--;
		}
    }
```

## 1.3 复杂度分析

* 时间复杂度：O（n^2）,n是矩阵得行列数。每个元素循环一次
* 空间复杂度：O(1),未引入额外的空间

## 2.1 数学方法---转置矩阵+镜像矩阵

最直接的想法是先转置矩阵，然后翻转每一行。这个简单的方法已经能达到最优的时间复杂度O(N^2)。

![转置矩阵+镜像.png](https://upload-images.jianshu.io/upload_images/2326194-6df9276cb3b5187f.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 2.2 代码

```java
public void rotate(int[][] matrix) {
		// transpose matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = i; j < matrix.length; j++) {
				int tmp = matrix[j][i];
		        matrix[j][i] = matrix[i][j];
		        matrix[i][j] = tmp;
			}
		}
	
		

		// reverse each row
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length / 2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length - 1 - j];
				matrix[i][matrix.length - 1 - j] = temp;
			}
		}
		
		
	}
```

## 2.3 复杂度分析

- 时间复杂度：O（n^2）,n是矩阵得行列数。每个元素循环一次
- 空间复杂度：O(1),未引入额外的空间

