# 解题思路

该题目的解题思路可以从树结构的两个方向入手， 1.从树的结构入手；2.从树的搜索算法入手

所以有两种不同的方法求解。

## 1.递归

### 1.1 思路与算法

如果我们知道了左子树和右子树的最大深度l 和 *r*，那么该二叉树的最大深度即为

>  max(*l*,*r*)+1 

然后左右的子树，又可以继续按照这个规则运算下去，那么到叶子节点（无子树节点），左右的子树为0；

然后反向递归就可以得到当前树的最大深度h;

![解析过程](https://assets.leetcode-cn.com/solution-static/104/10.png)

### 1.2 代码

```
public int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
```

### 1.3 复杂度分析

时间复杂度:   `O(n)`，其中 `n`为二叉树节点的个数。每个节点在递归中只被遍历一次。
空间复杂度：`O(height)`，其中`height` 表示二叉树的高度。递归函数需要栈空间，而栈空间取决于递归的深度，因此空间复杂度等价于二叉树的高度。

## 2.广度优先算法

### 2.1 思路和算法

我们也可以用「广度优先搜索」的方法来解决这道题目，但我们需要对其进行一些修改，此时我们广度优先搜索的队列里存放的是「当前层的所有节点」。每次拓展下一层的时候，不同于广度优先搜索的每次只从队列里拿出一个节点，我们需要将队列里的所有节点都拿出来进行拓展，这样能保证每次拓展完的时候队列里存放的是当前层的所有节点，即我们是一层一层地进行拓展，最后我们用一个变量 `ans` 来维护拓展的次数，该二叉树的最大深度即为 `ans`。

### 2.2 代码

```
public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);
        int ans = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            ans++;
        }
        return ans;
    }
```

### 2.3 复杂度分析

时间复杂度：`O(n)`，其中 `n` 为二叉树的节点个数。与方法一同样的分析，每个节点只会被访问一次。
空间复杂度：此方法空间的消耗取决于队列存储的元素数量，其在最坏情况下会达到 `O(n)`。