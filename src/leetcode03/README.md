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
public class Solution {
  public int pivotIndex(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int leftNum = 0;
      int rightNum = 0;
      for (int j = 0; j < nums.length; j++) {
        if (j < i) {
          leftNum += nums[j];
        } else if (j > i) {
          rightNum += nums[j];
        }
      }
      if (leftNum == rightNum) {
        return i;
      }
    }
    return -1;
  }
}
```

### 1.2 复杂度分析

* 时间复杂度：O(N^2)

* 空间复杂度：O(N)

## 2. 动态规划

这里可以使用动态规划来解决问题，引入一个动态规划数组dpl；用来存储数组左边的元素和；然后依次存储进数组；然后求出所有元素的和sum(问题：可能会存在数组的数字过大，超过int的32位最大数)；在不考虑sum超域的情况下；对比`sum - dpl[i]  == dpl[i]- nums[i]`得出对应位置；所不存在这个位置，返回默认值-1；

### 2.1 代码

```java
public class Solution {
  public int pivotIndex(int[] nums) {
    int sum = 0;
    int size = nums.length;
    if (size == 0) {
      return -1;
    }
    int[] dpl = new int[size];
    for (int i = 0; i < size; i++) {
      sum += nums[i];
      dpl[i] = sum;
    }

    for (int i = 0; i < size; i++) {
      if (sum - dpl[i] == dpl[i] - nums[i]) {
        return i;
      }
    }
    return -1;
  }
}
```

### 2.2 复杂度分析

* 时间复杂度：O(N), 两次循环
* 空间复杂度：O(N)，动态规划数组的大小

## 3.使用临时变量

在方法2中使用了动态规划数组，但是整个过程中只是比对了左边和右边的值差距；是否可以引入临时变量来解决空间占用的问题？答案是可以的；

* 引入两个临时变量sum，和target；
* sum在第一次循环中取出总值
* 第二次循环，sum减去当前值 ；sum -=nums[i]
* 对比target，若相符合，则返回下标位；若不符合，则 target+=nums[i]
* 默认无结果返回-1；

### 3.1 代码

```java
public class Solution {
  public int pivotIndex(int[] nums) {
    int sum = 0;
    for (int i = 0; i < nums.length; i++) {
      sum += nums[i];
    }
    int target = 0;
    for (int i = 0; i < nums.length; i++) {
      sum -= nums[i];
      if (target == sum) {
        return i;
      }
      target += nums[i];
    }
    return -1;
  }
}
```

### 3.2 复杂度分析

* 时间复杂度：O(N),因为只是循环数组两次
* 空间复杂度：O(1)，使用常数级的额外空间 target，sum