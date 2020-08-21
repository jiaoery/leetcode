package leetcode25;

/**
 * @ClassName: Solution2501.java
 * @Description:�����������
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��21�� ����11:11:19
 */
public class Solution2501 {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		// �ж�Ҷ�ӽڵ�
		if (root.left == null && root.right == null) {
			return 1;
		}
		int min_depth = Integer.MAX_VALUE;
		//�����ڵ�
		if (root.left != null) {
			min_depth = Math.min(minDepth(root.left), min_depth);
		}
		//����ҽڵ�
		if (root.right != null) {
			min_depth = Math.min(minDepth(root.right), min_depth);
		}
		//���и��ڵ�
		return min_depth+1;

	}

}
