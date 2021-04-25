# 解题思路
这道题需求有三个：
* 1.面积固定
* 2.宽度W不大于长度L，那么W<=L
* 3.长宽之间的差距越小越好

其实可以认为这个矩形最完美的情况就是 正方形 也就是 w==L;但是如果不满足条件，就往两边走；那么思路也就来了

* 求解面积area 的平方根 sqrt ;
* while循环 sqrt >0;
    * 假如 area%sqrt==0;break;
    * 如果不符合。sqrt--;
* 返回 [area/sqrt,sqrt]为解决答案

## 1.1 代码
```java
public class Solution12101 {

    public int[] constructRectangle(int area) {
        //取平方值
        int sqrt  = (int) Math.sqrt(area);
        while (sqrt>0){
            if(area%sqrt==0){
                break;
            }
            sqrt--;
        }
        return new int[]{area/sqrt,sqrt};
    }
}
```
## 1.2 时间复杂度
* 时间复杂度：O(logn),使用平方根，所以整个解答只需要logn次
* 空间复杂度：O(1),除去结果空间，只使用了常数级额外变量