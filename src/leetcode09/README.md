# 解题思路

## 1.1 弹出和推入数字 & 溢出前进行检查

我们可以一次构建反转整数的一位数字。在这样做的时候，我们可以预先检查向原整数附加另一位数字是否会导致溢出

## 1.2代码

```
public static int reverse(int x) {
	        //2^31-1 = 2147483647,-2^31= -2147483648
	        //使用更大范围
	        long result = 0;
	        while(x != 0){
	            result=result*10+x%10;
	            x/=10;
	            //判断是否超域
	            if(result>Integer.MAX_VALUE||result<Integer.MIN_VALUE){
	                return 0;
	            }
	        }
	        return (int) result;

	    }
```

## 1.3 复杂度分析

* 时间复杂度：`O(log(x))`，xx 中大约有`log10(x)`位数字。
* 空间复杂度：`O(1)`。