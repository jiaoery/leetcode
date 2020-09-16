package leetcode39;

import leetcode37.TreeNode;

/**
 * @ClassName: Solution3902.java
 * @Description:�����б���
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��16�� ����11:22:51 
 */
public class Solution3902 {
	
	public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return null;
		}
		//���ȱ�����ڵ�
		invertTree(root.left);
		//��¼�ҽڵ�
		TreeNode treeNode = root.right;
		//����ڵ㻻���ҽڵ�
		root.right = root.left;
		//���洢���ҽڵ㻻����ڵ�
		root.left  = invertTree(treeNode);
		return root;
	}

}
