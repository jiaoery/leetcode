# 解题思路

本题思路非常明确，可以根据空格的数量进行判断，从s中逐字符串取出字符，然后判断，如果是空格，就将输入需求次数k减一；终止条件：当字符取完，或者k==0时，跳出循环；当前的index之间的字符就是结果；

## 1.1 代码

```java
public class Solution{
  public String truncateSentence(String s, int k) {
        int index = 0;
        while (index<s.length()){
            if(s.charAt(index)==' '){
                k--;
            }
            if(k>0){
                index++;
            }else{
                break;
            }
        }
        return s.substring(0,index);
    }
}
```

## 1.2 复杂度分析

* 时间复杂度：O(n),需要循环字符串一次
* 空间复杂度：O(1)