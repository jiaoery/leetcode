# 解题思路

本题用栈的方式来构建数据更好，但是需要先将所有的数据进行切分成String字符串，然后判断条件：

* `..`退回上一层，如果栈不为空，则推出栈顶元素
* 包含`..`或`.`时，跳过
* 其他情况直接入栈

入栈后再按照`/+元素`的方式出栈，若栈为空，直接返回`/`



## 1.1代码

```java
public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack =new Stack<>();
        StringBuilder reslut = new StringBuilder();
        for (String paths:path.split("/")){
            if (!stack.isEmpty()&&paths.equals("..")){
                stack.pop();
            }else if("..".contains(paths)){
                continue;
            }else {
                stack.push(paths);
            }

        }
        for (String r:stack){
            reslut.append("/"+r);
        }
        return reslut.length()==0?"/":reslut.toString();
    }

}
```



## 1.2 复杂度分析

* 时间复杂度：O(N),N为分割后的元素个数
* 空间复杂度：O(N),N为分割后的元素个数，栈这里占据的空间