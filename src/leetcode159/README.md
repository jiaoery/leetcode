# 解题思路

## 1.Hash表

这种问题可以使用Hash表来表达，引入一个HashMap，key为索引和，map为对应索引对应的ArrayList结果集合；那么需要以下几步：

* 创建一个HashMap 
* 遍历list1和list2，找到所有符合条件的情况，并按照key-value方式放入
* 找出最小的索引和
* 返回对应索引和的结果数组



### 1.1 代码

```java
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        //存入map
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
               if(list1[i].equals(list2[j])){
                   if(!map.containsKey(i+j)){
                       map.put(i+j,new ArrayList<>());
                   }
                   map.get(i+j).add(list1[i]);
               }
            }
        }
        int minIndex  = Integer.MAX_VALUE;
        for(int index:map.keySet()){
            minIndex = Math.min(minIndex,index);
        }
        return map.get(minIndex).toArray(new String[map.get(minIndex).size()]);
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：*O*(*l*1∗*l*2∗*x*)。list1*l**i**s**t*1 中的每个字符串都与 list2*l**i**s**t*2 中的字符串进行了比较，l_1*l*1 和 l_2*l*2 是 list1*l**i**s**t*1 和 list2*l**i**s**t*2 列表的长度，x*x* 是字符串的平均长度。
* 空间复杂度：*O*(*l*1∗*l*2∗*x*)

## 2.优化方式

前一种方法虽然完成了任务，但是却需要将所有的元素都查询一遍，比较麻烦；能否有优化空间呢，那肯定有的，我们可以从最小的sum索引和开始，往大的索引和寻找，找到第一个符合条件的索引和，就是目标



### 2.1 代码

```java
public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<String> result = new ArrayList<>();
        for(int sum = 0;sum<list1.length+ list2.length-1;sum++){
            for (int i =0;i<=sum;i++){
                if(i< list1.length&&sum-i< list2.length&& list1[i].equals(list2[sum-i])){
                    result.add(list1[i]);
                }
            }
            if(result.size()>0){
                break;
            }
        }
        return result.toArray(new String[result.size()]);
    }
}
```

