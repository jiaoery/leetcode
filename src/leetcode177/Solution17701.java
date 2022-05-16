package leetcode177;

import leetcode37.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName: Solution17701<br/>
 * Description: 递归
 * date: 2022/5/16 10:23<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17701 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root==null) return null;
        //目标值大于根节点，那么结果一定在右子数里
        if(p.val>=root.val){
            return inorderSuccessor(root.right,p);
        }
        //其他结果下，要么为root结点，要么为左子数中
        TreeNode node = inorderSuccessor(root.left,p);
        return node==null?root:node;
    }

    public static void main(String[] args) {
        Solution17701 solution = new Solution17701();
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        System.out.println("result:"+solution.inorderSuccessor(treeNode1,treeNode2).val);
    }
}
