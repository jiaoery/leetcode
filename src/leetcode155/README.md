 # 解题思路

由于本题需要寻找快乐数具备以下特点：

* 新的数由每个位数的平方和
* 若所有位数的平方和等于1，则判断它为快乐数

那么问题就是如何判断非快乐数，我们先找几个数实例看一下：

> 2 8 → 2²+8²=68 → 6²+8²=100 → 1²+0²+0²=1
>
> 3 2 → 3²+2²=13 → 1²+3²=10 → 1²+0²=1
>
> 3 7 → 3²+7²=58 → 5²+8²=89 → 8²+9²=145 → 1²+4²+5²=42 → 4²+2²=20 → 2²+0²=4 → 4²=16 → 1²+6²=37……

其中28和32均为快乐数，可以达到条件2；然后37在经过多次运算后，再次出现37这个数，也就说明这个数将继续循环下去，这个数肯定不是快乐数；那么问题关键就在于之前运算过的数是否在之后再次出现，这里有两个思路

## 1.Hash表

可以引入一个HashSet用来保存出现过的数据，若是满足条件1，就判断为快乐数，若是存在数再次出现，就判断非快乐数

### 1.1 代码

```JAVA
public class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> nums = new HashSet<>();
        while(!nums.contains(n)){
            nums.add(n);
            int sum = 0;
            while(n>0){
                sum+= (n%10)* (n%10);
                n/=10;
            }
            if(sum==1){
                return true;
            }else{
                n = sum;
            }
        }
        return false;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：根据使用的数字的复杂度判断
* 空间复杂度：根据使用的HashSet的大小确定

## 2. 快慢指针判断是否有环

其实这里也可以变种为判断链表是否有环的问题，引入两个快慢指针，若是快指针与慢指针相遇，就相当于存在环，这个数不是快乐数

### 2.2 代码

```JAVA
public class Solution {
    public boolean isHappy(int n) {
       int slow = happyNum(n);
       int fast = happyNum(happyNum(n));
       while (slow!=fast){
          if(slow==1){
              return true;
          }
          //slow one step
          slow = happyNum(slow);
           //fast two step
          fast = happyNum(happyNum(fast));
       }
       return slow==1;
    }

    public int happyNum(int n){
        int temp = 0;
        while (n!=0){
            int level = n%10;
            temp += level*level;
            n/=10;
        }
        return temp;
    }
}
```

### 2.2 复杂度分析

* 时间复杂度：根据使用的数字的复杂度判断
* 空间复杂度：根据使用的HashSet的大小确定