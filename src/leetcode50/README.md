# 解题思路

## 1 .暴力解法

直接保存传入的数组，然后每次请求sumary的时候，取出相关元素相加返回结果

### 1.1 代码

```java
public class Solution5001 {
	
	private int[] data;
	
	public Solution5001(int[] nums) {
		this.data = nums;
	}

	public int sumRange(int i, int j) {
		int sumary = 0;
		for (int k = i; k <= j; k++) {
			sumary += data[k];
		}
		return sumary;
	}
}
```

### 1.3 复杂度分析

* 时间复杂度：O(n),使用时间为需要运算元素个数
* 空间复杂度：O(1),不使用额外的空间

## 2.时间复杂度优化

- 假设我们预先计算了从数字 0 到 k 的累积和。我们可以用这个信息得出 sum(i，j)吗？
- 假设sum[0] = 0 ;那么可以得出结论sum[i+1] = sum[i]+num[i];形成累计和数组sum
- 那么从sum（i,j）就可以转为 sum(i,j) = sum[j+1]-sum[i]

### 2.1 代码

```java
public class Solution5002 {
	
	int[] sums ; 
	
	public Solution5002(int[] nums) {
		this.sums = new int[nums.length+1];
		//默认sums[0]=0;
		for (int i = 0; i < nums.length; i++) {
			sums[i+1] = sums[i]+nums[i];
		}
	}

	public int sumRange(int i, int j) {
		return sums[j+1]-sums[i];
	}
}
```

### 2.2 复杂度分析

* 时间复杂度： O(1),由于结果已经保存了，所以返回结果只会使用常数级运算
* 空间复杂度：O（n）,存储结果乘积需要n+1的空间大小。省略常数，为O(n)

