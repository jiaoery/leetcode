package leetcode30;


/**
 * @ClassName: Solution3003.java
 * @Description:��ѧ��
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��31�� ����2:17:31 
 */
public class Solution3003 {
	 public int minMoves(int[] nums) {
		 int min =Integer.MAX_VALUE;
		 int count = 0;
		 //Ѱ����������Сֵ
		for (int i = 0; i < nums.length; i++) {
			min = Math.min(min, nums[i]);
		}
		//�����ƶ�����
		for (int i = 0; i < nums.length; i++) {
			count += nums[i]-min;
		}
		return count;
	 }
	 
	 
	 public static void main(String[] args) {
			int[] nums = {1,2,3,999};
			System.out.println("result:"+new Solution3001().minMoves(nums));
		}

}
