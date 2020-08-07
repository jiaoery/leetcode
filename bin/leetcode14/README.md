# 解题思路

## 1.1 递归算法直解

根据题目的意思，

```
F(0) = 0,   F(1) = 1
F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
```

那么可以直接使用递归算法解析。

## 1.2 代码

```
public int fib(int n) {
		if(n ==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        return (fib(n-1)+fib(n-2))%1000000007;
    }
```

运行结果就是。。。。。超时了。![查看源图像](https://tse2-mm.cn.bing.net/th/id/OIP.9WQeU7QG0K19T5-eR6r17QAAAA?pid=Api&rs=1)

为啥？

## 1.3 复杂度分析

* 时间复杂度：因为需要`2^n!`次。复杂度是`O(2^n!)`;

* 空间复杂度：不占用缓存空间，所以复杂度是`O(1)`

​	

## 2.1 动态规划算法

为何前面递归算法会如此复杂，原因就是每次都会有重复运算项。具体怎么样，一个图解释![Picture0.png](https://pic.leetcode-cn.com/25e913ab8d7a22bb017669e4a097cf51d10861f365002f2d8556ee7a64464cd8-Picture0.png)

这里就可以优化一下，引入一个动态规划数组来记录运算结果，这样可以避免重复运算项。具体：

* 引入动态规划数组`record`。大小与求解值n相同
* `record[0]=0,record[1]=1`.
* `record[n] =（record[n-1]+record[n-2]）%1000000007`;
* `record[n]`为所求结果。

## 2.2 代码

```
public static int fib(int n) {
		int[] record = new int[n+1];
		record[0] = 0;
		if(n>0) {
			record[1]=1;
		}
		for(int i =2;i<n+1;i++) {
			record[i]=(record[i-1]+record[i-2])%1000000007;
		}
		return record[n];
    }
```

## 2.3 复杂度分析

* 时间复杂度：由于解决了重复因子的运算，复杂度降低为`0(n)`
* 空间复杂度：由于引入了动态规划数组，空间复杂度`O(n)`

# 3.1 动态规划优化

由于求取过程无需中间空间，所以针对空间占用，还可以继续优化。这里是否可以使用两个参数`first`和`second`来记录`F(n-2)`和`F(n-1)`的值。

* 原理： 以斐波那契数列性质 `F(n + 1) = F(n) + F(n - 1)`为转移方程。
* 从计算效率、空间复杂度上看，动态规划是本题的最佳解法。

## 3.2 代码

```
public static int fib(int n) {
		if(n<2) {
			return n;
		}
		int constant = 1000000007;
		int first = 0;
		int second = 1;
		for(int i =2;i<n+1;i++) {
			int temp = second;
		    second = (first+second)%constant;
		    first =temp;
		}
		return second;
	}
```

## 3.3 复杂度分析

* 时间复杂度：未优化，`O(n)`
* 空间复杂度：只有两个缓存参数，空间复杂度未O(1)