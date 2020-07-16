package leetcode05;

import java.util.Random;

/**
 * @ClassName: Solution05.java
 * @Description:ϴ���㷨
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��7��16�� ����11:02:59
 */
public class Solution0502 {
	private int[] orginNums;
	private int[] shuffleNums;

	public Solution0502(int[] nums) {
		this.orginNums = nums.clone();
		this.shuffleNums = nums;
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return orginNums;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		for (int i = 0; i < shuffleNums.length; i++) {
			int j = new Random().nextInt(shuffleNums.length);
			if (i != j) {
				shuffleNums[j] += shuffleNums[i];
				shuffleNums[i] = shuffleNums[j] - shuffleNums[i];
				shuffleNums[j] = shuffleNums[j] - shuffleNums[i];
			}
		}
		return shuffleNums;
	}

	public static void main(String[] args) {
		// �����ּ��� 1, 2 �� 3 ��ʼ�����顣
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Solution0502 solution = new Solution0502(nums);

		// �������鵽���ĳ�ʼ״̬[1,2,3]��
		int[] reset = solution.reset();
		System.out.println("reset arrays : ");
		for (int i : reset) {
			System.out.print(i);
		}
		System.out.println();

		// �������� [1,2,3] �����ؽ�����κ� [1,2,3]�����з��صĸ���Ӧ����ͬ��
		int[] shuffle = solution.shuffle();
		System.out.println("shuffle arrays : ");
		for (int i : shuffle) {
			System.out.print(i);
		}
		System.out.println();

		// �������鵽���ĳ�ʼ״̬[1,2,3]��
		reset = solution.reset();
		System.out.println("reset arrays : ");
		for (int i : reset) {
			System.out.print(i);
		}
		System.out.println();

		// �����������[1,2,3]���Һ�Ľ����
		shuffle = solution.shuffle();
		System.out.println("shuffle arrays : ");
		for (int i : shuffle) {
			System.out.print(i);
		}
		System.out.println();

	}

}
