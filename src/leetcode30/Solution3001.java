package leetcode30;


/**
 * @ClassName: Solution3001.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月31日 上午10:32:23 
 */
public class Solution3001 {
	 public int minMoves(int[] nums) {
		 //下标
		 int max=nums.length-1,min=0,count=0;
		 while(true) {
			 for (int j = 0; j < nums.length; j++) {
				if(nums[min]>nums[j]) {
					min = j;
				}
				if(nums[max]<nums[j]) {
					max = j;
				}
			}
			 //如果达到条件
			 if(nums[max] == nums[min]) {
				 break;
			 }
			 //除最大值外，其他位置都自加1
			for (int i = 0; i < nums.length; i++) {
				if(i!=max) {
					nums[i]++;
				}
			}
			count++;
		 }
		 return count;
	 }
	 
	 public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println("result:"+new Solution3001().minMoves(nums));
	}

}
