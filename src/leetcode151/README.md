# 解题思路

这种具备【】开闭合特征的字符串解析，第一反应就是使用栈来解决，在遇到【时入栈，遇到】时出栈；由于还具备数字和字符，所以整体的解题思路如下：

* 引入两个栈numStack和strStack，分别存储数字和字符；引入num和current记录当前的数字和字符串

* 遇到数字，就记入`num = 10*num+char-'0‘`;因为数字存在多位
* 遇到字符，就在current字符串中追加
* 遇到【，将当前current和num入栈
* 遇到】，出栈numStack的数字，并重复当前的current

最后返回的current就是需要的字符；



## 代码

```java
public class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int num = 0;
        String current = new String();
        for (int i = 0; i < s.length(); i++) {
            char cur  = s.charAt(i);
            //若为数字时，计数
            if(Character.isDigit(cur)){
                num = 10*num+cur-'0';
            }else if(Character.isLetter(cur)){
                //字符追加
                current+=cur;
            }else if ('['==cur){//[入栈
                numStack.push(num);
                strStack.push(current);
                current = "";
                num=0;
            }else if(']'==cur){//]出栈
                String temp = "";
                int k = numStack.pop();
                for (int j = 0; j < k; j++) {
                    temp += current;
                }
                current = strStack.pop()+temp;
            }
        }
        return current;
    }
}
```

## 复杂度分析

* 时间复杂度：O(n),n为字符串长度，需要遍历数据一次

* 空间复杂度：O(n),n为字符串长度，在于两个栈用来存储数字和字符串

  