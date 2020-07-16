package leetcode05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName: Sulotion0501.java
 * @Description:�����㷨
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��7��16�� ����2:52:00 
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
		// �����ּ��� 1, 2 �� 3 ��ʼ�����顣
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8 };
		Solution0501 solution = new Solution0501(nums);

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
