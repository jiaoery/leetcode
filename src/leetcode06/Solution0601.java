package leetcode06;

/**
 * @ClassName: Solution0601.java
 * @Description:������
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��7��21�� ����10:36:24 
 */
public class Solution0601 {
	/**
	 * Ψһ����
	 * 
	 * @param nums ��������
	 * @param k    �ƶ�λ��
	 * @return ���ص�����
	 */
	public static int[] rotate(int[] nums, int k) {
		if (nums == null) {
			throw new RuntimeException("Array cannot null");
		}
		int size = nums.length;
		//k��n+k�ƶ�Ч����ͬ
		k%=size;
		//�ƶ�Kλ
		for (int i = 0; i < k; i++) {
			int temp = nums[size - 1];
			for (int j = size - 1; j > 0; j--) {
				nums[j] = nums[j - 1];
			}
			nums[0] = temp;
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
		System.out.println("k = "+k);
		int[] rotateNums = rotate(nums, k);
		System.out.print("before rotate :");
		for (int i = 0; i < rotateNums.length; i++) {
			System.out.print(rotateNums[i] + ",");
		}

	}
}
