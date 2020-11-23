package leetcode71;

import leetcode02.ListNode;

/**
 * @ClassName: Solution7101.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��20�� ����11:16:32 
 */
public class Solution7101 {
	public ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return null;
		}
		//����һ��ͷ���
		ListNode temp = new ListNode(Integer.MAX_VALUE);
		temp.next = head;
		//�Ѿ�����Ľڵ�
		ListNode lastSorted =   head;
		//���ڵ�
		ListNode curr = head;
		//��鵱ǰ�ڵ��Ƿ�Ϊ��
		 while (curr != null) {
	            if (lastSorted.val <= curr.val) {
	                lastSorted = lastSorted.next;
	            } else {
	                ListNode prev = temp;
	                while (prev.next.val <= curr.val) {
	                    prev = prev.next;
	                }
	                lastSorted.next = curr.next;
	                curr.next = prev.next;
	                prev.next = curr;
	            }
	            curr = lastSorted.next;
	        }

		return temp.next;
    }
}
