package leetcode03;



/**
 * ClassName: Test<br/>
 * Description: TODO Description. <br/>
 * date: 2020/7/10 10:14<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution03 {

	 public static int pivotIndex(int[] nums) {
	        for(int i=0;i<nums.length;i++){
	            int leftNum = 0;
	            int rightNum = 0;
	            for(int j = 0;j<nums.length;j++){
	                if(j<i){
	                    leftNum+=nums[j];
	                }else if(j>i){
	                    rightNum+=nums[j];
	                }
	            }
	            if(leftNum == rightNum){
	                return i;
	            }
	        }
	        return -1;
	    }
	 
	 public static void main(String[] args) {
		 int[] nums = {1, 7, 3, 6, 5, 6};
		int mark = pivotIndex(nums);
		System.out.println("model nums mark is " + mark);
	}
}
