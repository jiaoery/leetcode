# 解题思路

可以使用一个HashMap用来处理所有数字出现的次数，然后根据k的值来分类解决相应的问题：

* k<0;由于不可能有绝对值为负数的情况，直接返回0
* k==0；这种情况下两个数一定为相同的数，也就是hashmap中所有有2个相同的数，都要被统计进来
* 其他情况就判断是否有其他符合条件的数，如当前值为num，是否存在num+k；



## 1.1 代码

```java
public class Solution {
    public int findPairs(int[] nums, int k) {
        //特殊处理k为负数
        if(k<0)return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result = 0;
        //若是为0,需要存在两个以上一样的数
        if(k==0){
            for(int num:map.keySet()){
                if(map.getOrDefault(num,0)==2){
                    result++;
                }
            }
        } else{//若不为零，就需要寻找目标值
            for(int num:map.keySet()){
                if(map.containsKey(num+k)){
                    result++;
                }
            }
        }
        return result;
    }
   }

```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为输入数组的长度，因为需要统计和根据不同的k处理
* 空间复杂度：：O(N),N为输入数组的长度，极限条件下hash表保存的长度就是数组的长度