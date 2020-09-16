package leetcode39;

import leetcode37.TreeNode;

/**
 * @ClassName: Solution3903.java
 * @Description:�������
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��16�� ����2:17:33 
 */
public class Solution3903 {
	public TreeNode invertTree(TreeNode root) {
		//�ڵ�Ϊ��
		if(root == null) {
			return null;
		}
		//�ȱ������ҽڵ�
		TreeNode lefTreeNode = invertTree(root.left);
		TreeNode rigTreeNode = invertTree(root.right);
		//�ڴ����м�ڵ�
		root.left = rigTreeNode;
		root.right = lefTreeNode;
		return root;
	}
}
