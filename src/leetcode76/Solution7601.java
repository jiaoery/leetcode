package leetcode76;

/**
 * @ClassName: Solution7601.java
 * @Description:�ǹȲ���
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��26�� ����3:44:10 
 */
public class Solution7601 {
	/**
	 *  �ǹȲ��룬Ҳ��Ϊ����������һ����Ϊ���� ��n=n*3=1;��һ����Ϊż������n=n/2
	 * @return
	 */
	public static int collatzConjecture(int n) {
		//����1ʱ����ȵ�
		if(n==1) {
			return 1;
		}
		//����
		if(n%2==1) {
			n=3*n+1;	
		}else {
			 n = n/2;	
		}
		System.out.print(n+"\t");
		return collatzConjecture(n);
	}
	
	public static void main(String[] args) {
		System.out.println(collatzConjecture(2));
	}
}
