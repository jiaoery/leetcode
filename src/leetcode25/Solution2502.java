package leetcode25;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @ClassName: Solution2502.java
 * @Description:���������������
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��21�� ����11:20:37
 */
public class Solution2502 {

	class QueueNode {
		TreeNode node;
		int depth;

		public QueueNode(TreeNode node, int depth) {
			this.node = node;
			this.depth = depth;
		}
	}

	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		// �ṩһ������
		Queue<QueueNode> queue = new LinkedList<QueueNode>();
		queue.offer(new QueueNode(root, 1));
		while (!queue.isEmpty()) {
			QueueNode queueNode = queue.poll();
			TreeNode treeNode = queueNode.node;
			int min_depth = queueNode.depth;		
			if (treeNode.left == null && treeNode.right == null) {
				return min_depth;
			}
			if (treeNode.left != null) {
				queue.offer(new QueueNode(treeNode.left,min_depth+1));
			}
			if (treeNode.right != null) {
				queue.offer(new QueueNode(treeNode.right,min_depth+1));
			}
		}
		return 0;
	}
}
