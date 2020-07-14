package leetcode04;

/**
 * @ClassName: Solution04.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年7月14日 下午3:55:51 
 */
public class Solution04 {
	/**
	 * 查询或插入指定数据
	 * @param nums 顺序数组
	 * @param target 指定数据
	 * @return 插入或查询位置
	 */
	public static int searchInsert(int[] nums, int target) {
        if(nums == null){
            throw new RuntimeException("the arrows is null");
        }
      
        for(int i =0 ;i<nums.length;i++){
             if(target<=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
	
	
	public static void main(String[] args) {
		int[] nums1 = {1,3,5,6};
		int target1 = 7;
		int row = searchInsert(nums1, target1);
		System.out.println("search or insert row is "+row);
	
	}
}
