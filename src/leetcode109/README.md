# 解题思路

## 1.位运算

使用位运算可以实现

### 1.1 代码

```java
public int hammingWeight(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n = n&n-1;
		}
		return count;
	}
```

### 1.2 复杂度分析

* 时间复杂度：O(logn),因为位运算需要极限时间
* 时间复杂度：O(1)