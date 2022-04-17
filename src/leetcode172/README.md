# 解题思路

一开始的想法是对比原字符串是否是回文字符串，若不是，每次去掉一个字符，然后对比新的字符串是否是回文字符串；但是肯定在长度过长的时候会超时，那么是否有其他办法可以实现呢

思路如下：

![fig1](https://assets.leetcode-cn.com/solution-static/680/680_fig1.png)

在遇到不匹配的字符串的时候，匹配去掉左边或右边一个字符，然后对比剩下的子串是否是回文字符串；

## 1.1 代码

```java
public class Solution {
    public boolean validPalindrome(String s) {
        int start  =0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
               return valid(s,start+1,end)||valid(s,start,end-1);
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean valid(String s,int start,int end){
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
```

## 1.2 复杂度分析

* 时间复杂度：O（n），遍历数组一次
* 空间复杂度：O（1），使用常数级的额外变量