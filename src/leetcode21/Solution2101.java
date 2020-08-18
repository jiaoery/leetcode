package leetcode21;

/**
 * @ClassName: Solution1201.java
 * @Description:暴力法 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年8月18日 上午10:14:19 
 */
public class Solution2101 {
	
	public int[] findErrorNums(int[] nums) {
		//dup重复位置 ，missing 缺失元素
		 int dup = -1, missing = -1;
		 //i 取S的集合值
	        for (int i = 1; i <= nums.length; i++) {
	            int count = 0;
	            for (int j = 0; j < nums.length; j++) {
	                if (nums[j] == i)
	                    count++;
	            }
	            //该数据计算两次，重复
	            if (count == 2)
	                dup = i;
	            //未被计算，代表缺失
	            else if (count == 0)
	                missing = i;
	            //如果已经找到结果，提前结束循环
	            if (dup > 0 && missing > 0)
	                break;
	        }
	        return new int[] {dup, missing};
	    }

}
