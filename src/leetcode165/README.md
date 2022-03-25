# 解题思路

本题可以用排序+贪心的方式来解决，只需要用最少的饼干满足最多孩子的需求即可，那么解决思路如下：

* 排序孩子需求数组和饼干供应数组
* 对比两个数组，使用饼干从小到大的供应量去匹配需求从小到大的孩子的数量

最后返回满足的孩子数量



## 1.1代码

```java
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int satified =0;
        Arrays.sort(g);
        Arrays.sort(s);
        int indexG = 0;
        int indexS = 0;
        while(indexS<s.length&&indexG<g.length){
            //可以满足孩子
            if(s[indexS]>=g[indexG]){
                satified++;
                indexS++;
                indexG++;
            }else{
                indexS++;
            }
        }
        return satified;
    }
}
```

## 1.2 复杂分析

* 时间复杂度：O（nlogn+mlogm），原本应该是快排O（nlogn+mlogm）+ 遍历O(n+m),合一起为O（nlogn+mlogm）
* 空间复杂度;O（nlogn+mlogm）,快排使用空间