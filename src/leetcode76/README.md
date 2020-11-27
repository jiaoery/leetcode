# 解题思路

## 1.递归

最好的实现方式就是递归，但是为了避免无限循环，这里将1设置为终点。

### 1.1 代码

```java
public static int collatzConjecture(int n) {
		//等于1时进入谷底
		if(n==1) {
			return 1;
		}
		//奇数
		if(n%2==1) {
			n=3*n+1;	
		}else {
			 n = n/2;	
		}
		return collatzConjecture(n);
	}
	
```

