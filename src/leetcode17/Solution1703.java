package leetcode17;


/**
 * @ClassName: Solution1703.java
 * @Description:�ŵ�ָ����λ��
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��12�� ����11:21:56 
 */
public class Solution1703 {
	public int findRepeatNumber(int[] nums) {
		  for (int i = 0; i < nums.length; i++) {
			  //λ�ö�Ӧ��ȷ����������ѭ��
			  if(nums[i]==i) {
				  continue;
			  }
			  if(nums[i]==nums[nums[i]]) {
				  return nums[i];
			  }
			//����
	            int temp = nums[nums[i]];
	            nums[nums[i]] = nums[i];
	            nums[i] = temp;
	            //�����i--��Ϊ�˵����������i++��
	            //����֮����Ҫԭ���ٱȽ�
	            i--;
		  }
		  return -1;
	 }
}
