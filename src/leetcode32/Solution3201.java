package leetcode32;

/**
 * @ClassName: Solution3201.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��9��7�� ����2:17:25 
 */
public class Solution3201 {

	public boolean checkPossibility(int[] nums) {
        if(nums==null||nums.length<=0){
            return true;
        }
        int count = 0;
        //��ֹ��Դ�˷�
        for(int i =1;i<nums.length&& count < 2;i++){
        	if (nums[i-1] <= nums[i]) {
    			continue;
    		}
        	count++;
        	//������м�λ�ã��򽫸�λ������ǰһ����ͬ��
        	if(i-2>=0&&nums[i-2]>nums[i]) {
        		nums[i] = nums[i-1];
        	}else { 
        		//��Ϊ����ߵ�������������Ϊ�Աߵ���
				nums[i-1] = nums[i];
			}
        	
        }
        return count<=1;
    }
}
