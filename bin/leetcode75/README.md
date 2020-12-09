# 解题思路

这道题目，切入点就是遍历找相邻两个参数的规律，所以可以引入两个指针` front`（前一个字符）`index`(当前字符)，解题思路如下：

* 取`front = S.charAt(0)`,也就是取字符串S的第一个字符；计数`count = 1`，（默认当前位已经有一个字符）
* `index `从字符串第二个位置开始取值，每次与`front`比较，出现以下情况
  * `index == front`；代表当前字符为重复字符；计数`count++`；
  * `index != front` ; 代表当前字符为不同字符；输出`front`和`count`；然后将`front=index;count =1`

* 遍历结束，需要追加最后一位的统计数据
* 判断结果和员字符串的长度
  * 结果长度大于or等于原字符串，输出原字符串
  * 结果长度小于原字符串，输出结果

## 1.1 代码

```java
public String compressString(String S) {
		if (S == null || S.equals("")) {
			return "";
		}
		int n = S.length();
		int count = 1;
		StringBuilder sBuilder = new StringBuilder();
		// 取出前置位字符
		char front = S.charAt(0);
		// 当前字符
		char index = S.charAt(0);
		for (int i = 1; i < n; i++) {
			index = S.charAt(i);
			if (index == front) {
				count++;
			} else {
				sBuilder.append(front).append(count);
				front = index;
				count = 1;
			}

		}
		//追加最后一位
		sBuilder.append(front).append(count);
		return sBuilder.length() >= n ? S : sBuilder.toString();
	}
```

## 1.2 复杂度分析

* 时间复杂度： `O(N`),`N`为字符串长度。遍历一次
* 空间复杂度：`O(1)`,除去结果字符串，仅仅使用了`front`和`index`两个指针，常数级