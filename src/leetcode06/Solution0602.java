package leetcode06;

/**
 * @ClassName: Solution0602.java
 * @Description:�������Ż�:��������
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��7��21�� ����10:37:07
 */
public class Solution0602 {

	/**
	 * ������������
	 * @param nums ��������
	 * @param k    �ƶ�λ��
	 * @return ���ص�����
	 */
	public static int[] rotate(int[] nums, int k) {
		int[] temps = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			temps[(i + k) % nums.length] = nums[i];
		}
		for (int i = 0; i < nums.length; i++) {
			nums[i] = temps[i];
		}
		return nums;
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
