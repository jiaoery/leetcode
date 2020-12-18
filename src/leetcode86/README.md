# 解题思路

以下的解题思路来自官方：

我们使用两个指针 read 和 write 分别标记读和写的位置。读写操作均从左到右进行：读入连续的一串字符，然后将压缩版写到数组中。最终，write 将指向输出答案的结尾。

保留指针 `anchor`，指向当前读到连续字符串的起始位置。

从左到右进行读取。当读到最后一个字符，或者下一个下一个字符与当前不同时，则到达连续区块的结尾。

当我们到达连续区块的结尾时，就从 `write` 写入压缩的结果。`chars[anchor]` 为字符，`read - anchor + 1` （若大于 1）为长度。

## 1.1 代码

```java
public int compress(char[] chars) {
		//anchor 指向连续的位置
		int anchor = 0,write = 0;
		for (int read = 0; read < chars.length; read++) {
			// 1.超域 2.前一个数据和后一个数据不相同 
			if(read+1==chars.length
					||chars[read+1]!=chars[read]) {
				//首先记录重复字符
				chars[write++] = chars[anchor];
				//需要压缩的个数超过所需表达
				if(read>anchor) {
					for (char c : ("" + (read - anchor + 1)).toCharArray() ) {
						chars[write++] = c;
					}
				}
				//当前位前进一位
				anchor = read+1;
				
			}
		}
		return write;
	}
```

## 1.2 复杂度分析

* 时间复杂度：O(N)，其中 N是 `chars` 的长度。
* 空间复杂度：O(1),仅使用三个指针