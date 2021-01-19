package leetcode106;

/**
 * @ClassName: Solution10603.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月19日 上午10:48:11 
 */
public class Solution10603 {
	public boolean isPowerOfTwo(int n) {
		if(n<=0) return false;
		return (n&n-1)==0;
	}
	
	public static void main(String[] args) {
		Solution10603 solution = new Solution10603();
		int nums1 = 1;
		System.out.println("Nums:"+nums1+" is "+solution.isPowerOfTwo(nums1));
		
		int nums2 = 0;
		System.out.println("Nums:"+nums2+" is "+solution.isPowerOfTwo(nums2));
		
		int nums3 = 1024;
		System.out.println("Nums:"+nums3+" is "+solution.isPowerOfTwo(nums3));
		
		int nums4 = 3;
		System.out.println("Nums:"+nums4+" is "+solution.isPowerOfTwo(nums4));
	}
}
