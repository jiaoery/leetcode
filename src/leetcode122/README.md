# 解题思路
由于这道题不允许用 要求不使用乘法、除法和 ``mod ``运算符；那就想起了除法最初的设计；
> 例子： 9/3 = 3 ;用小朋友的方式可以理解为 9-3-3-3 = 0；
> 那么，我们是否可以用这个方式来解决问题呢 

这里我们使用divisor 的值来不断减去 dividendde的值，知道减不动；但是这样比较耗时；所以是否可以每次令减去值翻倍呢；
当减去值>被减去值；可以认为，结果在 ``2^(n-1) ~2^n`` 之间;
那么剩下的值如何确定呢；对 让 被减去值 =  被减去值 - 减去值*2^(n-1)；然后继续以上步骤，一直到结果为止；过程如下

* 处理特殊情况：（一定注意）
    * dividendde ==0 ；return 0;
    * divisor =1 return dividendde;
    * divisor=-1  
        * dividendde == Integer.MIN_VALUE return Integer.MAX_VALUE;
        * else   return -dividendde
* 扩大作用域 long a  = Math.abs((long)dividendde);long b  = Math.abs((long)divisor)
* 标记是否为负数 negative 
* 递归a,b 得出结果
    * 递归条件 a>b ; return 0;
    * long tb = b ;并且一直翻倍，直到tb >= a;记录翻倍次数，并继续递归
* 返回结果

## 1.1 代码
```java
public class Solution {
    public int divide(int dividend, int divisor) {
        //处理特殊情况
        if(dividend==0){
            return 0;
        }
        if(divisor ==1){
            return dividend;
        }
        //MIN_VALUE 会超域
        if(divisor==-1){
            if(dividend==Integer.MIN_VALUE){
                return Integer.MAX_VALUE;
            }else{
                return -dividend;
            }
        }

        long a = Math.abs((long)dividend);
        long b = Math.abs((long)divisor);
        //是否为负数
        boolean negative = (dividend>0&&divisor<0)||(dividend<0&&divisor>0);
        long result  = div(a,b);

        //若为负数
        if(!negative){
           return result>Integer.MAX_VALUE?Integer.MAX_VALUE: (int) result;
        }else {
            return (int) -result;
        }
    }

    //递归运算
    public long div(long a, long b){
        if(a<b) return 0;
        long count = 1;
        long tb = b; // 在后面的代码中不更新b
        while((tb<<1)<=a){
            //位移一位
            count = count <<1;
            //测试值也位移一位
            tb = tb<<1; // 当前测试的值也翻倍
        }
        return count + div(a-tb,b);
    }

}
```

## 1.2 复杂度分析
时间复杂度：O(logn),因为一直做二次变换
空间复杂度：O(logn)，递归使用的参数
    
    