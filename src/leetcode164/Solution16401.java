package leetcode164;

import leetcode15.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName: Solution16401<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/24 10:56<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16401 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        //使用一个队列来实现层序遍历
        Queue<TreeNode> queue =new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            //判断每一层的层数
            int count = queue.size();
            List<Integer> list = new ArrayList<Integer>();
            while(count>0){
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if(treeNode.left!=null){
                    queue.offer(treeNode.left);
                }
                if(treeNode.right!=null){
                    queue.offer(treeNode.right);
                }
                count--;
            }
            result.add(list);
        }
        return result;
    }

    public static void main(String[] args) {
        Solution16401 solution = new Solution16401();
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);
        root.left = node1;
        root.right = node2;
        node2.left = node3;
        node2.right = node4;
        System.out.println(solution.levelOrder(root));
    }
}
