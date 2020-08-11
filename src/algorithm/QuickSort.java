package algorithm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @ClassName: QuickSort.java
 * @Description:��������
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��11�� ����2:14:58
 */
public class QuickSort {

	/**
	 * ����ʹ��˫��ѭ����ʵ�ֵĿ������򣬴��벿��ʹ�õݹ�
	 * 
	 * @param array
	 * @param startIndex
	 * @param endIndex
	 */
	public static void quickSort(int array[], int startIndex, int endIndex) {
		// �ݹ����������startInde>=endIndex
		if (startIndex >= endIndex) {
			return;
		}
		// �õ���׼Ԫ��
		int pivotIndex = partition(array, startIndex, endIndex);
		// ���ݻ�׼Ԫ�أ���Ϊ�����ֽ��еݹ�����
		quickSort(array, startIndex, pivotIndex - 1);
		quickSort(array, pivotIndex + 1, endIndex);
	}

	/**
	 * ����(˫��ѭ����)
	 * 
	 * @param array
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public static int partition(int array[], int startIndex, int endIndex) {
		// ȡ��һ��λ�ã�Ҳ�������ѡ��λ�ã���Ԫ����Ϊ��׼Ԫ��
		int pivot = array[startIndex];
		int left = startIndex;
		int right = endIndex;
		while (left != right) {
			// ����rightָ��Ƚϲ�������
			while (left < right && array[right] > pivot) {
				right--;
			}
			// ����leftָ��Ƚϲ�������
			while (left < right && array[left] <= pivot) {
				left++;
			}
			// ����left��rightָ����ָ���Ԫ��
			if (left < right) {
				int p = array[left];
				array[left] = array[right];
				array[right] = p;
			}

		}

		// pivot��ָ���غϵ㽻��
		array[startIndex] = array[left];
		array[left] = pivot;
		return left;
	}

	/**
	 * ����(����ѭ����)
	 * 
	 * @param array
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	public static int partition1(int array[], int startIndex, int endIndex) {
		// ȡ��һ��λ�ã�Ҳ�������ѡ��λ�ã���Ԫ����Ϊ��׼Ԫ��
		int pivot = array[startIndex];
		int mark =startIndex;
		
		//ѭ����ѯ����
		for (int i = startIndex+1; i <= endIndex; i++) {
			//�����ǰָ��ֵ���ڻ�׼Ԫ�أ��ƶ�ָ�벢����λ�á�
			if(array[i]<pivot) {
				mark++;
				int p = array[mark];
				array[mark]=array[i];
				array[i]=p;
			}
		}
		//ѭ�������󣬽���׼Ԫ�أ��͵�ǰ���λ����
		array[startIndex] = array[mark];
		array[mark] =pivot;
		return mark;
	}
	
	/**
	 * ʹ�÷ǵݹ��㷨ʵ��
	 * @return
	 */
	public static void quickSort1(int array[],int startIndex,int endIndex) {
		//ʹ��һ������ջ������ݹ�ĺ���ջ
		Stack<Map<String, Integer>> quickSortStack = new Stack<Map<String,Integer>>();
		//�������е���ֹ�±꣬��Hash����ʽ��ջ
		Map<String, Integer> rootParaMap = new HashMap<String, Integer>();
		rootParaMap.put("startInde", startIndex);
		rootParaMap.put("endIndex", endIndex);
		quickSortStack.add(rootParaMap);
		
		//ѭ��������ջΪ��ʱ
		while (!quickSortStack.isEmpty()) {
			//ջ��Ԫ�س�ջ����ȡ����ʼ�±�
			Map<String, Integer> paraMap = quickSortStack.pop();
			//�ĵ���׼Ԫ�ص�λ��
			int pivotIndex = partition1(array, paraMap.get("startIndex"), paraMap.get("endIndex"));
			//���ݻ�׼Ԫ�طֳ������֣���ÿһ���ֵ���ֹ�±���ջ
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
