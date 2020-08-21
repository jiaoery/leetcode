package leetcode23;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: Solution2301.java
 * @Description:暴力法：会超时
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月20日 上午10:51:52 
 */
public class Solution2301 {
	 public List<Integer> findDisappearedNumbers(int[] nums) {
	        ArrayList<Integer> result = new ArrayList<>();
	        for(int i=1;i<=nums.length;i++){
	            int count = 0;
	            for(int j=0;j<nums.length;j++){
	                if(nums[j]==i){
	                    count++;
	                }
	            }
	            if(count ==0){
	                result.add(i);
	            }
	        }
	        return result;
	    }
	 
	 
	 public static void main(String[] args) {
		int[] test= {4,3,2,7,8,2,3,1};
		List<Integer> result = new Solution2301().findDisappearedNumbers(test);
		System.err.println(result);
	}
}
