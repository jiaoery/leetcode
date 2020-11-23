package leetcode71;

import leetcode02.ListNode;

/**
 * @ClassName: Solution7101.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年11月20日 上午11:16:32 
 */
public class Solution7101 {
	public ListNode insertionSortList(ListNode head) {
		if (head == null) {
			return null;
		}
		//虚拟一个头结点
		ListNode temp = new ListNode(Integer.MAX_VALUE);
		temp.next = head;
		//已经排序的节点
		ListNode lastSorted =   head;
		//检查节点
		ListNode curr = head;
		//检查当前节点是否为空
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
