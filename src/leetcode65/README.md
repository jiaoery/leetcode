# 解题思路

## HashMap统计

使用HashMap来统计字符串s的次数，然后再依次取出字符串t中的字符：

* 1.如果HashMap不包含该字符，返回字符
* 2.如果HashMap中该字符value为0，返回字符
* 3.vlue -- 并更新

### 1.1 代码

```java
class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map =  new HashMap<Character, Integer>();
		//统计数据
		for (int i = 0; i < s.length(); i++) {
			map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
		}
		
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			//不存在的直接返回
			if(map.containsKey(ch)) {
				int count = map.get(ch);
				//若已经抵消完，剩下得就是增加字符
				if(count==0) {
					return ch;
				}else {
					map.put(ch, --count);
				}
			}else {
				return ch;
			}
		}
		
		return ' ';
    }
}

```

### 1.2 复杂度分析

* 时间复杂度： O(M+N),M为字符串s的长度，N为字符串t的长度
* 空间复杂度：O(M），存储了字符串s的字符出现次数

## 2.异或运算

因为每个字符为char，异或的特性在于与自己异或结果为0；并且异或运算满足交换律；

### 2.1 代码

```java
public static char findTheDifference(String s, String t) {
		//s与t长度相差1
		char ch = t.charAt(t.length()-1);
		//异或运算 a^a=0
		for (int i = 0; i < s.length(); i++) {
			ch ^= s.charAt(i)^t.charAt(i);
		}
		return ch;
	}
```

### 2.2 复杂度分析

*  时间复杂度：O(M+N),M为字符串s的长度，N为字符串t的长度
* 空间复杂度：O（1）