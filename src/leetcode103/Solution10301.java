package leetcode103;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution10301.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2021年1月14日 上午10:20:18 
 */
public class Solution10301 {
	public List<Boolean> prefixesDivBy5(int[] A) {
		List<Boolean> list =  new ArrayList<Boolean>();
		int count = 0;
		for (int i = 0; i < A.length; i++) {
			count <<= 1;
            count += A[i];
            count %= 10;
			list.add(count%5==0);
		}
		return list;
    }
	
	public static void main(String[] args) {
		Solution10301 solution = new Solution10301();
		int[] nums1 = {0,1,1};
		System.out.println(solution.prefixesDivBy5(nums1));
		
		int[] nums2 = {1,1,1};
		System.out.println(solution.prefixesDivBy5(nums2));
		
		int[] nums3 = {0,1,1,1,1,1};
		System.out.println(solution.prefixesDivBy5(nums3));
		
		int[] nums4 = {1,0,0,1,0,1,0,0,1,0,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,0,1,0,0,0,0,1,1,0,1,0,0,0,1};
		System.out.println(solution.prefixesDivBy5(nums4));
	}
}
