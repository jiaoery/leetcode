# 解题思路

思路：利用StringBuilderAPI，先筛选所有非'-'的字符，倒着往前插入'-'



## 1.1代码

```java
public String licenseKeyFormatting(String S, int K) {
	        StringBuilder result = new StringBuilder();
	        //首先构建一个无"-"符号的字符串
	        for (int i = 0; i < S.length(); i++) {
	        	char index = S.charAt(i);
	        	if (index != '-') {
					result.append(index);
				}
			}
	        
	        for (int i = result.length()-K; i > 0; i-=K) {
				result.insert(i, '-');
			}
	        
	        return result.toString().toUpperCase();
	        
	    }
```



## 1.2 复杂度分析

* 时间复杂度：O(N),N为输入字符长度
* 空间复杂度：O(N),N为输入字符长度；极限情况下需要N长度的结果空间