package leetcode178;

import leetcode37.TreeNode;

import java.io.Serializable;

/**
 * ClassName: Solution17802<br/>
 * Description: TODO Description. <br/>
 * date: 2022/5/24 10:32<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17802 implements Serializable {
    private static final long serialVersionUID = 1242918208824882683L;

    public boolean isUnivalTree(TreeNode root) {
       if(root==null) return true;
       if(root.left!=null&&root.left.val!= root.val) return false;
       if (root.right!=null&&root.right.val!= root.val) return false;
       return isUnivalTree(root.left)&&isUnivalTree(root.right);
    }
    public static void main(String[] args) {
//        TreeNode treeNode1 = new TreeNode(1);
//        TreeNode treeNode2 = new TreeNode(1);
//        TreeNode treeNode3 = new TreeNode(1);
//        TreeNode treeNode4 = new TreeNode(1);
//        TreeNode treeNode5 = new TreeNode(1);
//        treeNode1.left = treeNode2;
//        treeNode1.right = treeNode3;
//        treeNode2.left = treeNode4;
//        treeNode2.right = treeNode5;
//        Solution17802 solution = new Solution17802();
//        System.out.println(solution.isUnivalTree(treeNode1));
    }

}
