# 解题思路

## 1.1 递归

二叉树中序遍历，最适合是使用递归算法思路比较简单：

* 首先遍历左子树
* 再显示中间根节点值
* 最后遍历右子树
* 1,3步循环到叶子节点

## 1.2 代码

```
public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> ans = new ArrayList<Integer>();
		fix(root, ans);
		return ans;
    }
	
	/**
	  *    递归遍历方法
	 * @param root 节点
	 * @param ans 记录集合
	 */
	public void fix(TreeNode root,List<Integer> ans) {
		if(root == null) {
			return;
		}
		fix(root.left, ans);
		ans.add(root.val);
		fix(root.right, ans);
	}
```

## 复杂度分析

时间复杂度：`O(n)`,`n`为二叉树的节点个数，二叉树中每个节点都只会被访问一次

空间复杂度：`O(n)`,空间复杂度取决于递归的栈深度，而栈深度在二叉树为一条链的情况下会达到 `O(n)` 的级别

## 2.1 迭代

迭代的逻辑在这里在于需要引入一个栈。通过出栈和入栈的方式来实现中序遍历（其他遍历其实也都一样）

![img](https://assets.leetcode-cn.com/solution-static/94/1.png)
![img](https://assets.leetcode-cn.com/solution-static/94/2.png)
![img](https://assets.leetcode-cn.com/solution-static/94/3.png)
![img](https://assets.leetcode-cn.com/solution-static/94/4.png)
![img](https://assets.leetcode-cn.com/solution-static/94/5.png)
![img](https://assets.leetcode-cn.com/solution-static/94/6.png)
![img](https://assets.leetcode-cn.com/solution-static/94/7.png)
![img](https://assets.leetcode-cn.com/solution-static/94/8.png)
![img](https://assets.leetcode-cn.com/solution-static/94/9.png)
![img](https://assets.leetcode-cn.com/solution-static/94/10.png)
![img](https://assets.leetcode-cn.com/solution-static/94/11.png)
![img](https://assets.leetcode-cn.com/solution-static/94/12.png)
![img](https://assets.leetcode-cn.com/solution-static/94/13.png)
![img](https://assets.leetcode-cn.com/solution-static/94/14.png)

## 2.2 代码

```
List<Integer> ans = new ArrayList<Integer>();
		//引入一个队列栈，这里使用栈的api
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		//当前节点是否为空，存储队列栈是否为空
		while (root!=null||!stack.isEmpty()) {
			//迭代循环压入根节点和左节点
			while (root!=null) {
				stack.push(root);
				root = root.left;	
			}
			//栈顶元素出栈
			root = stack.pop();
			ans.add(root.val);
			//切换到当前节点的右节点
			root = root.right;
			
		}
		return ans;
```

## 2.3 复杂度分析

* 时间复杂度：`O(n)`,n为二叉树的节点数，这里需要入栈，出栈两次，所以复杂度应该为`O(2n)`,由于常数不影响复杂度，所以为`O(n)`
* 空间复杂度： `O(n)`。空间复杂度取决于栈深度，而栈深度在二叉树为一条链的情况下会达到 `O(n)` 的级别。

