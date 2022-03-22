package leetcode162;

import leetcode15.TreeNode;

/**
 * ClassName: Solution16201<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/22 14:58<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16201 {
    //递归方式
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0,dfs(root.left));
        int right = Math.max(0,dfs(root.right));
        //比较内部和外部的最大值
        max = Math.max(max,root.val+left+right);
        //只选择一个边
        return root.val+Math.max(left,right);
    }

    public static void main(String[] args) {
        TreeNode node1 =new TreeNode(1);
        TreeNode node2 =new TreeNode(2);
        TreeNode node3 =new TreeNode(3);
        node1.left = node2;
        node1.right = node3;
        Solution16201 solution = new Solution16201();
        System.out.println(solution.maxPathSum(node1));
    }
}
