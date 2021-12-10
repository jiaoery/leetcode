# 解题思路
这个题目只需要找到所有不符合规范的条件，这些条件下肯定游戏无法继续，并且无法判断谁获胜；首先分析，由于游戏先手方是标记为'X'，后手方标记为'O',访那么棋盘上只有两种情况：先手方已经下了，先手方还未下子；两种情况下:

* 先手已经下了，此时'X'的数量（xCount）一定比‘0’的数量（0Count）数量多一；此时规范：`xCount = OCount+1`
* 先手方未下，此时‘X’的数量（xCount）一定与‘0’的数量（Ocount）数量相同；此时规范：`xCount = OCount`

如果不符合上面两个规范，肯定游戏是无法继续的，返回false；若是符合呢，那么游戏将会继续，但是如何判断先手和后手胜利呢？

按照游戏规则，**只有在行或列，或者对角线存在三个一样的情况下，才可以判断一方胜利**。那么假设先手方胜利，那么一定满足以下条件：

* 先手已经下了，`xCount = OCount+1`
* 先手已经赢了

若是后手方赢了，就一定满足以下条件：

* 先手未下，`xCount = OCount`
* 后手方已经赢了

若是先手后手都未获胜，且符合前面的条件，那么就判断游戏继续。



## 1.1 代码

```java
public class Solution {
    public boolean validTicTacToe(String[] board) {
        int xCount = 0;
        int oCount = 0;
        //summary 'x' and '0' 's count
        for (String mark:board) {
            for (int i =0;i<mark.length();i++){
                char c = mark.charAt(i);
                if(c=='X'){
                    xCount++;
                }
                if (c=='O'){
                    oCount++;
                }
            }
        }
        //except situation
        if(xCount!=oCount&&xCount!=oCount+1){
            return false;
        }

        if(win(board,'X')&&xCount!=oCount+1){
            return false;
        }

        if(win(board,'O')&&xCount!=oCount){
            return false;
        }

        return true;

    }

    public boolean win(String[] bord,char p){
        for (int i = 0; i <3; i++) {
            //row
            if(p==bord[0].charAt(i)&&p==bord[1].charAt(i)&&p==bord[2].charAt(i)){
                return true;
            }
            //column
            if(p==bord[i].charAt(0)&&p==bord[i].charAt(1)&&p==bord[i].charAt(2)){
                return true;
            }
        }
        //正对角线
        if(p==bord[0].charAt(0)&&p==bord[1].charAt(1)&&p==bord[2].charAt(2)){
            return true;
        }
        //写对角线
        if (p==bord[0].charAt(2)&&p==bord[1].charAt(1)&&p==bord[2].charAt(0)){
            return true;
        }
        return false;
    }
}
```

## 1.2复杂度分析

* 时间复杂度：时间复杂度：O(C)，由于此题给定的棋盘大小为常数 C = 9，因此时间复杂度为常数。
* 空间复杂度：*O*(1)