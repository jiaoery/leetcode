package leetcode57;

/**
 * @ClassName: Solution5701.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��11��3�� ����3:38:12 
 */
public class Solution5701 {
	public static boolean validMountainArray(int[] A) {
		//���������ж�
		if(A==null||A.length<3) {
			return false;
		}
		//���
		int mark ;
		//��ɽ
		for (mark = 1; mark < A.length&&A[mark-1]<A[mark]; mark++);
		//��һ������ͷ��һ�ζ�������
		if(mark==1||mark == A.length) {
			return false;
		}
		
		
		//��ɽ
		for (; mark < A.length&&A[mark-1]>A[mark]; mark++) ;
	
		//�ж��Ƿ�ﵽɽ��
		return mark == A.length;
    }
	
	public static void main(String[] args) {
		int[] nums = {0,3,2,1};
		System.out.println("validMountainArray:"+validMountainArray(nums));
	}
}
