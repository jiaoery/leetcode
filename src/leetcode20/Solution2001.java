package leetcode20;

/**
 * @ClassName: Solution2001.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月17日 上午10:31:21
 */
public class Solution2001 {

	public boolean isBalanced(TreeNode root) {
		 if(root == null) {
			 return true;
		 }
		 //根节点左右平衡+左右节点自平衡
		 boolean isRoot =Math.abs(treeHeigt(root.left)-treeHeigt(root.right))<=1;
		 return isRoot&&isBalanced(root.left)&&isBalanced(root.right);
	    }

	public int treeHeigt(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return Math.max(treeHeigt(root.left), treeHeigt(root.right))+1;
	}

}
