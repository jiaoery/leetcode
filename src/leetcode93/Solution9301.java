package leetcode93;

import java.util.Arrays;

/**
 * @ClassName: Solution9301.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月24日 上午11:15:38 
 */
public class Solution9301 {

	public int candy(int[] ratings) {
		int[] nums = new int[ratings.length];
		//初始第一位小朋友获得一个糖果
		nums[0] = 1;
		//从左到右
		for (int i = 1; i < ratings.length; i++) {
			//满足从左到右，右边的小朋友表现分更高，得到比左边的小朋友多一颗糖
			if(ratings[i]>ratings[i-1]) {
				nums[i]=nums[i-1]+1;
			}else {
				//满足条件1：每个小朋友都至少有一颗糖
				nums[i] = 1;
			}
		}
		
		//逆序一次
		for (int i = ratings.length-1; i >0; i--) {
			//满足从左到右，右边的小朋友表现分更高，得到比右边的小朋友多一颗糖
			if(ratings[i-1]>ratings[i]&&nums[i-1]<=nums[i]) {
				nums[i-1]++;
			}
		}
		//统计结果
		int count =0;
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			count+=nums[i];
		}
		return count;
    }
	
	public static void main(String[] args) {
		Solution9301 solution = new Solution9301();
		int[] rattings1 = {1,0,2};
		System.out.println("Rattings :"+Arrays.toString(rattings1)+", total:"+solution.candy(rattings1));
		
		int[] rattings2 = {1,2,2};
		System.out.println("Rattings :"+Arrays.toString(rattings2)+", total:"+solution.candy(rattings2));
		
		int[] rattings3 = {1,2,3,4,1,1,1,1};
		System.out.println("Rattings :"+Arrays.toString(rattings3)+", total:"+solution.candy(rattings3));
	}
}
