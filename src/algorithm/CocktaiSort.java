package algorithm;

/**
 * @ClassName: CocktaiSort.java
 * @Description:��β��������ð��������������ĸ߼��Ż��㷨
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��11�� ����1:59:12 
 */
public class CocktaiSort {
	public static void sort(int array[]) {
		int temp =0;
		for (int i = 0; i < array.length/2; i++) {
			//�����ǣ�ÿһ�ֳ�ʼֵ����true
			boolean isSort = true;
			//�����֣��������ұȽϺͽ���
			for (int j = 0; j < array.length-i-1; j++) {
				if(array[j]>array[j+1]) {
					temp = array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					//��Ԫ�ؽ��������Բ�������ģ���Ǳ�Ϊfalse
					isSort = false;
				}
			}
			//�Ѿ����򣬱��������
			if(isSort) {
				break;
			}
			//ż���֣���isSort���±��Ϊtrue��
			isSort =  true ;
			//ż���֣���������ȽϽ���
			for (int j = array.length-i-1; j >i; j--) {
				if(array[j]<array[j-1]) {
					temp = array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
					//��Ϊ��Ԫ�ؽ��н��������Բ�������ģ���Ǳ�Ϊfalse
					isSort = false;
				}
			}
			//�Ѿ����򣬱��������
			if(isSort) {
				break;
			}
		}
	}
}
