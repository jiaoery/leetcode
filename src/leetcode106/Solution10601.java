package leetcode106;

/**
 * @ClassName: Solution10601.java
 * @Description:�ݹ��㷨
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021��1��19�� ����10:35:02 
 */
public class Solution10601 {
	public boolean isPowerOfTwo(int n) {
		if(n==1)return true;
		if(n==0)return false;
		return n%2==0?isPowerOfTwo(n/2):false;
    }
	
	public static void main(String[] args) {
		Solution10601 solution10601 = new Solution10601();
		int nums1 = 1;
		System.out.println("Nums:"+nums1+" is "+solution10601.isPowerOfTwo(nums1));
		
		int nums2 = 0;
		System.out.println("Nums:"+nums2+" is "+solution10601.isPowerOfTwo(nums2));
		
		int nums3 = 1024;
		System.out.println("Nums:"+nums3+" is "+solution10601.isPowerOfTwo(nums3));
		
		int nums4 = 3;
		System.out.println("Nums:"+nums4+" is "+solution10601.isPowerOfTwo(nums4));
	}
}
