package leetcode25;

/**
 * @ClassName: TreeNode.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��7�� ����10:24:21
 */
public class TreeNode {
	int val;
	// ������
	TreeNode left;
	// ������
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
	}
}
