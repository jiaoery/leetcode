# 解题思路

这道题是真的难，尤其各种测试用例简直骚的一匹，先讲讲自己的整体思路：

* 数据结构采取栈结构（TAG需要入栈并出栈）

* 特殊情况：如开头结尾不符合规范等情况
* 判断字符是否为'<',若符合，存在三种情况：
  * 取‘<’后的下一个字符判读，存在情况‘/’，‘!’和其他字符
  * 若为其他字符，判断为TAG标签开始位置，取字符一直到'>'为止，判断是否所有字符为大写，长度是否为`[1,9]`,若都符合，则得到TAG 并入栈
  * 若为’/',判断为TAG标签结束，取字符一直到'>'为止，判断缓存TAG的栈是否为取出值，若相同，就出栈
  * 若为'!',判断为<![CDATA[CDATA_CONTENT]]>，处理相关流程。

## 1.1代码

```java
public class Solution {
    public boolean isValid(String code){
        //处理不是< >开头结尾的情况
        if(code.charAt(0)!='<'||code.charAt(code.length()-1)!='>'){
            return false;
        }
        Stack<String> stack = new Stack<>();
        int index = 0,length = code.length();
        while (index<length){
            if(code.charAt(index)=='<'){
                char next  = code.charAt(index+1);
                //筛选出 CDATA[
                if (next == '!'){
                    if(stack.size()==0){
                         return false;
                    }
                    index+=2;
                    if(index+7<=length && code.startsWith("[CDATA[", index)){
                        index+=7;
                        // 找对应的']]>'
                        while(index+3<=length && !code.startsWith("]]>", index)){
                            index++;
                        }
                        // 没找到
                        if(index>=length) return false;
                        index+=3;
                    }else {
                        return false;
                    }

                }else if (next == '/'){//结尾
                    //若本身无前置tag，不合法
                    if(stack.isEmpty()){
                        return false;
                    }
                    index+=2;
                    int tagSize = 0;
                    while (index<length&&code.charAt(index+tagSize)!='>'){
                        tagSize++;
                    }
                    if (index+tagSize>length||code.charAt(index+tagSize)!='>'){
                        return false;
                    }
                    String tag = code.substring(index,index+tagSize);
                    if(!stack.peek().equals(tag)){
                        return false;
                    }
                    stack.pop();
                    index += tagSize+1;
                }else{//开头<TAG_NAME >
                    //特殊处理 "<A></A><B></B>"
                    if(index!=0 && stack.size()==0) return false;
                    index++;
                    int tagSize = 0;
                    while (index<length&&Character.isUpperCase(code.charAt(index+tagSize))){
                        tagSize++;
                    }
                    // tag不合法
                    if(code.charAt(index+tagSize)!='>'||tagSize>9||tagSize<1) return false;
                    String tag = code.substring(index,index+tagSize);
                    stack.push(tag);
                    //+1 为了跳过 >
                    index+=tagSize+1;
                }
            }else if(stack.isEmpty()){//特殊处理<A></A>>
                return false;
            }
            else {
                index++;
            }
        }
        return stack.isEmpty();
    }
}
```

## 1.2 复杂度分析

* 时间复杂度：O(N),需要遍历一次输入字符
* 空间复杂度：O(N),保存TAG的栈的空间