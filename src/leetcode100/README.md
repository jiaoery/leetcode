# 解题思路

本题思路主要在于：

* 1.处理输入两个字符为空的情况

* 2.处理两个字符串长度不一样的情况
* 3.正常字符串相加的情况
* 最后还有进位的情况处理

## 1.1 代码

```java
public String addBinary(String a, String b) {
		if(a==null||a.length()==0)return b;
		if(b==null||b.length()==0)return a;
		
		//存储进位
		int temp = 0;
		StringBuilder result = new StringBuilder();
		int i = a.length() - 1;
        int j = b.length() - 1;
		while (i>=0 || j>=0) {
			if(i >= 0) temp += a.charAt(i --) - '0';
            if(j >= 0) temp += b.charAt(j --) - '0';
			result.append(temp%2);
			temp >>=1;
		}
		
		if(temp>0) {
			result.append(temp);
		}
		
		return result.reverse().toString();
    }
```

## 1.2 复杂度分析

* 时间复杂度：O(max(N,M)),NM分别为输入两个字符串的长度；
* 空间复杂度：O(1)，除去结果空间，复杂度为常数级