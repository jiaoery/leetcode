package leetcode08;

/**
 * @ClassName: Solution0801.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��7��28�� ����3:02:44 
 */
public class Solution0801 {

	public int maxDepth(TreeNode root) {
        return root==null?0:Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
