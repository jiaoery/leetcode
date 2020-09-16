package leetcode39;

import leetcode37.TreeNode;

/**
 * @ClassName: Solution3903.java
 * @Description:后序遍历
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月16日 下午2:17:33 
 */
public class Solution3903 {
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
}
