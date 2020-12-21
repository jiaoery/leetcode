# 解题思路

首先建立一个`HashMap`来映射符号和值，然后对字符串从左到右来，如果当前字符代表的值不小于其右边，就加上该值；否则就减去该值。以此类推到最左边的数，最终得到的结果即是答案



## 1.1 代码

```java
public int romanToInt(String s) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		char[] strs = s.toCharArray();
		//存储结果
		int result = 0;
		for (int i = 0; i < strs.length; i++) {
			if(i<strs.length-1) {
				//当前的值
				int current = map.get(strs[i]);
				//下一个参数的值
				int next = map.get(strs[i+1]);
			
				if(current<next) {
					result =result - current;					
				}else {
					
					result += current;
				}
			}else {//最后一位
				result += map.get(strs[i]);
			}
		}
		return result;
	}
	
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为字符串长度，这里遍历一次完成转换
* 空间复杂度：O(N)，使用了char数组来缓存数据