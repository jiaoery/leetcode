# 解题思路

## 1.运算法

按照题目，可以根据s字符串的字符进行运算，最后返回x+y的结果；



### 1.1 代码

```java
public int calculate(String s) {
		 if(s.length()==0) {
			 return 1;
		 }
		 int x = 1,y=0;
		 for (int i = 0; i < s.length(); i++) {
			char index = s.charAt(i);
			if(index == 'A') {
				x = 2*x+y;
			}else if (index == 'B') {
				y = 2*y+x;
			}
		}
		 return x+y;
	 }
```

### 1.2 复杂度分析

* 时间复杂度:O(N),N为输入字符串的长度
* 空间复杂度：O(1)

## 2.数学方法

其实在看A 和 B的运算法则：

* A：x=2*x+y; 但是我们求解的结果是 x+y = 2*x+y+y = 2*(x+y)
* B:y=2*y+x;但是我们求解的结果是x+y=2*y+x+x=2*（x+y）

所以，无论是A还是B，都是把x+y的值乘以2；那么思路就来了；

### 2.1 代码

```java
public int calculate(String s) {
		return 1<<s.length();
	}
```

### 2.2 复杂度分析

* 时间复杂度：O（1）
* 空间复杂度：O（1）