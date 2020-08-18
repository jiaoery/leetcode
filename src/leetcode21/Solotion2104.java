package leetcode21;

/**
 * @ClassName: Solotion2104.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月18日 下午1:59:21 
 */
public class Solotion2104 {
	 public int[] findErrorNums(int[] nums) {
	        int dup = -1, missing = 1;
	        for (int n: nums) {
	            if (nums[Math.abs(n) - 1] < 0)
	                dup = Math.abs(n);
	            else
	                nums[Math.abs(n) - 1] *= -1;
	        }
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] > 0)
	                missing = i + 1;
	        }
	        return new int[]{dup, missing};
	    }

}
