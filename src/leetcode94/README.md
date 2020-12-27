# 解题思路

## 1.双指针算法

这里可以使用双指针来解题，分别从s取字符，然后去t匹配；当两者其中一个到达尾部，判定s是否到达底部（若全部匹配，就一定能到尾部）

###  1.1 代码

```java
public boolean isSubsequence(String s, String t) {
		 char[] s1 = s.toCharArray();
		 char[] t1 = t.toCharArray();
		 int ps = 0;
		 int pt = 0;
		 //两个字符都未到尾部
		 while (pt<t1.length&&ps<s1.length) {
			if(s1[ps]==t1[pt]) {
				ps++;
			}
			pt++;		
		}
		 return ps==s1.length;
	 }
```

### 1.2 复杂度分析

* 时间复杂度：O(M*N),M N分别为两个字符的长度
* 空间复杂度：O(M+N),引入char字符数组

## 2.使用String API

JAVA中可以使用 String 类中charAt函数来判定某个字符是否存在于字符串中；这里就根据返回值是否为-1 判断；若为-1 代表t中无s中的对应字符，返回false。

### 2.1 代码

```java
 public boolean isSubsequence(String s, String t) {
		 int pre = 0;
		 for (int i = 0; i < s.length(); i++) {
			char ps = s.charAt(i);
			int ts = t.indexOf(ps);
			if (ts == -1||ts<pre) {
				return false;
			}
			pre = ts;
		}
		 return true;
	 }
```

### 2.2 复杂度分析

* 时间复杂度：O(M*N),M N分别为两个字符的长度
* 空间复杂度：O(1),未引入额外空间

