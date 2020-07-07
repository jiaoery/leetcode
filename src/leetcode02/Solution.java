package leetcode02;

import java.awt.List;

/**
 * @ClassName: Solution.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��7��3�� ����4:05:39 
 */
public class Solution {
	//�ݹ�ķ�ʽʵ��
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //����ĸ��ڵ�
        ListNode root = new ListNode(0);
        //�����ƶ�ָ��
        ListNode cursor = root;
        //����һλ�������
        int carry = 0;

        while(l1 != null || l2 !=null || carry!= 0){
            int l1var = l1!=null?l1.val:0;
            int l2var = l2!=null?l2.val:0;
            int sum = l1var + l2var + carry;
            //ȡ��λ
            carry = sum/10;
            ListNode next = new ListNode(sum%10);
            cursor.next = next;
            cursor = next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
    
        }
        return root.next;
    }
    
    public static void main(String[] args) {
    	//����l1
		ListNode l1 = new ListNode(2);
		ListNode l11 = new ListNode(4);
		ListNode l12 = new ListNode(3);
		l11.next = l12;
		l1.next = l11;
		
		
		//����l2
		ListNode l2 = new ListNode(5);
		ListNode l21 = new ListNode(6);
		ListNode l22 = new ListNode(4);
		l21.next = l22;
		l2.next = l21;
		
		ListNode result = new Solution().addTwoNumbers(l1, l2);
		while (result !=null) {
		      System.out.println("result is "+ result.val);
		      result = result.next;
		}
		
	}
}
