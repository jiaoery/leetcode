# 解题思路

## 1.打表法

一看n的值有范围，嘿，肯定有打表的骚操作，一顿操作，这不就出来了

### 1.1 代码

```java
class Solution {
    public int integerBreak(int n) {
       if(n==2) return 1;
        if(n==3) return 2;
        if(n==4) return 4;
        if(n==5) return 6;
        if(n==6) return 9;
        if(n==7) return 12;
        if(n==8) return 18;
        if(n==9) return 27;
        if(n==10) return 36;
        if(n==11) return 54;
        if(n==12) return 81;
        if(n==13) return 108;
        if(n==14) return 162;
        if(n==15) return 243;
        if(n==16) return 324;
        if(n==17) return 486;
        if(n==18) return 729;
        if(n==19) return 972;
        if(n==20) return 1458;
        if(n==21) return 2187;
        if(n==22) return 2916;
        if(n==23) return 4374;
        if(n==24) return 6561;
        if(n==25) return 8748;
        if(n==26) return 13122;
        if(n==27) return 19683;
        if(n==28) return 26244;
        if(n==29) return 39366;
        if(n==30) return 59049;
        if(n==31) return 78732;
        if(n==32) return 118098;
        if(n==33) return 177147;
        if(n==34) return 236196;
        if(n==35) return 354294;
        if(n==36) return 531441;
        if(n==37) return 708588;
        if(n==38) return 1062882;
        if(n==39) return 1594323;
        if(n==40) return 2125764;
        if(n==41) return 3188646;
        if(n==42) return 4782969;
        if(n==43) return 6377292;
        if(n==44) return 9565938;
        if(n==45) return 14348907;
        if(n==46) return 19131876;
        if(n==47) return 28697814;
        if(n==48) return 43046721;
        if(n==49) return 57395628;
        if(n==50) return 86093442;
        if(n==51) return 129140163;
        if(n==52) return 172186884;
        if(n==53) return 258280326;
        if(n==54) return 387420489;
        if(n==55) return 516560652;
        if(n==56) return 774840978;
        if(n==57) return 1162261467;
        return 1549681956;
    }
}
```

## 2.动态规划

哎，打表虽好，但是不能锻炼自己能力啊；再思考下有什么情况；我们发现有以下规律

>2->1
>
>3->2
>
>4->4
>
>5->6
>
>6->9
>
>7->12
>
>除了4之前的数字，从5开始，都是按照3拆开的，格式如下：
>
>5=2+3 -> 2*3=6
>
>6=3+3 ->3*3=9
>
>7=3+4-> 3*4=12
>
>8=3+3+2 ->3 * 3 * 2 = 18

也就是说，以3位因子能得到最大的值；那么可以在处理特殊情况下，按照这个规律来

### 2.1 代码

```java
public class Solution {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        if(n==4) return 4;
        int max  =1;
        while(n>4){
            max *=3;
            n-=3;
        }
        return max*n;
    }
}
```

### 2.2 复杂度分析

* 时间复杂度：O(1)
* 空间复杂度：O(1)