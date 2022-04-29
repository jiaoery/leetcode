# 解题思路

## 1.递归实现

对于没有约束的二叉树而言，直接递归左右子树的节点个数和并加上本身节点个数，并且规避空节点，可以很简单地实现

### 1.1 代码

```java
public class Solution {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }
}
```



## 2.递归+完全二叉树

虽然方法1实现了核心的功能，但是没有利用题目中完全二叉树的特性，那么如何利用这个特性优化递归的特性呢？

首先说明几个概念：

* **满二叉树**
  * 定义：一个二叉树，如果每一个层的结点数都达到最大值，则这个二叉树就是满二叉树。
  * 如果一个二叉树的层数为K（从1开始的），每一层的节点个数为2^{k-1}−1，且结点总数是(2^k）-1。

![image.png](https://pic.leetcode-cn.com/1606204904-aIhtfR-image.png)

* **完全二叉树**
  * 定义：它是一棵空树或者它的叶子节点只出在最后两层，若最后一层不满则叶子节点只在最左侧。

我们观察会发现完全二叉树有这么几个可以被利用的特性：

1.如果根节点的左子树深度等于右子树深度，则说明左子树为满二叉树。（如果左边没满，不会延伸到右边去）

![image.png](https://pic.leetcode-cn.com/1606190755-eNVSjv-image.png)

```java
//(1<<left_level)注意括号，子树节点数目为(1<<left_level)-1，再+1（root节点）
if(left_level == right_level){
    return (1<<left_level) + count(root->right);
} 
```

2. 如果根节点的左子树深度大于右子树深度，则说明右子树为满二叉树

(左子树没有满)![image.png](https://pic.leetcode-cn.com/1606190769-dVAKSv-image.png)

```java
if(left_level != right_level) {
    return count(root->left) + (1<<right_level);
}
```



### 2.1 代码

```java
public class Solution {

    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        //左右层高
        int left = highNodes(root.left);
        int right = highNodes(root.right);
        if(left==right){
            return (1<<left)+countNodes(root.right);
        }else {
            return countNodes(root.left)+(1<<right);
        }
    }

    //求解节点的高度
    public int highNodes(TreeNode treeNode){
        int hight = 0;
        while (treeNode!=null){
            hight++;
            treeNode = treeNode.left;
        }
        return hight;
    }
}
```

