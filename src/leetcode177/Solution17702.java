package leetcode177;

import leetcode37.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * ClassName: Solution17702<br/>
 * Description: 迭代
 * date: 2022/5/16 14:41<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17702 {
    public TreeNode inorderSuccessor(TreeNode root, TreeNode p) {
        if(root==null) return null;
        Deque<TreeNode> deque = new ArrayDeque<>();
        TreeNode cur = root;
        while (!deque.isEmpty()||cur!=null){
            while (cur!=null){
                deque.push(cur);
                cur = cur.left;
            }
            TreeNode node = deque.pop();
            if(p.val<node.val){
                return node;
            }
            if(node.right!=null){
                cur = node.right;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Solution17702 solution = new Solution17702();
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(1);
        TreeNode treeNode3 = new TreeNode(3);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        System.out.println("result:"+solution.inorderSuccessor(treeNode1,treeNode2).val);

        TreeNode treeNode4  = new TreeNode(2);
        TreeNode treeNode5  = new TreeNode(3);
        treeNode4.right = treeNode5;
        System.out.println("result:"+solution.inorderSuccessor(treeNode4,treeNode4).val);
    }
}
