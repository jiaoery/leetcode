package leetcode12;

/**
 * @ClassName: Solution1201.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��8��4�� ����10:09:44 
 */
public class Solution1201 {
	public int removeDuplicates(int[] nums) {
        if(nums.length==0) {
        	return 0;
        }
        //��ָ��
        int i =0;
        for (int j = 0; j < nums.length; j++) {
        	//��ָ��������ȣ��;��ƶ���ָ�룬����ֵ
			if(nums[i]!=nums[j]) {
				nums[++i]=nums[j];
			}
		}
        return i+1;
    }
}
