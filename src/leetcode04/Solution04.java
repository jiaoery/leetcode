package leetcode04;

/**
 * @ClassName: Solution04.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��7��14�� ����3:55:51 
 */
public class Solution04 {
	/**
	 * ��ѯ�����ָ������
	 * @param nums ˳������
	 * @param target ָ������
	 * @return ������ѯλ��
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
