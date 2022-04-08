package leetcode158;

/**
 * ClassName: Node<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/9 10:54<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Node {
    public int val;
    public Node next;
    public Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
