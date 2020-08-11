package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @ClassName: QuickSort.java
 * @Description:快速排序
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年8月11日 下午2:14:58
 */
public class QuickSort {

	/**
	 * 这里使用双边循环法实现的快速排序，代码部分使用递归
	 * 
	 * @param array
	 * @param startIndex
	 * @param endIndex
	 */
	public static void quickSort(int array[], int startIndex, int endIndex) {
		// 递归结束条件：startInde>=endIndex
		if (startIndex >= endIndex) {
			return;
		}
		// 得到基准元素
		int pivotIndex = partition(array, startIndex, endIndex);
		// 根据基准元素，分为两部分进行递归排序
		quickSort(array, startIndex, pivotIndex - 1);
		quickSort(array, pivotIndex + 1, endIndex);
	}

	/**
	 * 分治(双边循环法)
	 * 
	 * @param array
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public static int partition(int array[], int startIndex, int endIndex) {
		// 取第一个位置（也可以随机选择位置）的元素作为基准元素
		int pivot = array[startIndex];
		int left = startIndex;
		int right = endIndex;
		while (left != right) {
			// 控制right指针比较并向左移
			while (left < right && array[right] > pivot) {
				right--;
			}
			// 控制left指针比较并向右移
			while (left < right && array[left] <= pivot) {
				left++;
			}
			// 交换left和right指针所指向的元素
			if (left < right) {
				int p = array[left];
				array[left] = array[right];
				array[right] = p;
			}

		}

		// pivot和指针重合点交换
		array[startIndex] = array[left];
		array[left] = pivot;
		return left;
	}

	/**
	 * 分治(单边循环法)
	 * 
	 * @param array
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public static int partition1(int array[], int startIndex, int endIndex) {
		// 取第一个位置（也可以随机选择位置）的元素作为基准元素
		int pivot = array[startIndex];
		int mark =startIndex;
		
		//循环查询交换
		for (int i = startIndex+1; i <= endIndex; i++) {
			//如果当前指向值大于基准元素，移动指针并交换位置。
			if(array[i]<pivot) {
				mark++;
				int p = array[mark];
				array[mark]=array[i];
				array[i]=p;
			}
		}
		//循环结束后，将基准元素，和当前标记位互换
		array[startIndex] = array[mark];
		array[mark] =pivot;
		return mark;
	}
	
	/**
	 * 使用非递归算法实现
	 * @return
	 */
	public static void quickSort1(int array[],int startIndex,int endIndex) {
		//使用一个集合栈来替代递归的函数栈
		Stack<Map<String, Integer>> quickSortStack = new Stack<Map<String,Integer>>();
		//整个数列的起止下标，以Hash的形式入栈
		Map<String, Integer> rootParaMap = new HashMap<String, Integer>();
		rootParaMap.put("startInde", startIndex);
		rootParaMap.put("endIndex", endIndex);
		quickSortStack.add(rootParaMap);
		
		//循环结束，栈为空时
		while (!quickSortStack.isEmpty()) {
			//栈顶元素出栈，获取到起始下标
			Map<String, Integer> paraMap = quickSortStack.pop();
			//的到基准元素的位置
			int pivotIndex = partition1(array, paraMap.get("startIndex"), paraMap.get("endIndex"));
			//根据基准元素分成两部分，把每一部分的起止下标入栈
			if(paraMap.get("startIndex")<pivotIndex-1) {
				Map<String, Integer> leftParaMap = new HashMap<String, Integer>();
				leftParaMap.put("startInde",paraMap.get("startInde"));
				leftParaMap.put("endIndex", pivotIndex-1);
				quickSortStack.add(leftParaMap);
			}
			if(pivotIndex+1<paraMap.get("endIndex")) {
				Map<String, Integer> rightMap =new HashMap<String, Integer>();
				rightMap.put("startInde",pivotIndex+1);
				rightMap.put("endIndex", paraMap.get("endIndex"));
				quickSortStack.add(rightMap);
			}
			
		}
	}

	public static void main(String[] args) {
		int[] arr = { 4, 4, 6, 5, 3, 2, 8, 1 };
		quickSort(arr, 0, arr.length - 1);
		System.err.println(Arrays.toString(arr));
	}
}
