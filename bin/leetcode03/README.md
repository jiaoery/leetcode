# 解题思路：

## 1.暴力法

这里需要求解数据中心索引左右数的结果，并且比较两边的结果。伪代码解析如下：

* 循环nums[ ]，取下标位为i
  * 取对应 i,左边数组sum值为leftNum
  * 取对应i,右边数组sum值为rightNum
  * 对比leftNum,rightNum。相同就返回i
* 循环完还没找到对应i,返回-1；

### 1.1 代码

```java
public int pivotIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
	            int leftNum = 0;
	            int rightNum = 0;
	            for(int j = 0;j<nums.length;j++){
	                if(j<i){
	                    leftNum+=nums[j];
	                }else if(j>i){
	                    rightNum+=nums[j];
	                }
	            }
	            if(leftNum == rightNum){
	                return i;
	            }
	        }
	        return -1;
    }
```

### 1.2 复杂度分析

* 时间复杂度：O(N^2)

* 空间复杂度：O(N)

