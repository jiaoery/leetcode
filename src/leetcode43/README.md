# 解题思路

## 1.1深度优先遍历

使用前序，中序，后序遍历完成逐项合并；

## 1.2 代码

```java
public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		//判空
		if(t1==null) {
			return t2;
		}
		if(t2 == null) {
			return t1;
		}
		//处理根节点
		TreeNode treeNode = new TreeNode(t1.val+t2.val);
		TreeNode leftTree = mergeTrees(t1.left, t2.left);
		TreeNode rightTree = mergeTrees(t1.right, t2.right);
		treeNode.left = leftTree;
		treeNode.right = rightTree;
		return treeNode;
	}
```

## 1.3 复杂度分析

* 时间复杂度：O(min(*m*,*n*)),m,n分别为两个二叉树的节点个数
* 空间复杂度：O(min(*m*,*n*)),其中 mm 和 nn 分别是两个二叉树的节点个数。空间复杂度取决于递归调用的层数，递归调用的层数不会超过较小的二叉树的最大高度，最坏情况下，二叉树的高度等于节点数。

## 2.1 广度优先遍历

## 2.2 代码

```java
public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
		TreeNode treeNode = new TreeNode(t1.val+t2.val);
		LinkedList<TreeNode> result = new LinkedList<TreeNode>();
		result.offer(treeNode);
		LinkedList<TreeNode> list1 = new LinkedList<TreeNode>();
		list1.offer(t1);
		LinkedList<TreeNode> list2 = new LinkedList<TreeNode>();
		list2.offer(t2);
		
		while (!list1.isEmpty()&&!list2.isEmpty()) {
			TreeNode node = result.poll();
			TreeNode node1 = list1.poll();
			TreeNode node2 = list2.poll();
			TreeNode left1 = node1.left;
			TreeNode right1 = node1.right;
			TreeNode left2 = node2.left;
			TreeNode right2 = node2.right;
			//左子树处理
			if(left1!=null||left2!=null) {
				if(left1!=null&&left2!=null) {
					TreeNode left = new TreeNode(left1.val + left2.val);
                    node.left = left;
                    result.offer(left);
                    list1.offer(left1);
                    list2.offer(left2);
				}else if(left1!=null) {
					node.left = left1;
				}else {
					node.left = left2;
				}
			}
			//右子树处理
			if(right1!=null||right2!=null) {
				if(right1!=null&&right2!=null) {
					TreeNode right = new TreeNode(right1.val+right2.val);
					node.right = right;
					result.offer(right);
					list1.offer(right1);
					list2.offer(right2);
				}else if(right1!=null){
					node.right = right1;
				}else {
					node.right = right2;
				}
			}
			
		}
		return treeNode;
	}
```

## 2.3 复杂度分析

* 时间复杂度：*O*(min(*m*,*n*))
* 空间复杂度：*O*(min(*m*,*n*))