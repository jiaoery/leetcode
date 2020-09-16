package leetcode39;

import java.util.LinkedList;

import leetcode31.Node;
import leetcode37.TreeNode;

/**
 * @ClassName: Solution3904.java
 * @Description:层级遍历
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月16日 下午2:21:38 
 */
public class Solution3904 {
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
}
