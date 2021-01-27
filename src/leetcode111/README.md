# 解题思路

因为等差数列求和有个公式`S(n)=n(n+1)/2` ；可以按照这个公式求解问题

## 1.1 代码

```java
public int sumNums(int n) {
        return n*(n+1)>>1;
    }
```

## 1.2 复杂度分析

* O(1)
* O(1)