package leetcode170;

import java.util.List;

/**
 * ClassName: Node<br/>
 * Description: TODO Description. <br/>
 * date: 2022/4/8 10:09<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
