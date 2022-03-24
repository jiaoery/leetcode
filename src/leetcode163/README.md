# 解题思路

具体思路是在枚举右边界 i 的同时，记录这个右边界之前每一个字符最后一次出现的位置，同时维护一个左边界 head ，保证滑动窗口 [head , i] 区间无重复字符，如果下一个字符 ch 的位置在滑动窗口 [head, i] 区间，则记录这个 i - head ，同时更新 head 为 ch 在现有滑动窗口 [head, i] 的位置。

注意：我们每一次更新的 head 是上一个重复字符在滑动窗口中的位置，而我们遍历右边界 i 的时候是找到在滑动窗口中有重复的 s[i] 进行操作的，就是说首尾实际上是不需要的，滑动窗口比真正的无重复字符子串要多一个字符的，在代码中要把这个子串减1，并且head的初始值也要是-1



## 1.1 代码

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        HashMap<Character,Integer> map =new HashMap<>();
        int length = Integer.MIN_VALUE;
        int index = 0;
        //标记头部位置
        int head = -1;
        while(index<s.length()){
            char current = s.charAt(index);
            if(map.containsKey(current)&&map.get(current)>head){
                length = Math.max(length,index-head-1);
                head = map.get(current);
            }
            map.put(current,index);
            index++;
        }
        length = Math.max(length,s.length()-head-1);
        return length;
    }
}
```

## 1.2 复杂度分析

* 时间复杂度：O(N),需要遍历一次
* 空间复杂度：O(N),hashmap使用的空间