package leetcode99;

import java.util.Arrays;

/**
 * @ClassName: Solution9901.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021��1��11�� ����4:09:20 
 */
public class Solution9901 {
	
	public int[] plusOne(int[] digits) {
		int length = digits.length;
		//Ϊ�յ����
		if(length==0) {
			return new int[] {1};
		}
		//�����λ
		int temp = 1;
		int count = 0;
		int i = length-1;
		//ѭ������
		while (i>=0) {
				count = digits[i]+temp;
				temp = count/10;
				digits[i]= count%10;
				//��Լʱ��
				if (temp==0) {
					break;
				}
			i--;
		}
		//�����Ȼ����һλ
		if (temp!=0) {
			int[] result = new int[length+1];
			result[0] = temp;
			for (int j = 0; j < length; j++) {
				result[j+1]=digits[j];
			}
			return result;
		}
		return digits;
    }
	
	public static void main(String[] args) {
		Solution9901 solution = new Solution9901();
		int[] nums1 = {};
		System.out.println("Result:"+Arrays.toString(solution.plusOne(nums1)));
		
		int[] nums2 = {9};
		System.out.println("Result:"+Arrays.toString(solution.plusOne(nums2)));
		
		int[] nums3 = {1,2,3};
		System.out.println("Result:"+Arrays.toString(solution.plusOne(nums3)));
	}
}
