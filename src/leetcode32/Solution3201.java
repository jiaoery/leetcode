package leetcode32;

/**
 * @ClassName: Solution3201.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年9月7日 下午2:17:25 
 */
public class Solution3201 {

	public boolean checkPossibility(int[] nums) {
        if(nums==null||nums.length<=0){
            return true;
        }
        int count = 0;
        //防止资源浪费
        for(int i =1;i<nums.length&& count < 2;i++){
        	if (nums[i-1] <= nums[i]) {
    			continue;
    		}
        	count++;
        	//如果在中间位置，则将该位置数和前一个数同步
        	if(i-2>=0&&nums[i-2]>nums[i]) {
        		nums[i] = nums[i-1];
        	}else { 
        		//若为最左边的数，则将其设置为旁边的数
				nums[i-1] = nums[i];
			}
        	
        }
        return count<=1;
    }
}
