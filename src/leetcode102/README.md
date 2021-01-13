# 解题思路

首先排除两个特殊情况：

* 输入行数为1
* 输入行数>=字符串的长度

这两种情况不存在N字变换，直接输出输入字符串；

正常情况下的处理，可以按照结果统计规律：

```yaml
0   (+6)                     6  (+6)                        12
↓                    ↗     ↓                        ↗
1   (+4)         5     (+2)  7  (+4)             11
↓           ↗              ↓              ↗
2   (+2)  4            (+4)  8  (+2)  10
↓  ↗                       ↓    ↗
3                      (+6)  9
```

* 第0行和最后一行，每两个元素在原字符串的位置距离为：`2*（numRows-1)`
* 中间行，每次加b，b初始值为a-2i，其余b = a - b

## 1.1 代码

```java
public String convert(String s, int numRows) {
		//特殊情况
		if(numRows==1||numRows>s.length()){
            return s;
        }
		int distance = 2*(numRows-1);
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < numRows; i++) {
			int index = i;
			//第一行或最后一列，距离为distance的距离
			if(i==0||i==numRows-1) {
				while (index<s.length()) {
					result.append(s.charAt(index));
					index+=distance;			
				}
			}else {
				int match = distance - 2*i;
				//中间行每次间隔都是 distance - 2*i
				while (index < s.length()) {
					result.append(s.charAt(index));
					index += match;
					match = distance - match;		
				}
			}
		}
		return result.toString();
    }
```

## 1.2复杂度分析

* 时间复杂度：O(N),N为字符串的长度，极限条件下每个字符都需要遍历一次
* 空间复杂度：O(N),Stringbuilder存储需要的空间为N