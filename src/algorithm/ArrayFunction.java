package algorithm;

/**
 * @ClassName: ArrayFunction.java
 * @Description:展示数据的数据结构和操作
 * 
 * @author jixiang
 * @version v1.0.0
 * @Date 2020年7月16日 下午4:53:34
 */
public class ArrayFunction {
	// 数组结构构造
	private int[] array;

	private int size;

	public ArrayFunction(int capacity) {
		this.array = new int[capacity];
		size = 0;
	}

	/**
	 * 数组插入元素
	 * 
	 * @param index   插入的位置
	 * @param element 插入的元素
	 */
	public void insert(int index, int element) {
		//访问下标是否超出范围
		if(index<0||index>=array.length) {
			throw new IndexOutOfBoundsException("超出数组实际元素范围！");
		}
		//从右往左循环，讲元素逐个向右挪一位
		for(int i =size-1;i>=index;i++) {
			array[i+1] = array[i];
		}
		//腾出的位置放入新的元素
		array[index] = element;
		size++;
	}
	
	/**
	 * 输出数组
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
