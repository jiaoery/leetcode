package leetcode37;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution37.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月14日 上午11:08:46 
 */
public class Solution3701 {

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> ans = new ArrayList<Integer>();
		fix(root, ans);
		return ans;
    }
	
	/**
	  *    递归遍历方法
	 * @param root 节点
	 * @param ans 记录集合
	 */
	public void fix(TreeNode root,List<Integer> ans) {
		if(root == null) {
			return;
		}
		fix(root.left, ans);
		ans.add(root.val);
		fix(root.right, ans);
	}
	
	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(3);
		treeNode1.right =  treeNode2;
		treeNode2.left = treeNode3;
		List<Integer> ans = new Solution3701().inorderTraversal(treeNode1);
		System.out.println(ans);
	}
}
