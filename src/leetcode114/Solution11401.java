package leetcode114;

/**
 * @ClassName: Solution11401.java
 * @Description:暴力法 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月29日 下午1:55:16 
 */
public class Solution11401 {
	 public int totalHammingDistance(int[] nums) {
		 int sum = 0;
		 for (int i = 0; i < nums.length; i++) {
			for (int j =i+1 ; j < nums.length; j++) {
				sum += hammingDistance(nums[i], nums[j]);
			}
		}
		 return sum;
	 }
	 
	 public int hammingDistance(int x,int y) {
		int z = x^y;
		int count = 0;
		while (z>0) {
			count  += z&1;
			z>>=1;
		}
		return count;
	}
	 
	 
	 public static void main(String[] args) {
		Solution11401 solution =  new Solution11401();
		int[] nums1 = {};
		System.out.println(solution.totalHammingDistance(nums1));
	}
}
