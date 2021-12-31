# 解题思路

本题的解题思路来自[郭郭](https://leetcode-cn.com/problems/longest-absolute-file-path/solution/java-shi-jian-chao-yue-97-zhan-de-ying-y-3qms/)

具体的思路如下：

* `\n `是用来做文件切割的，使用`String`中的`splite`函数
* 用`level`来标记文件的层级，如：第一层为顶部文件，第二层为`\t`文件名，第三层文件为`\t\t`文件名；也就是说通过判断`\t`在文件`path`路径下的前缀数就可以判断`level`
* 不同文件存在层级关系，上下层的关系一定是`level`相差1；
* 如何判断文件还是文件夹，判断是否有`.`在path中；
* 如果当前stack为empty，判断为文件夹就压栈，文件就计算路径长度，为空时判断上下级层数关系，不是上下级就出栈，是上下级，若为文件就计算路径长度，文件夹就压栈
* 最后返回最长路径长度

## 1.1 代码

```java
public class Solution{
    class Node{
        public Node(int level, int sum) {
            this.level = level;
            this.sum = sum;
        }

        public int level;
        public int sum;
    }
    public int lengthLongestPath(String input) {
        String[] path = input.split("\n");
        Stack<Node> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < path.length; ) {
            int level = countLevel(path[i]);
            if(stack.isEmpty()){
                if(path[i].indexOf('.')!=-1){
                    result = Math.max(result,path[i].length());
                }else {
                    stack.push(new Node(level,path[i].length()-level));
                }
                i++;
            }else {
                //对比是否为上下级关系
                Node peek = stack.peek();
                if(peek.level+1==level){
                    Node newNode = new Node(level, path[i].length() + peek.sum - level + 1);
                    if(path[i].indexOf(".")!=-1){
                        result = Math.max(result,newNode.sum);
                    }else {
                        stack.push(newNode);
                    }
                    i++;
                }else {
                    stack.pop();
                }
            }
        }
        return result;
    }

    /**
     * 计算输入路径的level等级
     * @param path
     * @return
     */
    public int countLevel(String path){
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for (int i=0;;i++){
            builder.append("\t");
            if(path.contains(builder)){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
}
```

## 1.2 复杂度分析

* 时间复杂度：O(N),N为切割后的文件数组大小
* 空间复杂度：O(N),N为切割后的文件数组大小,栈占据的空间