package leetcode25;

/**
 * @ClassName: Solution2501.java
 * @Description:深度优先搜索
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月21日 上午11:11:19
 */
public class Solution2501 {
	public int minDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		// 判断叶子节点
		if (root.left == null && root.right == null) {
			return 1;
		}
		int min_depth = Integer.MAX_VALUE;
		//检测左节点
		if (root.left != null) {
			min_depth = Math.min(minDepth(root.left), min_depth);
		}
		//检测右节点
		if (root.right != null) {
			min_depth = Math.min(minDepth(root.right), min_depth);
		}
		//具有根节点
		return min_depth+1;

	}

}
