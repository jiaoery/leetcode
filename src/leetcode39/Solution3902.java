package leetcode39;

import leetcode37.TreeNode;

/**
 * @ClassName: Solution3902.java
 * @Description:中序列遍历
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月16日 上午11:22:51 
 */
public class Solution3902 {
	
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

}
