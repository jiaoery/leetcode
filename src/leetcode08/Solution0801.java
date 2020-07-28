package leetcode08;

/**
 * @ClassName: Solution0801.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年7月28日 下午3:02:44 
 */
public class Solution0801 {

	public int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
