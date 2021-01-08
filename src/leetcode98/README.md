# 解题思路

这道题目，读完对于它是个简单题目我是表示很不相信，这么难啊。大哥你不是逗我吗![img](http://www.biaoqingb.com/uploads/img1/20200724/4435a10060e7476d19ba6ab5c501d0e2.jpg)

然而，深挖下去发现一个规律，哎；貌似除了两个字符串完全相等的情况下，只要返回两个字符串的最长长度就可以了。然后我怀着怀疑提交了代码。。。然后通过了![img](http://www.biaoqingb.com/uploads/img1/20201116/16ce71c57a07c1677e66026a627e88ee.jpg)

不多说了，上代码

## 1.1 代码

```java
public int findLUSlength(String a, String b) {
		if (a.equals(b)) {
			return -1;
		}
		return Math.max(a.length(), b.length());
	}
```

## 1.2 复杂度分析

* 时间复杂度：O（1），啥都不说了，就一步到位
* 空间复杂度：O（1），没啥额外空间