package leetcode06;

/**
 * @ClassName: Solution0603.java
 * @Description:������ ʱ�临�Ӷ�O(n^2)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��7��21�� ����10:37:20
 */
public class Solution0603 {
	/**
	 * ������������
	 * @param nums ��������
	 * @param k    �ƶ�λ��
	 * @return ���ص�����
	 */
	public static int[] rotate(int[] nums, int k) {
		int size = nums.length;
		k %= size;
		reverse(nums, 0, size-1);
		reverse(nums, 0, k-1);
		reverse(nums, k, size-1);
		return nums;
	}
	
	/**
	 * ��ת����
	 * @param nums
	 * @param start
	 * @param end
	 */
	public static void reverse(int[] nums, int start, int end) {
		while(start<end) {
			int temp = nums[start];
			nums[start]= nums[end];
			nums[end]=temp;
			start++;
			end--;
		}
	}
	
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.print("before rotate :");
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + ",");
		}
		int k = 3;
		System.out.println("k = " + k);
		int[] rotateNums = rotate(nums, k);
		System.out.print("before rotate :");
		for (int i = 0; i < rotateNums.length; i++) {
			System.out.print(rotateNums[i] + ",");
		}

	}
}
