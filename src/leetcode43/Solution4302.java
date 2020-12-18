package leetcode43;

import java.util.LinkedList;
import leetcode37.TreeNode;

/**
 * @ClassName: Solution4302.java
 * @Description:广度优先搜索遍历
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年9月23日 上午11:22:42
 */
public class Solution4302 {
	public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if (t1 == null) {
			return t2;
		}
		if (t2 == null) {
			return t1;
		}
		TreeNode treeNode = new TreeNode(t1.val+t2.val);
		LinkedList<TreeNode> result = new LinkedList<TreeNode>();
		result.offer(treeNode);
		LinkedList<TreeNode> list1 = new LinkedList<TreeNode>();
		list1.offer(t1);
		LinkedList<TreeNode> list2 = new LinkedList<TreeNode>();
		list2.offer(t2);
		
		while (!list1.isEmpty()&&!list2.isEmpty()) {
			TreeNode node = result.poll();
			TreeNode node1 = list1.poll();
			TreeNode node2 = list2.poll();
			TreeNode left1 = node1.left;
			TreeNode right1 = node1.right;
			TreeNode left2 = node2.left;
			TreeNode right2 = node2.right;
			//左子树处理
			if(left1!=null||left2!=null) {
				if(left1!=null&&left2!=null) {
					TreeNode left = new TreeNode(left1.val + left2.val);
                    node.left = left;
                    result.offer(left);
                    list1.offer(left1);
                    list2.offer(left2);
				}else if(left1!=null) {
					node.left = left1;
				}else {
					node.left = left2;
				}
			}
			//右子树处理
			if(right1!=null||right2!=null) {
				if(right1!=null&&right2!=null) {
					TreeNode right = new TreeNode(right1.val+right2.val);
					node.right = right;
					result.offer(right);
					list1.offer(right1);
					list2.offer(right2);
				}else if(right1!=null){
					node.right = right1;
				}else {
					node.right = right2;
				}
			}
			
		}
		return treeNode;
	}
	
	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(3);
		TreeNode treeNode3 = new TreeNode(2);
		TreeNode treeNode4 = new TreeNode(5);
		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;
		treeNode2.left = treeNode4;
		
		TreeNode treeNode5 = new TreeNode(2);
		TreeNode treeNode6 = new TreeNode(1);
		TreeNode treeNode7 = new TreeNode(3);
		TreeNode treeNode8 = new TreeNode(4);
		TreeNode treeNode9 = new TreeNode(7);
		treeNode5.left = treeNode6;
		treeNode5.right = treeNode7;
		treeNode6.right = treeNode8;
		treeNode7.right = treeNode9;
		
		new Solution4302().mergeTrees(treeNode1, treeNode5);
	}
	
	

}
