package leetcode15;

/**
 * @ClassName: TreeNode.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月7日 上午10:24:21
 */
public class TreeNode {
	public int val;
	// 左子树
	public TreeNode left;
	// 右子树
	public TreeNode right;

	public TreeNode() {
	}

	public TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
	}
}
