package leetcode39;

import java.util.LinkedList;

import leetcode31.Node;
import leetcode37.TreeNode;

/**
 * @ClassName: Solution3904.java
 * @Description:�㼶����
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��16�� ����2:21:38 
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
			//����
			TreeNode tempNode = treeNode.right;
			treeNode.right = treeNode.left;
			treeNode.left = tempNode;
			//�ж����ҽڵ��Ƿ�Ϊ��
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
