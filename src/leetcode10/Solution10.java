package leetcode10;

/**
 * @ClassName: Solution10.java
 * @Description:遍历法
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年7月31日 下午4:11:09 
 */
public class Solution10 {
	
	public int findMagicIndex(int[] nums) {
		if(nums.length<1||nums.length>1000000) {
			throw new RuntimeException("array's length out of limit");
		}
        for(int i =0;i<nums.length;i++){
            if(nums[i]==i){
                return i;
            }
        }
        return -1;
    }
}
