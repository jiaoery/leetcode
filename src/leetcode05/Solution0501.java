package leetcode05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName: Sulotion0501.java
 * @Description:暴力算法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年7月16日 下午2:52:00 
 */
public class Solution0501 {
	private int[] array;
    private int[] original;

    private Random rand = new Random();

    private List<Integer> getArrayCopy() {
        List<Integer> asList = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            asList.add(array[i]);
        }
        return asList;
    }

    public Solution0501(int[] nums) {
        array = nums;
        original = nums.clone();
    }
    
    public int[] reset() {
        array = original;
        original = original.clone();
        return array;
    }
    
    public int[] shuffle() {
        List<Integer> aux = getArrayCopy();

        for (int i = 0; i < array.length; i++) {
            int removeIdx = rand.nextInt(aux.size());
            array[i] = aux.get(removeIdx);
            aux.remove(removeIdx);
        }

        return array;
    }
    
    public static void main(String[] args) {
		// 以数字集合 1, 2 和 3 初始化数组。
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Solution0501 solution = new Solution0501(nums);

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
