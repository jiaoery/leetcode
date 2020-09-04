package leetcode31;

/**
 * @ClassName: Solution3101.java
 * @Description:׷����
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��4�� ����3:32:00 
 */
public class Solution3103 {
	
	public static boolean isCycle(Node head) {
		//ָ��1 ÿ���ƶ�һ���ڵ�
		Node p1 = head;
		//ָ��2 ÿ���ƶ������ڵ�
		Node p2 = head;
		while(p2!=null&&p2.next!=null){
			p1 = p1.next;
			p2 = p2.next.next;
			if(p1==p2) {
				return true;
			}
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
