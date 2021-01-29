# 解题思路

## 1.暴力解法

这道题可以分解为112题目的分解问题，只要每次求两个参数的明汉问题即可；

但是，在测试的时候超时了；

### 1.1 代码

```java
public int totalHammingDistance(int[] nums) {
		 int sum = 0;
		 for (int i = 0; i < nums.length; i++) {
			for (int j =i+1 ; j < nums.length; j++) {
				sum += hammingDistance(nums[i], nums[j]);
			}
		}
		 return sum;
	 }
	 
	 public int hammingDistance(int x,int y) {
		int z = x^y;
		int count = 0;
		while (z>0) {
			count  += z&1;
			z>>=1;
		}
		return count;
	}
```

### 1.1 复杂度分析

* 时间复杂度：O(M*N^2),其中M为所有参数中最长参数的二进制位数，N为输入的数字个数
* 空间度复杂度：O（1）

## 2.按位统计

既然分解问题无法解决，那还有其他方法吗？答案是肯定过的，在额外条件中提到，每个元素的范围从 `0`到 `10^9`。那么32位的二进制可以将这个范围囊括进去；所以问题可以分解为下面两个子问题：

* 输入元素里面1~32位每一位的0和1的个数（二进制，分别记为zero和one）
* 不同元素间同一进制位只有遇到一个为1 一个为0才会统计；所以某一位的不同个数为zero*one

也就是说统计出这32位上的差异数，相加即可；



### 2.1 代码

```java
public int totalHammingDistance(int[] nums) {
		int sum = 0;
		for (int i = 0; i < 32; i++) {
			int zero  = 0;
			int one  = 0;
			for (int num :nums) {
				if((num&1<<i) == (1<<i)) {
					one++;
				}else {
					zero++;
				}
			}
			sum+=one*zero;
		}
		return sum;
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(N*M),其中M为所有参数中最长参数的二进制位数，N为输入的数字个数

* 空间复杂度：O(1)