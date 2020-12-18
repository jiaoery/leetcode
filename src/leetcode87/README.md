# 解题思路

这题的做法大概是这样：

1. 去掉前导空格
2. 再是处理正负号
3. 识别数字，注意越界情况。

这道题目如果只是简单地字符串转整数的话，就是简单地result = result * 10 + current.

对于越界情况：result * 10 + current > Integer.MAX_VALUE.在判断时，肯定无法取超域的值，所以转换后 ，result>(Integer.MAX_VALUE-curent)/10;的条件下，判断超域。ps:避免result存储超域的值。



## 1.1 代码

```java
public int myAtoi(String str) {
        char[] ch =  str.toCharArray();
		//是否为负数
		boolean isNegative = false;
		//当前位置
		int index = 0;
		//若超域或者为空格，继续向又移动
		while(index<ch.length&&ch[index]==' ') {
			index++;
		}
		//超域返回0
		if(index == ch.length) {
			return 0 ;
		}
		//超域返回0
		if(index == ch.length) {
			return 0 ;
		}
		if(ch[index]=='-') {
			//负号
			isNegative = true;
			index++;
		}else if (ch[index]=='+') {
			index++;
		}else if (!Character.isDigit(ch[index])) {
			//第一个字符为非数字字符
			return 0;
		}
		int result = 0;
		//判断是否超域，是否为数字
		while (index<ch.length&&Character.isDigit(ch[index])) {
			//通过相对于0的位置获取数字（比Integer更快）
			int current = ch[index] - '0';
			//判断是否超域
			if(result>(Integer.MAX_VALUE- current)/10) {
				return isNegative?Integer.MIN_VALUE:Integer.MAX_VALUE;
			}
			//累计结果
			result = result*10+current;
			index++;
		}
		
		return isNegative?-1*result:result;
    }
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为输入字符串的长度。这里遍历一次取值
* 空间复杂度：O(1),仅持有几个缓存变量