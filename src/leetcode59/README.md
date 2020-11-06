# 解题思路

## 1.拆分字符串

这道题目可以拆分字符串来实现功能。使用split方法，但是为了避免字符串最后出现空格字符，需要使用trim函数进行预处理。

### 1.1 代码

```java
public int lengthOfLastWord(String s) {
		String trim = s.trim();
		if(trim.equals("")) {
			return 0 ;
		}
		String[] words = trim.split("\\s+");
		return words[words.length-1].length();
		
    }
```

### 1.2复杂度分析

* 时间复杂度：O(n),极限情况下，所有字符都需要被遍历一次
* 空间复杂度：O(n), 额外的数组空间用来存储分割字符串

## 2.倒序枚举法

因为题目提到了求解最后一个字符串，是否可以从结束位置向前遍历取数呢？

答案是肯定的，那么如何计算呢？

* 首先使用trim函数去掉尾部的所有空字符
* 从后向前遍历，
  * if 去除char为字符，count++
  * if 为空 ，结束计数，返回count
  * 或循环结束，返回外层count

### 2.1 代码

```java
public int lengthOfLastWord(String s) {
		int count = 0;
		String trim = s.trim();
		for (int i = trim.length()-1; i >=0; i--) {
			if(trim.charAt(i)!=' ') {
				count++;
			}else {
				return count;
			}
		}
		return count;
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(n),极限条件下需要所有字符遍历一次
* 空间复杂度：O(n),trim函数使用的空间