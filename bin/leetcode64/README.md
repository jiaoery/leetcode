# 解题思路

## 1.引入额外空间

这种涉及遍历计数的最合适的就是使用额外空间来降低复杂度，所以这里使用HashMap来进行计数统计。然后再遍历一次字符串，出现次数为1的字符，就是单独字符

### 1.1 代码

```java
public int firstUniqChar(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		//记录每个字符出现次数
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		//统计字符出现次数
		for (int i = 0; i < s.length(); i++) {
			int count = map.get(s.charAt(i));
			if(count ==1) {
				return i;
			}
		}
		return -1;
    }
```

### 1.2 复杂度分析

* 时间复杂度：O(n),n为字符串的长度
* 空间复杂度：O(n),引入长度为n的HashMap。

## 2.双指针算法

这道题也可以使用双指针算法来解决，具体思路在于：

* 首先，从左边取出对应字符第一次出现的位置
* 其次，从右边取出对应字符最后出现的位置
* 比对是否为同一位置（左右都无重复，该位置值唯一）

### 2.1 代码

```java
public int firstUniqChar(String s) {
		 for (int i = 0; i < s.length(); i++) {
			 char ch = s.charAt(i);
			 //前后均为同一个位置
			if(s.indexOf(ch) == s.lastIndexOf(ch)) {
				return i;
			}
		}
		 return -1;
	 }
```

### 2.2 复杂度分析

* 时间复杂度：O(n^2),因为indexOf和lastIndexOf复杂度均为O(n)
* 空间复杂度：O(1),仅仅使用固定的额外空间

## 3.字母数组统计

题目注意中提到了，所有出现的字符都是26个小写字符，这也可以作为题目的一个切入点：

* 创建26个字母的数组
* 统计每个字符出现的次数
* 查询字符出现次数是否为1（唯一）
* 查询无结果返回-1

### 3.1 代码

```java
public int firstUniqChar(String s) {
		int[] words = new int[26];
		//统计每个字符出现的次数
		for (int i = 0; i < s.length(); i++) {
			words[s.charAt(i)-'a']+=1;
		}
		
		//得出结论
		for (int i = 0; i < s.length(); i++) {
			if(words[s.charAt(i)-'a']==1) {
				return i;
			}
		}
		return -1;
	}
```

### 3.2 复杂度分析

* 时间复杂度：O(n),n为字符串的长度，并且遍历两次
* 空间复杂度：O(1),引入的数组长度仅为26，为常数级额外空间