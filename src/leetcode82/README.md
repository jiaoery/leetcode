# 解题思路

从右往左，如果是递增则修改；如果不为，就标记这个位置不符合，将该位置的前置位的数字减一。遍历结束后，修改数组从标记位到结束位全部为9（9最大）

# 1.代码

```java
public int monotoneIncreasingDigits(int N) {

		char[] ch = String.valueOf(N).toCharArray();
		/**修改字符标记位**/
		int index = ch.length;
		for (int i = ch.length-1; i > 0; i--) {
			//如果左边的数字大过右边，右边字符写为9，左边字符减1
			if(ch[i]<ch[i-1]) {
				index = i;
				ch[i-1]--;
			}
		}
		for (int i = index; i < ch.length; i++) {
			ch[i] = '9';
		}
		return Integer.parseInt(new String(ch));
    }
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为数字的长度
* 空间复杂度：O(N),N为数字的长度；并且这里使用了String和char数组做中间缓存