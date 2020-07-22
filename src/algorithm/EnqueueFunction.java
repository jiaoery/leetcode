package algorithm;

/**
 * @ClassName: EnqueueFunction.java
 * @Description:���в��� ����ʹ��ѭ�����飬�ȱ����˿��ռ���鷳��Ҳ����������Ԫ���ƶ��������鷳��
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��7��22�� ����2:00:34 
 */
public class EnqueueFunction {

	private int[] array;
	/*��ͷ**/
	private int front;
	/**��β**/
	private int rear;
	
	public EnqueueFunction(int capacity) {
		this.array = new int[capacity];
	}
	
	/**
	 * ���
	 * @param element ���Ԫ��
	 */
	public void enQueue(int element) throws Exception{
		//�ж϶����Ƿ�����
		if((rear+1)%array.length == front) {
			throw new Exception("��������");
		}
		array[rear] = element;
		rear = (rear+1)%array.length;
	}
	
	/**
	 * ����
	 * 
	 * @throws Exception 
	 */
	public int deQueue() throws Exception {
		if(rear == front) {
			throw new Exception("�����ѿ�");
		}
		int deQueueElement = array[front];
		front = (front+1)%array.length;
		return deQueueElement;
	}
	
	/**
	 * �������
	 */
	public void output() {
		for (int i = front; i !=rear; i=(i+1)%array.length) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) throws Exception {
		EnqueueFunction eFunction =new EnqueueFunction(6);
		eFunction.enQueue(3);
		eFunction.enQueue(5);
		eFunction.enQueue(6);
		eFunction.enQueue(8);
		eFunction.enQueue(1);
		eFunction.deQueue();
		eFunction.deQueue();
		eFunction.deQueue();
		eFunction.enQueue(2);
		eFunction.enQueue(4);
		eFunction.enQueue(9);
		eFunction.output();
	
		
		
	}
	
}
