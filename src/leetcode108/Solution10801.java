package leetcode108;

/**
 * @ClassName: Solution10801.java
 * @Description:����
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021��1��25�� ����11:15:07 
 */
public class Solution10801 {

	public boolean isUgly(int num) {
		//С��1������������
		if(num<1) {
			return false;
		}
		
		//�Ƿ�5����
		while (num%5==0) {
			num/=5;		
		}
		//�Ƿ�3����
		while (num%3==0) {
			num/=3;			
		}
		//�Ƿ�2����
		while ((num&1)==0) {
			num=num>>1;	
		}
		
		return num==1;
		
    }
	
	
	public static void main(String[] args) {
		Solution10801 solution = new Solution10801();
		int nums1 =10;
		System.out.println(solution.isUgly(nums1));
		
		int nums2 = 7;
		
		System.out.println(solution.isUgly(nums2));
	}
}
