package leetcode12;

/**
 * @ClassName: Solution1201.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月4日 上午10:09:44 
 */
public class Solution1201 {
	public int removeDuplicates(int[] nums) {
        if(nums.length==0) {
        	return 0;
        }
        //慢指针
        int i =0;
        for (int j = 0; j < nums.length; j++) {
        	//快指针若不相等，就就移动慢指针，并赋值
			if(nums[i]!=nums[j]) {
				nums[++i]=nums[j];
			}
		}
        return i+1;
    }
}
