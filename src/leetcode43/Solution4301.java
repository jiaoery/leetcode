package leetcode43;

import leetcode37.TreeNode;

/**
 * @ClassName: Solution4301.java
 * @Description:���������������
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��9��23�� ����11:11:32
 */
public class Solution4301 {

	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		//�п�
		if(t1==null) {
			return t2;
		}
		if(t2 == null) {
			return t1;
		}
		//������ڵ�
		TreeNode treeNode = new TreeNode(t1.val+t2.val);
		TreeNode leftTree = mergeTrees(t1.left, t2.left);
		TreeNode rightTree = mergeTrees(t1.right, t2.right);
		treeNode.left = leftTree;
		treeNode.right = rightTree;
		return treeNode;
	}
}
