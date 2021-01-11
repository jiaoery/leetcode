package leetcode99;

import java.util.Arrays;

/**
 * @ClassName: Solution9901.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月11日 下午4:09:20 
 */
public class Solution9901 {
	
	public int[] plusOne(int[] digits) {
		int length = digits.length;
		//为空的情况
		if(length==0) {
			return new int[] {1};
		}
		//保存进位
		int temp = 1;
		int count = 0;
		int i = length-1;
		//循环更新
		while (i>=0) {
				count = digits[i]+temp;
				temp = count/10;
				digits[i]= count%10;
				//节约时间
				if (temp==0) {
					break;
				}
			i--;
		}
		//最后仍然还有一位
		if (temp!=0) {
			int[] result = new int[length+1];
			result[0] = temp;
			for (int j = 0; j < length; j++) {
				result[j+1]=digits[j];
			}
			return result;
		}
		return digits;
    }
	
	public static void main(String[] args) {
		Solution9901 solution = new Solution9901();
		int[] nums1 = {};
		System.out.println("Result:"+Arrays.toString(solution.plusOne(nums1)));
		
		int[] nums2 = {9};
		System.out.println("Result:"+Arrays.toString(solution.plusOne(nums2)));
		
		int[] nums3 = {1,2,3};
		System.out.println("Result:"+Arrays.toString(solution.plusOne(nums3)));
	}
}
