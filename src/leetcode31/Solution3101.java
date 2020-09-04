package leetcode31;

/**
 * @ClassName: Solution3101.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��4�� ����4:05:23 
 */
public class Solution3101 {

	public static boolean isCycle(Node head) {
		int count = 0;
		Node p1 = head;
		Node p2 = head;
		while (p1!=null) {
			//�ƶ�һ���ڵ�
			p1 = p1 .next;
			count++;
			int count1 = count;
			//�ڲ�ѭ�����ж�֮ǰ�Ƿ���ֹ��ýڵ�
			while (count1>0) {
				if(p1 == p2) {
					return true;
				}
				p2 = p2.next;
				count1--;
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
