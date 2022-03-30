# 解题思路

使用栈来记录中间的数据，然后根据以下逻辑来判断碰撞：

* 1.若栈为空，或者当前栈顶元素是负数，或现在方向是正方向：直接入栈
* 若不符合上面条件，那么当前星球一定是反方向（负数），并且栈顶元素是正方向
  * 判断当前星球和栈顶星球的质量
    * 若栈顶比较大，当前星球爆炸，直接取下一个星球
    * 若当前星球较大，栈顶星球爆炸，继续判断1
    * 若是两个星球质量相同，一起爆炸，取下一个星球



## 1.1 代码

* 原始代码

```java
public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        //反方向
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty()||asteroid>0) {
                stack.add(asteroid);
            } else if(stack.peek()<0){
                stack.add(asteroid);
            }else {
                while (true){
                    //无对手了
                    if(stack.isEmpty()){
                        stack.add(asteroid);
                        break;
                    }
                    int batttle  = stack.peek();
                    //已經战胜所有的正向
                    if(batttle<0){
                        stack.add(asteroid);
                        break;
                    }else if(batttle+asteroid>0){
                        break;
                    }else if (batttle+asteroid==0){
                        stack.pop();
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
        }
        int size = stack.size();
        int[] result = new int[size];
        int index = size - 1;
        while (index >= 0) {
            result[index--] = stack.pop();
        }
        return result;
    }
}
```

* 优化代码

```java
public class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int index=0;
        int n = asteroids.length;
        while (index<n){
            //如何碰撞条件
            if(!stack.isEmpty()&&stack.peek()>0&&asteroids[index]<0){
                if(stack.peek()<-asteroids[index]){//若反方向的行星较大
                    stack.pop();
                }else if(stack.peek()>-asteroids[index]){//若正方向的行星较大
                    index++;
                }else{
                    stack.pop();
                    index++;
                }
            }else {
                stack.push(asteroids[index++]);
            }
        }
        int[] result = new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            result[i] = stack.pop();
        }
        return result;
    }
}
```

## 1.2复杂度分析

* 时间复杂度：O(N),需要遍历所有元素

* 空间复杂度;O(N),极限情况下需要所有元素入栈

  