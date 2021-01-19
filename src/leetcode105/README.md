# 解题思路

这题目在字符串中有相同问题，可以转成字符串处理，但是这里是考察数学运用能力，所以使用数学转换的方式；既然这里定义的回文数字就是正序和倒序相同；

那么引入一个临时变量，将输入数字变为倒序数字；

![fig1](https://assets.leetcode-cn.com/solution-static/9/9_fig1.png)

## 1.1 代码

```java
public boolean isPalindrome(int x) {
		try {
			// 负数都不满足回文数
			if (x < 0) {
				return false;
			}
			int y = 0;
			int temp = x;
			while (temp > 0) {
				y = y * 10 + temp % 10;
				temp /= 10;
			}
			return x==y;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
```

## 1.2 复杂度分析

* 时间复杂度：O(logN),N为输入字符，每次除以10
* 空间复杂度：O(1),我们只需要常数空间存放的若干变量