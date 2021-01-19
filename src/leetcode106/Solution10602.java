package leetcode106;

/**
 * @ClassName: Solution10602.java
 * @Description:《漫画算法》
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月19日 上午10:41:11 
 */
public class Solution10602 {
	public boolean isPowerOfTwo(int n) {
		int temp  = 1;
		while (temp<=n) {
			if(temp == n) {
				return true;
			}
			temp *=2;
		}
		return false;
    }
	
	
	public static void main(String[] args) {
		Solution10602 solution = new Solution10602();
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
