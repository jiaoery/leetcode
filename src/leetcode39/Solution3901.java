package leetcode39;

import leetcode37.TreeNode;

/**
 * @ClassName: Solution3901.java
 * @Description:ǰ�����
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��9��16�� ����11:14:34
 */
public class Solution3901 {

	public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		}
		//��¼�ҽڵ�
		TreeNode treeNode = root.right;
		//����ڵ㻻���ҽڵ�
		root.right = invertTree(root.left);
		//���洢���ҽڵ㻻����ڵ�
		root.left  = invertTree(treeNode);
		return root;
	}
}
