package algorithm;

import java.util.Arrays;

/**
 * @ClassName: PopSort.java
 * @Description:TODO(用一句话描述该文件做什么)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月11日 上午11:12:23
 */
public class PopSort {

	/**
	 * 冒牌排序算法 从小到大 时间复杂度O(n^2)
	 * 
	 * @param array
	 */
	public static void sort(int array[]) {
		// 外部循环
		for (int i = 0; i < array.length - 1; i++) {
			// 内部交换循环
			for (int j = 0; j < array.length - i - 1; j++) {
				int temp = 0;
				// 相邻两个数比大小，然后根据大小交换位置
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	
	/**
	 * 优化冒牌排序算法，判断是否以达到最优条件
	 * @param array
	 */
	public static void sort1(int array[]) {
		for (int i = 0; i < array.length-1; i++) {
			//是否已经达到最优排序
			boolean isSort = true;
			for (int j = 0; j < array.length-i-1; j++) {
				int temp = 0;
				if(array[j]>array[j-1]) {
					temp = array[j];
					array[j+1]=array[j];
					array[j]=temp;
					isSort = false;
				}
			}
			if(isSort) {
				break;
			}
		}
	}
	
	/**
	 * 优化冒牌排序算法，判断边界区是否有序
	 * @param array
	 */
	public static void sort2(int array[]) {
		//记录最后一次交换的位置
		int lastExchangeInde =0;
		//无序数组的边界，每次对此只需要到这里就可以了
		int sortBorder = array.length-1;
		for (int i = 0; i < array.length-1; i++) {
			//是否已经达到最优排序
			boolean isSort = true;
			for (int j = 0; j < sortBorder; j++) {
				int temp = 0;
				if(array[j]>array[j-1]) {
					temp = array[j];
					array[j+1]=array[j];
					array[j]=temp;
					isSort = false;
					//更新最后一次元素交换的位置
					lastExchangeInde = j;
				}
			}
			sortBorder = lastExchangeInde;
			if(isSort) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		int[] array = {9,8,4,5,7,4,2,6};
		sort(array);
		System.out.println(Arrays.toString(array));
	}
}
