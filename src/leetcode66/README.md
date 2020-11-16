# 解题思路

## 1. HashMap统计

这个题目与之前的几个题目类似，这里可以使用HashMap来统计杂志中每个字符出现的次数，然后匹配赎金信里的数据；

### 1.1 代码

```java
public boolean canConstruct(String ransomNote, String magazine) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < magazine.length(); i++) {
			map.put(magazine.charAt(i), map.getOrDefault(magazine.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < ransomNote.length(); i++) {
			char ch = ransomNote.charAt(i);
			//不包含字符，返回
			if(!map.containsKey(ch)) {
				return false;
			}
			int count  = map.get(ch);
			//字典字符用完
			if(count == 0) {
				return false;
			}
			map.put(ch, --count);
		}
		
		return true;
    }
```

### 1.2复杂度分析

* 时间复杂度：O(M+N),M为杂志字符串长度，N为赎金信字符串长度
* 空间复杂度：O(K),K为HashMap占据的长度。

## 2.字母数组统计

除了使用HashMap之外，由于题目仅仅采用了26个小写字母，那么也可以使用字母数组来统计每个字符在杂志中出现的此时，其他的思路和`方法1`一样

### 2.1 代码

```java
public boolean canConstruct(String ransomNote, String magazine) {
		//26个字母
		int[] words = new int[26];
		for (int i = 0; i < magazine.length(); i++) {
			words[magazine.charAt(i)-'a']++;
		}
		
		//查询字符
		for (int i = 0; i < ransomNote.length(); i++) {
			if(words[ransomNote.charAt(i)-'a']==0) {
				return false;
			}else {
				words[ransomNote.charAt(i)-'a']--;
			}
		}
		return true;
	}
```

### 2.2 复杂度分析

* 时间复杂度：O(M+N),,M为杂志字符串长度，N为赎金信字符串长度
* 空间复杂度：O(1),仅使用常数级的额外空间