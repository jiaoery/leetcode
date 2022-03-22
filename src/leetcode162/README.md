# 解替思路

本题也是属于二叉树遍历的一种变种题，这里最好的方式是使用后序遍历的方式，这里采取两种方式来解决：

* 递归
* 迭代

而二叉树可能的情况如下：

* 如果树为None，返回0

* 如果左右子树都为None，返回0和root.val的最大值（存在root为负数的情况）

* 如果两侧都有子树，那就遍历两侧子树，返回值l,r为两颗子树的最大值，更新ans

* 因为只能带有一条边，所以返回max(0, l + root.val, r + root.val)
* 还有种可能就是子数的总和大于整体的总合，记结果为max，则max = max(max,root.val+l+r);

## 1.递归

![788032dadc057891f7739c30a0ab895.jpg](https://pic.leetcode-cn.com/1629649134-pPlPlZ-788032dadc057891f7739c30a0ab895.jpg)

### 1.1 代码

```java
public class Solution16201 {
    //递归方式
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0,dfs(root.left));
        int right = Math.max(0,dfs(root.right));
        //比较内部和外部的最大值
        max = Math.max(max,root.val+left+right);
        //只选择一个边
        return root.val+Math.max(left,right);
    }
}
```