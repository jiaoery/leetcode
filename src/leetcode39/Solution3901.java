package leetcode39;

import leetcode37.TreeNode;

/**
 * @ClassName: Solution3901.java
 * @Description:前序遍历
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月16日 上午11:14:34
 */
public class Solution3901 {

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
}
