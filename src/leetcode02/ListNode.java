package leetcode02;

/**
 * @ClassName: ListNode.java
 * @Description:������
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��7��3�� ����4:06:12 
 */
public class ListNode {
	public int val;
	public ListNode next;
	public ListNode(int x) { val = x; }
	public ListNode(int x,ListNode next){
		this.val = x;
		this.next = next;
	}

}
