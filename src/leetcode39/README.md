# 解题思路

这道题最好的方式就是使用二叉树的遍历方式来做，但是二叉树遍历有好几种：前序遍历，中序遍历，后序遍历，层序遍历。

# 1.深度优先遍历

由于前序遍历，中序遍历，后续遍历都是深度优先搜索遍历，其区别在于遍历节点的先后顺序区分，所以这里统一为一种算法。

## 1.1 算法思想

这里直接以前序遍历为例子进行讲解（其他方式同理）：

* ![前序遍历交换.png](https://upload-images.jianshu.io/upload_images/2326194-2cd2545f119a2692.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240)

## 1.2 代码

前序遍历

```
public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		}
		//记录右节点
		TreeNode treeNode = root.right;
		//将左节点换到右节点
		root.right = invertTree(root.left);
		//将存储的右节点换到左节点
		root.left  = invertTree(treeNode);
		return root;
	}
```

中序遍历

```
public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		}
		//首先遍历左节点
		invertTree(root.left);
		//记录右节点
		TreeNode treeNode = root.right;
		//将左节点换到右节点
		root.right = root.left;
		//将存储的右节点换到左节点
		root.left  = invertTree(treeNode);
		return root;
	}
```

后序遍历

```
public TreeNode invertTree(TreeNode root) {
		//节点为空
		if(root == null) {
			return null;
		}
		//先遍历左右节点
		TreeNode lefTreeNode = invertTree(root.left);
		TreeNode rigTreeNode = invertTree(root.right);
		//在处理中间节点
		root.left = rigTreeNode;
		root.right = lefTreeNode;
		return root;
	}
```

## 1.3 复杂度

* 时间复杂度：O(N),每个节点都会被遍历一次
* 空间复杂度：O(N),使用的空间由递归栈的深度决定，它等于当前节点在二叉树中的高度。在平均情况下，二叉树的高度与节点个数为对数关系，即O(logN)。而在最坏情况下，树形成链状，空间复杂度为 O(N)

# 2.广度优先遍历

与上述相同，却别在于引入了一个队列栈实现功能。

## 2.1 代码

```
public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		}
		LinkedList<TreeNode> linkedList = new LinkedList<TreeNode>();
		linkedList.offer(root);
		while (!linkedList.isEmpty()) {
			TreeNode treeNode = linkedList.poll();
			//交换
			TreeNode tempNode = treeNode.right;
			treeNode.right = treeNode.left;
			treeNode.left = tempNode;
			//判断左右节点是否为空
			if (treeNode.left !=null) {
				linkedList.add(treeNode.left);
			}
			
			if (treeNode.right!=null) {
				linkedList.add(treeNode.right);
			}
		}
		return root;
	}
```

## 2.2 复杂度分析

* 时间复杂度：O(N),每个节点会被放入和去除一个，为O(2N),常数不影响复杂度指数，所以为O(N)
* 空间复杂度：O(N),引入了长度为元素个数的队列栈。