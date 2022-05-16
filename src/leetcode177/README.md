# 解题思路

由于目标是二叉搜索树，所以可以借用二叉搜索树的特性来解决

**二叉搜索树：若它的左子树不空，则左子树上所有结点的值均小于它的 根结点 的值； 若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值；**

那么只要找到第一个比目标结点值大的结点即可

那么可以使用好几种方式实现

## 1.递归

```java
public class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root==null) return null;
        //目标值大于根节点，那么结果一定在右子数里
        if(p.val>=root.val){
            return inorderSuccessor(root.right,p);
        }
        //其他结果下，要么为root结点，要么为左子数中
        TreeNode node = inorderSuccessor(root.left,p);
        return node==null?root:node;
    }
}
```



## 2.迭代

```java
public class Solution {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root==null) return null;
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode cur = root;
        while (!deque.isEmpty()||cur!=null){
            while (cur!=null){
                deque.push(cur);
                cur = cur.left;
            }
            TreeNode node = deque.pop();
            if(p.val<node.val){
                return node;
            }
            if(node.right!=null){
                cur = node.right;
            }
        }
        return null;
    }
}
```

