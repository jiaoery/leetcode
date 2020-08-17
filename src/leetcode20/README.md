# 解题思路

## 前言

根据本次需求，可以名且需求，高度平衡二叉树具备以下两个特点：

* 当前节点的左右子树高度差不为1
* 当前节点左右子树均为高度平衡二叉树

而符合这个需求的，在算法种就是`递归算法`

## 1.1 递归算法求解

自定义函数treeHeigt求解当前节点p的高度:

![image.png](https://upload-images.jianshu.io/upload_images/2326194-a2ce9098ba206944.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

有了计算节点高度的函数，即可判断二叉树是否平衡。具体做法类似于二叉树的前序遍历，即对于当前遍历到的节点，首先计算左右子树的高度，如果左右子树的高度差是否不超过 11，再分别递归地遍历左右子节点，并判断左子树和右子树是否平衡。这是一个自顶向下的递归的过程。



## 1.2 代码

```
public boolean isBalanced(TreeNode root) {
		 if(root == null) {
			 return true;
		 }
		 //根节点左右平衡+左右节点自平衡
		 boolean isRoot =Math.abs(treeHeigt(root.left)-treeHeigt(root.right))<=1;
		 return isRoot&&isBalanced(root.left)&&isBalanced(root.right);
	    }

	public int treeHeigt(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(treeHeigt(root.left), treeHeigt(root.right))+1;
	}
```

## 1.3 复杂度分析

* 时间复杂度：`O(n ^ 2 )`，其中`n` 是二叉树中的节点个数。
  最坏情况下，二叉树是满二叉树，需要遍历二叉树中的所有节点，时间复杂度是 `O(n)`。
  对于节点` p`，如果它的高度是`d`，则`treeHeigt(p)`最多会被调用 `d `次（即遍历到它的每一个祖先节点时）。对于平均的情况，一棵树的高度 `h` 满足`O(h)=O(logn)`，因为 `d ≤h`，所以总时间复杂度为 `O(nlogn)`。对于最坏的情况，二叉树形成链式结构，高度为`O(n)`，此时总时间复杂度为 `O(n^2)`

* 空间复杂度：`O(n)`，其中 `n` 是二叉树中的节点个数。空间复杂度主要取决于递归调用的层数，递归调用的层数不会超过 `n`。

