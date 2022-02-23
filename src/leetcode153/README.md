# 解题思路

## 动态规划

本题的主要是需要判断，骑士（也就是象棋中的马）在棋盘中的概率，其中有以下重点：

* 1.骑士每次可以往八个方向移动，而且每次只能选择其中一个方向
* 2.跳出棋盘范围的，下一步不能行动（可理解为跳出棋盘范围的棋子不计入概率数组）
* 3.下一步的概率等于上一步出现的概率/8，因为上一步到这一步是八个方案选一

所以，我们可以得出使用动态规划更好解决本题，那么重点是整个思路：

* 引入数组记录每次运动的可能轨迹，direction
* 引入数组记录每种状态出现的概率
* 每次使用动态数组更新数组的结果

最终结果在初始对应位置

### 1.1  代码

```java
public class Solution {
    int[][] direct = {{-1,-2},{-2,-1},{-2,1},{-1,2},{1,2},{2,1},{2,-1},{1,-2}};
    public double knightProbability(int n, int k, int row, int column) {
        double[][] record = new double[n][n];
        //初始化
        for(int i=0;i<n;i++){
            for (int j=0;j<n;j++){
                record[i][j] =1;
            }
        }

        for (int temp=0;temp<k;temp++) {
            double[][] newRecord = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    for (int[] dir:direct){
                        int x= i+dir[0];
                        int y= j+dir[1];
                        if(x>=0&&x<n&&y>=0&&y<n){
                            newRecord[i][j]+=record[x][y] /8;
                        }
                    }
                }
            }
            record = newRecord.clone();
        }
        return record[row][column];
    }


}
```

### 1.2复杂度分析

* 时间复杂度：*O*(*k*×*n*^2)。总共需要更新数组中的元素kxn^ 2次方次
* 空间复杂度：*O*(*n*^2)。使用一个结果数组，一个动态数组，空间均为n*n；