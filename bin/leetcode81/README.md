# 解题思路

本题的解题思路就在于如何找到需要的行和列。首先要排除特殊情况：

* 没有黑格子或者全部都是黑格子；（res = 1）

* k<n时，返回值res=0（一行或者一列都涂不满）

然后我们来分析一般情况
（1）假设我涂了i行，j列，那么一共所涂的方块数应该为in+j(n-i) 注意因为我们先涂了行，再涂列时每涂一列变黑的方块数应为`（n-i）`
（2）由题意，`k=in+j(n-1)`，那么倒推一下就可以知道`j=(k-i*n)/(n-i)`
（3）那么怎么判断所取的i,j是否满足题意呢，只需要知道j是否为整数就行了，因为j不为整数时，相当于没有涂满一列。
（4）最后再利用排列组合算出每一组i，j的情况`C（n,i）*C(n,j)`，再相加就是最后结果

## 1.1 代码

```java
/**
	 * 
	 * @param n 每次几行几列
	 * @param k 目标涂黑格数
	 * @return 方案个数
	 */
	public int paintingPlan(int n, int k) {
		// 为零或者全部涂满，只有一种方案
		if (k == 0 || n * n == k) {
			return 1;
		}
		// 因为涂一行和一列，都至少有n个黑格
		if (n > k) {
			return 0;
		}
		int result = 0;
		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if(i*n+j*n-i*j==k) {
					System.out.println(i+","+j+","+C(n,i)+","+C(n,j));
					result+= C(n,i)*C(n,j);
				}
			}
		}
		return result;
	}
	
	/**
	 * 求解组合Cxy
	 * @param x 大数
	 * @param y 小数
	 * @return
	 */
	 public int C(int x,int y){
	        if(y == 0)return 1;
	        int n = 1;
	        for(int i = 0;i < y;i++){
	            n *= (x - i);
	        }
	        for(int i = 1;i <= y;i++){
	            n /= i;
	        }
	        return n;
	    }
```

## 1.2 复杂度分析

* 时间复杂度：O(n^2),N为图版长度
* 空间复杂度：O(1)