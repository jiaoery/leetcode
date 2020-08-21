# 解题思路

## 前言

这道题本身涉及二叉树的遍历，那么在其中我们可以使用的方法就有两种：**深度优先搜索遍历**和**广度优先搜索遍历**

## 1.1 深度优先搜索遍历

首先判断根节点是否为空，和左右子节点是否为空。

对于每一个非叶子节点，我们只需要分别计算其左右子树的最小叶子节点深度。这样就将一个大问题转化为了小问题，可以递归地解决该问题。

## 1.2 代码

```
public int minDepth(TreeNode root) {
		//检测根节点
		if (root == null) {
			return 0;
		}
		// 判断叶子节点
		if (root.left == null && root.right == null) {
			return 1;
		}
		int min_depth = Integer.MAX_VALUE;
		//检测左节点
		if (root.left != null) {
			min_depth = Math.min(minDepth(root.left), min_depth);
		}
		//检测右节点
		if (root.right != null) {
			min_depth = Math.min(minDepth(root.right), min_depth);
		}
		//具有根节点
		return min_depth+1;

	}
```

## 1.3 复杂度分析

时间复杂度：`O(N)`，其中 `N`是树的节点数。对每个节点访问一次。

空间复杂度：`O(H)`，其中 `H` 是树的高度。空间复杂度主要取决于递归时栈空间的开销，最坏情况下，树呈现链状，空间复杂度为 `O(N)`。平均情况下树的高度与节点数的对数正相关，空间复杂度为 `O(logN)`。

## 2.1 广度优先搜索遍历

当我们找到一个叶子节点时，直接返回这个叶子节点的深度。广度优先搜索的性质保证了最先搜索到的叶子节点的深度一定最小。

## 2.1 代码

```
   //引入结构
   class QueueNode {
		TreeNode node;
		int depth;

		public QueueNode(TreeNode node, int depth) {
			this.node = node;
			this.depth = depth;
		}
	}

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		// 提供一个队列
		Queue<QueueNode> queue = new LinkedList<QueueNode>();
		queue.offer(new QueueNode(root, 1));
		while (!queue.isEmpty()) {
			QueueNode queueNode = queue.poll();
			TreeNode treeNode = queueNode.node;
			int min_depth = queueNode.depth;		
			if (treeNode.left == null && treeNode.right == null) {
				return min_depth;
			}
			if (treeNode.left != null) {
				queue.offer(new QueueNode(treeNode.left,min_depth+1));
			}
			if (treeNode.right != null) {
				queue.offer(new QueueNode(treeNode.right,min_depth+1));
			}
		}
		return 0;
	}
```



## 2.3 复杂度分析

时间复杂度：`O(N)`，其中 `N `是树的节点数。对每个节点访问一次。

空间复杂度：`O(N)`，其中 `N` 是树的节点数。空间复杂度主要取决于队列的开销，队列中的元素个数不会超过树的节点数。

