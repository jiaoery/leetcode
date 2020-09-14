package leetcode37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: Solution3702.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月14日 下午2:13:34 
 */
public class Solution3702 {

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> ans = new ArrayList<Integer>();
		//引入一个队列栈，这里使用栈的api
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		//当前节点是否为空，存储队列栈是否为空
		while (root!=null||!stack.isEmpty()) {
			//迭代循环压入根节点和左节点
			while (root!=null) {
				stack.push(root);
				root = root.left;	
			}
			//栈顶元素出栈
			root = stack.pop();
			ans.add(root.val);
			//切换到当前节点的右节点
			root = root.right;
			
		}
		return ans;
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
