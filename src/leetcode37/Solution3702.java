package leetcode37;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName: Solution3702.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��14�� ����2:13:34 
 */
public class Solution3702 {

	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> ans = new ArrayList<Integer>();
		//����һ������ջ������ʹ��ջ��api
		LinkedList<TreeNode> stack = new LinkedList<TreeNode>();
		//��ǰ�ڵ��Ƿ�Ϊ�գ��洢����ջ�Ƿ�Ϊ��
		while (root!=null||!stack.isEmpty()) {
			//����ѭ��ѹ����ڵ����ڵ�
			while (root!=null) {
				stack.push(root);
				root = root.left;	
			}
			//ջ��Ԫ�س�ջ
			root = stack.pop();
			ans.add(root.val);
			//�л�����ǰ�ڵ���ҽڵ�
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
