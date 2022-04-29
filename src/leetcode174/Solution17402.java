package leetcode174;

import leetcode37.TreeNode;

/**
 * ClassName: Solution17402<br/>
 * Description: TODO Description. <br/>
 * date: 2022/4/29 15:22<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17402 {

    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        //左右层高
        int left = highNodes(root.left);
        int right = highNodes(root.right);
        if(left==right){
            return (1<<left)+countNodes(root.right);
        }else {
            return countNodes(root.left)+(1<<right);
        }
    }

    //求解节点的高度
    public int highNodes(TreeNode treeNode){
        int hight = 0;
        while (treeNode!=null){
            hight++;
            treeNode = treeNode.left;
        }
        return hight;
    }

    public static void main(String[] args) {
        Solution17402 solution = new Solution17402();
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
