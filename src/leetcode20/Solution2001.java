package leetcode20;

/**
 * @ClassName: Solution2001.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��17�� ����10:31:21
 */
public class Solution2001 {

	public boolean isBalanced(TreeNode root) {
		 if(root == null) {
			 return true;
		 }
		 //���ڵ�����ƽ��+���ҽڵ���ƽ��
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
