# 解题思路

这道题目就在于二者的对应性，其中pattern中每个字符ch都为str字符串中从空格切割后的每个新字符的可key;那么可以分析出这一道题目中使用的数据结构是key-value格式。这不就是map的数据结构吗。

数据结构定了是Character对应String的Map结构；那么怎么解决问题呢？

* 首先获取pattern的字符数组patterns（之后都如此记录）；
* 再获取str中的通过空格分割的字符串数组(使用Java中API split)
* 判断两者的长度是否相同;不相同的情况下，肯定不符合单词规律；返回false
* 若相同，则进行以下步骤
  * 遍历两个数组，依次取出字符ch和字符串strs[i].
  * 判定key字符中是否包含ch；若包含，但是str[i]与value值数据不符合；返回false
  * 若key中不包含ch,判断value中是否包含；若包含，则不符合规律；返回false
  * 若key以上都不符合，map中放入key和strs数据；
* 若全部都符合，返回true

## 1.1 代码

```java
public boolean wordPattern(String pattern, String s) {
		char[] patterns = pattern.toCharArray();
		//按照空格切割
		String[] strs = s.split("\\s+");
		//长度不相等，排除
		if(patterns.length!=strs.length) {
			return false;
		}
		//保存键值对的map
		HashMap<Character, String> map = new HashMap<Character, String>();
		for (int i = 0; i < patterns.length; i++) {
			char ch = patterns[i];
			//map中是否包含key值
			if(map.containsKey(ch)) {
				//如果map对应值和strs当前值不符合，返回false
				if(!map.get(ch).equals(strs[i])) {
					return false;
				}
			}else {//key中不包含数据
				if(map.containsValue(strs[i])) {
					return false;
				}else {
					map.put(ch, strs[i]);
				}
			}
		}
		return true;
    }
```

## 1.2 复杂度分析

* 时间复杂度：O(N),对数据做一次遍历
* 空间复杂度：O(N)，使用了map和数组结构；