package leetcode43;

import leetcode37.TreeNode;

/**
 * @ClassName: Solution4301.java
 * @Description:深度优先搜索遍历
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月23日 上午11:11:32
 */
public class Solution4301 {

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
}
