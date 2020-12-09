# 解题思路

## 1.替换目标

* 遍历字符串中的字符，查找到为‘?’的字符时；
  * 取一个替换字符'a'
  * 若与左边字符相同，替换字符++；这里注意左边超域的问题
  * 若与右边字符相同，替换字符++；这里注意右边超域的问题
* 使用替换字符替换‘?’
* 最后返回替换后的字符串

![流程图](https://p3-juejin.byteimg.com/tos-cn-i-k3u1fbpfcp/5b68346d81ac4afc9c5b77735042e136~tplv-k3u1fbpfcp-watermark.image)---

### 1.1 代码

```java
public String modifyString(String s) {
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			// 寻找符合条件的？
			if (chars[i] == '?') {
				// 替换字符
				char ch = 'a';
				// 对比左右字符是否相同
				while ((i > 0 && chars[i - 1] == ch) || (i < chars.length - 1 && chars[i + 1] == ch)) {
					ch++;
				}
				// 替换字符
				chars[i] = ch;
			}
		}
		return new String(chars);
	}
```

### 1.2 复杂度分析

* 时间复杂度：O(N),N为字符串长度，且仅遍历一次
* 空间复杂度：O(N),N为字符串长度，用来中间存储操作的字符数组