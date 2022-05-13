# 解题思路

## 模拟+双指针

* 条件1：两个字符串的长度差距超过1，肯定是不能一次变换得到的
* 条件2：两个字符串长度差距为1，需要长的字符串删除一个字符
* 条件3：两个字符串长度相同，逐项比较即可

## 代码

```java
class Solution {
    public boolean oneEditAway(String first, String second) {
        int length1 = first.length();
        int length2 = second.length();
        int distance = length1-length2;
        if(distance>1||distance<-1){
            return false;
        }
        //仅能使用一次
        int count =1;
        int index1 = 0;
        int index2 = 0;
        while(index1<length1&&index2<length2){
            if(first.charAt(index1)!=second.charAt(index2)){
                if (distance==1){//first 长度更长,跳过一位
                    index1++;
                    count--;
                }else if(distance==-1){//second 长度更长，跳过一位
                    index2++;
                    count--;
                }else {//位数相同，后移一位
                    count--;
                    index1++;
                    index2++;
                }
                if(count<0){//机会使用完了
                    return false;
                }
            }else {
                index1++;
                index2++;
            }
        }
        return true;
    }
}
```

## 复杂度分析

- 时间复杂度:`O（M+N)`，`M`，`N`分别为两个字符串的长度
- 空间复杂度：`O(1)`,使用常数级的额外变量