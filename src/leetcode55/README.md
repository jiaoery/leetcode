# 解题思路

## 1.暴力解法

暴力解法就是每次取一个char字符来求取是否符合公共前缀的条件。然后循环获取。当前这里需要注意超域的问题。严格将极限条件下，最长公共前缀一定是数组中长度最短的那个。

但是如果使用String中startwith的API会引入一个String对象，这样会增加运算时间。所以使用链表的方式来解决这个问题。

* 当字符串数组长度为 0 时则公共前缀为空，直接返回
* 令最长公共前缀 ans 的值为第一个字符串，进行初始化
* 遍历后面的字符串，依次将其与 ans 进行比较，两两找出公共前缀，最终结果即为最长公共前缀
* 如果查找过程中出现了 ans 为空的情况，则公共前缀不存在直接返回

### 1.1 代码

```java
public String longestCommonPrefix(String[] strs) {
		if(strs == null||strs.length==0) {
			return "";
		}		
		String result = strs[0];
		for (int i = 0; i < strs.length; i++) {
			int j =0;
			for (; j < strs[i].length()&&j<result.length(); j++) {
				if(result.charAt(j)!=strs[i].charAt(j)) {
					break;
				}
			}
			result = result.substring(0, j);
			if(result.equals("")) {
				return "";
			}
		}
		return result;
    }
```

### 1.2 复杂度分析

* 时间复杂度： O(s),s为所有字符串的长度
* 空间复杂度：O（1），除结果空间外，未引入额外空间