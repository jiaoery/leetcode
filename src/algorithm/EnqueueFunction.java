package algorithm;

/**
 * @ClassName: EnqueueFunction.java
 * @Description:队列操作 这里使用循环数组，既避免了开空间的麻烦，也避免了数组元素移动带来的麻烦性
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年7月22日 下午2:00:34 
 */
public class EnqueueFunction {

	private int[] array;
	/*队头**/
	private int front;
	/**队尾**/
	private int rear;
	
	public EnqueueFunction(int capacity) {
		this.array = new int[capacity];
	}
	
	/**
	 * 入队
	 * @param element 入队元素
	 */
	public void enQueue(int element) throws Exception{
		//判断队列是否已满
		if((rear+1)%array.length == front) {
			throw new Exception("队列已满");
		}
		array[rear] = element;
		rear = (rear+1)%array.length;
	}
	
	/**
	 * 出队
	 * 
	 * @throws Exception 
	 */
	public int deQueue() throws Exception {
		if(rear == front) {
			throw new Exception("队列已空");
		}
		int deQueueElement = array[front];
		front = (front+1)%array.length;
		return deQueueElement;
	}
	
	/**
	 * 输出队列
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
