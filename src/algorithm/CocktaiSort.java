package algorithm;

/**
 * @ClassName: CocktaiSort.java
 * @Description:鸡尾酒排序在冒泡排序基础上做的高级优化算法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月11日 下午1:59:12 
 */
public class CocktaiSort {
	public static void sort(int array[]) {
		int temp =0;
		for (int i = 0; i < array.length/2; i++) {
			//有序标记，每一轮初始值都是true
			boolean isSort = true;
			//奇数轮，从左往右比较和交换
			for (int j = 0; j < array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					//有元素交换，所以不是有序的，标记变为false
					isSort = false;
				}
			}
			//已经有序，便结束排序
			if(isSort) {
				break;
			}
			//偶数轮，将isSort重新标记为true；
			isSort =  true ;
			//偶数轮，从右往左比较交换
			for (int j = array.length-i-1; j >i; j--) {
				if(array[j]<array[j-1]) {
					temp = array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					//因为有元素进行交换，所以不是有序的，标记变为false
					isSort = false;
				}
			}
			//已经有序，便结束排序
			if(isSort) {
				break;
			}
		}
	}
}
