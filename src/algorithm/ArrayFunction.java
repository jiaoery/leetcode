package algorithm;

/**
 * @ClassName: ArrayFunction.java
 * @Description:չʾ���ݵ����ݽṹ�Ͳ���
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020��7��16�� ����4:53:34
 */
public class ArrayFunction {
	// ����ṹ����
	private int[] array;

	private int size;

	public ArrayFunction(int capacity) {
		this.array = new int[capacity];
		size = 0;
	}

	/**
	 * �������Ԫ��
	 * 
	 * @param index   �����λ��
	 * @param element �����Ԫ��
	 */
	public void insert(int index, int element) {
		//�����±��Ƿ񳬳���Χ
		if(index<0||index>=array.length) {
			throw new IndexOutOfBoundsException("��������ʵ��Ԫ�ط�Χ��");
		}
		//��������ѭ������Ԫ���������Ųһλ
		for(int i =size-1;i>=index;i++) {
			array[i+1] = array[i];
		}
		//�ڳ���λ�÷����µ�Ԫ��
		array[index] = element;
		size++;
	}
	
	/**
	 * �������
	 */
	public void output() {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);	
		}
	}
	
	public static void main(String[] args) {
		ArrayFunction mArray = new ArrayFunction(10);
		mArray.insert(0, 3);
		mArray.insert(1, 7);
		mArray.insert(2, 9);
		mArray.insert(3, 5);
		mArray.insert(8, 6);
		mArray.output();
	}
}
