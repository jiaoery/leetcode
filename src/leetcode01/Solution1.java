package leetcode01;

import java.util.HashMap;

/**
 * @ClassName: Solution1.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年7月7日 下午6:17:00 
 */
public class Solution1 {
	/**
	  *   采取HashMap表完成，其中算法的时间复杂度为O(n),空间复杂度为S(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map =new HashMap<>();
        int j ;
        for(int i=0;i<nums.length;i++){
            j = target - nums[i];
            if(map.containsKey(j)){
                return new int[]{map.get(j),i};
            } else{
                map.put(nums[i],i);
            }
        }
        throw new RuntimeException("there has no number match the target");
    }
	
	/**
	 *   最常见的匹配方式，采取内外两次循环.时间复杂度为O(n^2),空间复杂度为S(1)
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum1(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]+nums[j]==target) {
        			return new int[] {i,j};
        		}
        	}
        }
        throw new RuntimeException("there has no number match the target");
    }
	
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println("provide nums :");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("target num is "+target);
		int[] targetNums = twoSum(nums, target);
		System.out.println("target nums row is :");
		for (int i = 0; i < targetNums.length; i++) {
			System.out.println(targetNums[i]);
		}
		
	}
}
