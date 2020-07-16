package leetcode05;

import java.util.Random;

/**
 * @ClassName: Solution05.java
 * @Description:洗牌算法
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年7月16日 上午11:02:59
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
		// 以数字集合 1, 2 和 3 初始化数组。
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Solution0502 solution = new Solution0502(nums);

		// 重设数组到它的初始状态[1,2,3]。
		int[] reset = solution.reset();
		System.out.println("reset arrays : ");
		for (int i : reset) {
			System.out.print(i);
		}
		System.out.println();

		// 打乱数组 [1,2,3] 并返回结果。任何 [1,2,3]的排列返回的概率应该相同。
		int[] shuffle = solution.shuffle();
		System.out.println("shuffle arrays : ");
		for (int i : shuffle) {
			System.out.print(i);
		}
		System.out.println();

		// 重设数组到它的初始状态[1,2,3]。
		reset = solution.reset();
		System.out.println("reset arrays : ");
		for (int i : reset) {
			System.out.print(i);
		}
		System.out.println();

		// 随机返回数组[1,2,3]打乱后的结果。
		shuffle = solution.shuffle();
		System.out.println("shuffle arrays : ");
		for (int i : shuffle) {
			System.out.print(i);
		}
		System.out.println();

	}

}
