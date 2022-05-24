package leetcode178;

import leetcode37.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName: Solution17801<br/>
 * Description: 迭代
 * date: 2022/5/24 10:17<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17801 {
    public boolean isUnivalTree(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        while(!deque.isEmpty()){
            TreeNode node = deque.poll();
            if(node.left!=null){
                if(node.left.val!=node.val){
                    return false;
                }else {
                    deque.offer(node.left);
                }
            }

            if(node.right!=null){
                if(node.right.val!=node.val){
                    return false;
                }else {
                    deque.offer(node.right);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(1);
        TreeNode treeNode4 = new TreeNode(1);
        TreeNode treeNode5 = new TreeNode(1);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        Solution17801 solution = new Solution17801();
        System.out.println(solution.isUnivalTree(treeNode1));
    }
}
