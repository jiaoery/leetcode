package leetcode21;

/**
 * @ClassName: Solution1201.java
 * @Description:������ 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��18�� ����10:14:19 
 */
public class Solution2101 {
	
	public int[] findErrorNums(int[] nums) {
		//dup�ظ�λ�� ��missing ȱʧԪ��
		 int dup = -1, missing = -1;
		 //i ȡS�ļ���ֵ
	        for (int i = 1; i <= nums.length; i++) {
	            int count = 0;
	            for (int j = 0; j < nums.length; j++) {
	                if (nums[j] == i)
	                    count++;
	            }
	            //�����ݼ������Σ��ظ�
	            if (count == 2)
	                dup = i;
	            //δ�����㣬����ȱʧ
	            else if (count == 0)
	                missing = i;
	            //����Ѿ��ҵ��������ǰ����ѭ��
	            if (dup > 0 && missing > 0)
	                break;
	        }
	        return new int[] {dup, missing};
	    }

}
