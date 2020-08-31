# 解题思路

## 1.1 双指针

* 算法流程：设定i,j两个指针分别指向`num1`，`num2`尾部，模拟计算器人工加法；
  * **计算进位：**使用进位存储`carray` ,`temp`存储当前位运算结果，`carray/=10`.
  * **添加当前进位:** ·`temp=n1+n2+carry`,将结果`temp%10`添加至结果缓存`sb（StringBuilder）`的尾部;
  * **索引溢出处理：** 当指针 `i`或`j `走过数字首部后，给 `n1`，`n2 `赋值为 `0`，相当于给 `num1`，`num2` 中长度较短的数字前面填 `0`，以便后续计算。
  * 当遍历完 `num1`，`num2` 后跳出循环，并根据 `carry` 值决定是否在头部添加进位` 1`，再反转sb结果（由于是尾数添加，输出结果需要反转）最终返回 `sb`即可。

## 1.2 代码

```java
public static String addStrings(String num1, String num2) {
        StringBuilder sb =new StringBuilder();
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        //确认是否还有位数
        while(i>=0||j>=0){
          //char二进制运算
            int n1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int n2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int tmp = n1 + n2 + carry;
            //记录进位
            carry = tmp / 10;
            sb.append(tmp % 10);
            i--; j--;
        }
        //处理溢出进位
        if(carry==1){
            sb.append(carry);
        }
        //先旋转再输出
         return sb.reverse().toString();
    }
```

## 1.3 复杂度分析

* 时间复杂度 `O(max(M,N))`:其中 `M`*，`N` 为 输入数字长度，按位遍历一遍数字（以较长的数字为准）；
* 空间复杂度`O(1)`:未使用缓存空间。