package leetcode108;

/**
 * @ClassName: Solution10802.java
 * @Description:�ݹ�
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021��1��25�� ����11:24:59 
 */
public class Solution10802 {
	public boolean isUgly(int num) {
		if(num<1)return false;
		if(num%5==0) return isUgly(num/5);
	    if(num%3==0)return isUgly(num/3);
	    if((num&1)==0)return isUgly(num>>1);
	  
	    return num==1;
	}
	
	
	public static void main(String[] args) {
		Solution10802 solution = new Solution10802();
		int nums1 =10;
		System.out.println(solution.isUgly(nums1));
		
		int nums2 = 7;
		System.out.println(solution.isUgly(nums2));
	}
}
