# 解题思路

## 1.逐项检测

既然整个数字的规律在于二进制10的间隔，那么可以逐项检测是否符合10的规范

### 1.1 代码

```java
public boolean hasAlternatingBits(int n) {
		while (n>0) {
			//每次取出一个10的组合进行检测
			if(((n&1) ^ ((n>>1)&1))==1) {
				n>>=1;
			}else {
				return false;
			}
		}
		return true;
	}
```

### 1.2 复杂度分析

* 时间复杂度：O(logn),n为输入的数字
* 空间复杂度：O(1)

## 2.转换问题

既然条件下的数字二进制满足 101010这样的格式。那么，`n^n>>1  = 111...`一定是这样的格式；

那么问题就转换成 ：

> 1.n^n>>1 所有位数是否都为1

那么用一个临时变量temp用来存储n^n>>1；那么n&&n+1 ==0;也就是问题转换为

> 2.temp&temp+1 ==0

### 2.1 代码

```java
public boolean hasAlternatingBits(int n) {
		//111111
		int temp=n^(n>>1);
		//位数全为1的解题思路
		return (temp&(temp+1))==0;
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(1)
* 空间复杂度：O(1)