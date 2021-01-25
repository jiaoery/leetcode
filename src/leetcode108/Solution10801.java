package leetcode108;

/**
 * @ClassName: Solution10801.java
 * @Description:迭代
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月25日 上午11:15:07 
 */
public class Solution10801 {

	public boolean isUgly(int num) {
		//小于1的数都不符合
		if(num<1) {
			return false;
		}
		
		//是否被5整除
		while (num%5==0) {
			num/=5;		
		}
		//是否被3整除
		while (num%3==0) {
			num/=3;			
		}
		//是否被2整除
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
