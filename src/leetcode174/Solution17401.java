package leetcode174;

import leetcode37.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName: Solution17401<br/>
 * Description: TODO Description. <br/>
 * date: 2022/4/29 14:52<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17401 {
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        return 1+countNodes(root.left)+countNodes(root.right);
    }

    public static void main(String[] args) {
        Solution17401 solution = new Solution17401();
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        System.out.println("count:"+solution.countNodes(treeNode1));
    }
}
