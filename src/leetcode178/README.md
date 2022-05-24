# 解题思路

## 1.迭代

这道题就是使用二叉树的遍历，判断父节点和子节点数值是否一样，这样可以简单的使用二叉树遍历的方式来实现，首先使用迭代的方式实现

### 1.1代码

```java
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            TreeNode node = deque.poll();
            if(node.left!=null){
                if(node.left.val!=node.val){
                    return false;
                }else {
                    deque.offer(node.left);
                }
            }

            if(node.right!=null){
                if(node.right.val!=node.val){
                    return false;
                }else {
                    deque.offer(node.right);
                }
            }
        }
        return true;
    }
}
```

### 1.2 复杂度分析

* 时间复杂度：O(N)需要所有元素遍历一次
* 空间复杂度：O(N)迭代中需要使用队列

## 2.递归

也可以使用递归的方式来实现，但是递归需要遍历完所有节点才可以，时间消耗上会高一些

### 2.1 代码

```java
public class Solution {
    public boolean isUnivalTree(TreeNode root) {
       if(root==null) return true;
       if(root.left!=null&&root.left.val!= root.val) return false;
       if (root.right!=null&&root.right.val!= root.val) return false;
       return isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
}
```



递归复杂度就不好分析了



