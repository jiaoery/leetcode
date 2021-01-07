# 解体思路

即 *s* 的任意一个字符被 *t* 中唯一的字符对应，同时 *t* 的任意一个字符被 *s* 中唯一的字符对应。这也被称为「双射」的关系。

哈希表s2t 以 *s* 中字符为键，映射至 *t* 的字符为值。同时也判断value中是否包含t中对应的字符；若是存在，就返回false。

## 1.1代码

```java
public boolean isIsomorphic(String s, String t) {
		Map<Character, Character> map = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char si=s.charAt(i);
			char ti=t.charAt(i);
			if(map.containsKey(si)&&map.get(si)!=ti){
				return false;
			}
			if (!map.containsKey(si)&&map.containsValue(ti)) {
				return false;
			}
			map.put(si, ti);
		}
		return true;
	}
```

## 1.2 复杂度分析

* 时间复杂度：O(n)，其中 n为字符串的长度。我们只需同时遍历一遍字符串 s 和 t 即可。
* 空间复杂度：O(∣Σ∣)，其中Σ 是字符串的字符集。哈希表存储字符的空间取决于字符串的字符集大小，最坏情况下每个字符均不相同，需要 O(∣Σ∣) 的空间。

