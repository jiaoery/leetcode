package leetcode31;

import java.util.HashMap;

/**
 * @ClassName: Solution3102.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月4日 下午5:58:26 
 */
public class Solution3102 {
	public static boolean isCycle(Node head) {
		HashMap<Node, Integer> hashMap =new  HashMap<Node, Integer>();
		Node p1 = head;
		while (p1!=null) {
			if(hashMap.containsKey(p1)) {
				return true;
			}else {
				hashMap.put(p1,1);
			}
			p1 = p1.next;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Node node1 = new Node(5);
		Node node2 = new Node(3);
		Node node3 = new Node(7);
		Node node4 = new Node(2);
		Node node5 = new Node(6);
		Node node6 = new Node(8);
		Node node7 = new Node(1);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node4;
		
		System.out.println("Iscycle:"+isCycle(node1));
		
	}
}
