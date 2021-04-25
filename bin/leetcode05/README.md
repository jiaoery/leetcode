# 解题思路

这道题的解题重点在于随机打乱数据。所以这里可以采取两种方式来实现：

## 1、暴力重构法：

## 1.1思路

* 这里的方式就是另起一个集合`aux`（为何是集合不是数组，后面解释）把数组参数放进去。
* 每次随机从这个集合中随机一个数插入新的数组中，直至取完
* ps:为了防止数被重复取出，每次取完就把这个数从 `aux` 中移除。(集合方便`遍历`删除)
* `重置` 的实现方式很简单，只需把 `array` 恢复称最开始的状态就可以了

## 1.2复杂度分析

* 时间复杂度：` O(n^2)`
  乘方时间复杂度来自于 `list.remove（list.pop）`。每次操作都是线性时间的，总共发生` n` 次。

* 空间复杂度： O(n)
  因为需要实现 重置 方法，需要额外的空间把原始数组另存一份，在重置的时候用来恢复原始状态。

# 1.3 代码

[Solution0501](./Solution0501.java)

```java
public class Solution {
    private int[] array;
    private int[] original;

    private Random rand = new Random();

    private List<Integer> getArrayCopy() {
        List<Integer> asList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            asList.add(array[i]);
        }
        return asList;
    }

    public Solution0501(int[] nums) {
        array = nums;
        original = nums.clone();
    }

    public int[] reset() {
        array = original;
        original = original.clone();
        return array;
    }

    public int[] shuffle() {
        List<Integer> aux = getArrayCopy();

        for (int i = 0; i < array.length; i++) {
            int removeIdx = rand.nextInt(aux.size());
            array[i] = aux.get(removeIdx);
            aux.remove(removeIdx);
        }

        return array;
    }
}
```

# 2 洗牌算法

## 2.1 **思路**

我们可以用一个简单的技巧来降低之前算法的时间复杂度和空间复杂度，那就是让数组中的元素互相交换，这样就可以避免掉每次迭代中用于修改列表的时间了。

洗牌算法跟暴力算法很像。在每次迭代中，生成一个范围在当前下标到数组末尾元素下标之间的随机整数。接下来，将当前元素和随机选出的下标所指的元素互相交换 - 这一步模拟了每次从 “帽子” 里面摸一个元素的过程，其中选取下标范围的依据在于每个被摸出的元素都不可能再被摸出来了。此外还有一个需要注意的细节，当前元素是可以和它本身互相交换的 - 否则生成最后的排列组合的概率就不对了。为了更清楚地理解这一过程，可以看下面这些动画：

![洗牌算法.gif](https://upload-images.jianshu.io/upload_images/2326194-bd4239759d060e10.gif?imageMogr2/auto-orient/strip)



## 2.2 复杂度分析

* 时间复杂度 ： `O(n)`
   洗牌算法时间复杂度是线性的，因为算法中生成随机序列，交换两个元素这两种操作都是常数时间复杂度的。

* 空间复杂度：` O(n)`
  因为要实现 重置 功能，原始数组必须得保存一份，因此空间复杂度并没有优化。

## 2.3代码

[Solution0502](.../Solution0502.java)

```java
public class Solution {
    private int[] orginNums;
    private int[] shuffleNums;

    public Solution0502(int[] nums) {
        this.orginNums = nums.clone();
        this.shuffleNums = nums;
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return orginNums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        for (int i = 0; i < shuffleNums.length; i++) {
            int j = new Random().nextInt(shuffleNums.length);
            if (i != j) {
                shuffleNums[j] += shuffleNums[i];
                shuffleNums[i] = shuffleNums[j] - shuffleNums[i];
                shuffleNums[j] = shuffleNums[j] - shuffleNums[i];
            }
        }
        return shuffleNums;
    }
}
```



