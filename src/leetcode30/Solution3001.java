package leetcode30;


/**
 * @ClassName: Solution3001.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��31�� ����10:32:23 
 */
public class Solution3001 {
	 public int minMoves(int[] nums) {
		 //�±�
		 int max=nums.length-1,min=0,count=0;
		 while(true) {
			 for (int j = 0; j < nums.length; j++) {
				if(nums[min]>nums[j]) {
					min = j;
				}
				if(nums[max]<nums[j]) {
					max = j;
				}
			}
			 //����ﵽ����
			 if(nums[max] == nums[min]) {
				 break;
			 }
			 //�����ֵ�⣬����λ�ö��Լ�1
			for (int i = 0; i < nums.length; i++) {
				if(i!=max) {
					nums[i]++;
				}
			}
			count++;
		 }
		 return count;
	 }
	 
	 public static void main(String[] args) {
		int[] nums = {1,2,3};
		System.out.println("result:"+new Solution3001().minMoves(nums));
	}

}
