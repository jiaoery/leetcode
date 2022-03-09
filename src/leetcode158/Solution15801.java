package leetcode158;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * ClassName: Solution15801<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/7 16:52<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution15801 {

    public Node copyRandomList(Node head) {
        HashMap<Node,Node> hashMap = new HashMap<>();
        Node temp = head;
        Node pre = new Node(-1);
        //sentry 为哨兵结点
        Node sentry = pre;
        //第一次构建next的结构
        while(temp !=null){
            Node newNode = new Node(temp.val);
            pre.next = newNode;
            //记录结点对应位置
            hashMap.put(temp,newNode);
            pre = pre.next;
            temp = temp.next;
        }
        temp = head;
        pre = sentry.next;
        while (temp!=null){
            pre.random = hashMap.getOrDefault(temp.random,null);
            temp = temp.next;
            pre = pre.next;
        }
        return sentry.next;
    }

}
