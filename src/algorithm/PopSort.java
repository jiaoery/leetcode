package algorithm;

import java.util.Arrays;

/**
 * @ClassName: PopSort.java
 * @Description:TODO(��һ�仰�������ļ���ʲô)
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��8��11�� ����11:12:23
 */
public class PopSort {

	/**
	 * ð�������㷨 ��С���� ʱ�临�Ӷ�O(n^2)
	 * 
	 * @param array
	 */
	public static void sort(int array[]) {
		// �ⲿѭ��
		for (int i = 0; i < array.length - 1; i++) {
			// �ڲ�����ѭ��
			for (int j = 0; j < array.length - i - 1; j++) {
				int temp = 0;
				// �����������ȴ�С��Ȼ����ݴ�С����λ��
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}
	
	
	/**
	 * �Ż�ð�������㷨���ж��Ƿ��Դﵽ��������
	 * @param array
	 */
	public static void sort1(int array[]) {
		for (int i = 0; i < array.length-1; i++) {
			//�Ƿ��Ѿ��ﵽ��������
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
	 * �Ż�ð�������㷨���жϱ߽����Ƿ�����
	 * @param array
	 */
	public static void sort2(int array[]) {
		//��¼���һ�ν�����λ��
		int lastExchangeInde =0;
		//��������ı߽磬ÿ�ζԴ�ֻ��Ҫ������Ϳ�����
		int sortBorder = array.length-1;
		for (int i = 0; i < array.length-1; i++) {
			//�Ƿ��Ѿ��ﵽ��������
			boolean isSort = true;
			for (int j = 0; j < sortBorder; j++) {
				int temp = 0;
				if(array[j]>array[j-1]) {
					temp = array[j];
					array[j+1]=array[j];
					array[j]=temp;
					isSort = false;
					//�������һ��Ԫ�ؽ�����λ��
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
