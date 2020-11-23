# 解题思路

解决这个问题最简单的方法就是统计字符串中 AA的数目并检查 L是否是连续超过三个。如果 AA 的数目比 22少且 LLL不是给定字符串的一个子串，那么返回 true，否则返回 false。

## 1.1 代码

```java
public boolean checkRecord(String s) {
		// 标记缺勤状态
		int abort = 0;
		// 标记迟到
		int late = 0;

		for (int i = 0; i < s.length(); i++) {
			switch (s.charAt(i)) {
			case 'A':
				abort++;
				// 重置迟到标记
				late = 0;
				// 如果缺勤次数超过一次
				if (abort > 1) {
					return false;
				}
				break;
			case 'L':
				late++;
				// 连续迟到次数超过两次
				if (late > 2) {
					return false;
				}
				break;
			case 'P':
				late = 0;
				break;
			default:
				break;
			}
		}
		return true;
	}
```

## 1.2 复杂度分析

* 时间复杂度:O(N),N为字符串长度
* 空间复杂度:O(1),不使用额外的空间