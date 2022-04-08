package leetcode170;

import java.util.*;

/**
 * ClassName: Solution17001<br/>
 * Description: TODO Description. <br/>
 * date: 2022/4/1 11:49<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17001 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> result  = new ArrayList<>();
        Deque<Node> deque = new ArrayDeque<>();
        deque.offer(root);
        //是否已经完成遍历
        while(deque.size()!=0){
            List<Integer> list = new ArrayList<>();
            //判断每层有多少结点
            int count = deque.size();
            while (count>0){
                Node node = deque.poll();
                list.add(node.val);
                //将children结点中的点加入队列中
                if(node.children!=null){
                    for (Node child:node.children) {
                        deque.offer(child);
                    }
                }
                count--;
            }
            result.add(list);

        }
        return result;
    }

    public static void main(String[] args) {
        Solution17001 solution = new Solution17001();
        Node node1 =new Node(1);
        Node node2 =new Node(3);
        Node node3 =new Node(2);
        Node node4 =new Node(4);
        Node node5 =new Node(5);
        Node node6 =new Node(6);
        List<Node> children1 = new ArrayList<>();
        children1.add(node2);
        children1.add(node3);
        children1.add(node4);
        node1.children = children1;
        List<Node> children2 = new ArrayList<>();
        children2.add(node5);
        children2.add(node6);
        node2.children = children2;

        System.out.println(solution.levelOrder(node1));
    }

}


