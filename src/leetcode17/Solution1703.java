package leetcode17;


/**
 * @ClassName: Solution1703.java
 * @Description:放到指定的位置
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月12日 上午11:21:56 
 */
public class Solution1703 {
	public int findRepeatNumber(int[] nums) {
		  for (int i = 0; i < nums.length; i++) {
			  //位置对应正确，跳过本次循环
			  if(nums[i]==i) {
				  continue;
			  }
			  if(nums[i]==nums[nums[i]]) {
				  return nums[i];
			  }
			//交换
	            int temp = nums[nums[i]];
	            nums[nums[i]] = nums[i];
	            nums[i] = temp;
	            //这里的i--是为了抵消掉上面的i++，
	            //交换之后需要原地再比较
	            i--;
		  }
		  return -1;
	 }
}
