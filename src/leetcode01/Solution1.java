package leetcode01;

import java.util.HashMap;

/**
 * @ClassName: Solution1.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��7��7�� ����6:17:00 
 */
public class Solution1 {
	/**
	  *   ��ȡHashMap����ɣ������㷨��ʱ�临�Ӷ�ΪO(n),�ռ临�Ӷ�ΪS(n)
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map =new HashMap<>();
        int j ;
        for(int i=0;i<nums.length;i++){
            j = target - nums[i];
            if(map.containsKey(j)){
                return new int[]{map.get(j),i};
            } else{
                map.put(nums[i],i);
            }
        }
        throw new RuntimeException("there has no number match the target");
    }
	
	/**
	 *   �����ƥ�䷽ʽ����ȡ��������ѭ��.ʱ�临�Ӷ�ΪO(n^2),�ռ临�Ӷ�ΪS(1)
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int[] twoSum1(int[] nums, int target) {
        for(int i = 0;i<nums.length;i++) {
        	for(int j=i+1;j<nums.length;j++) {
        		if(nums[i]+nums[j]==target) {
        			return new int[] {i,j};
        		}
        	}
        }
        throw new RuntimeException("there has no number match the target");
    }
	
	
	public static void main(String[] args) {
		int[] nums = {2, 7, 11, 15};
		int target = 9;
		System.out.println("provide nums :");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		System.out.println("target num is "+target);
		int[] targetNums = twoSum(nums, target);
		System.out.println("target nums row is :");
		for (int i = 0; i < targetNums.length; i++) {
			System.out.println(targetNums[i]);
		}
		
	}
}
