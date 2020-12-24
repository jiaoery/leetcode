package leetcode93;

import java.util.Arrays;

/**
 * @ClassName: Solution9301.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��12��24�� ����11:15:38 
 */
public class Solution9301 {

	public int candy(int[] ratings) {
		int[] nums = new int[ratings.length];
		//��ʼ��һλС���ѻ��һ���ǹ�
		nums[0] = 1;
		//������
		for (int i = 1; i < ratings.length; i++) {
			//��������ң��ұߵ�С���ѱ��ַָ��ߣ��õ�����ߵ�С���Ѷ�һ����
			if(ratings[i]>ratings[i-1]) {
				nums[i]=nums[i-1]+1;
			}else {
				//��������1��ÿ��С���Ѷ�������һ����
				nums[i] = 1;
			}
		}
		
		//����һ��
		for (int i = ratings.length-1; i >0; i--) {
			//��������ң��ұߵ�С���ѱ��ַָ��ߣ��õ����ұߵ�С���Ѷ�һ����
			if(ratings[i-1]>ratings[i]&&nums[i-1]<=nums[i]) {
				nums[i-1]++;
			}
		}
		//ͳ�ƽ��
		int count =0;
		System.out.println(Arrays.toString(nums));
		for (int i = 0; i < nums.length; i++) {
			count+=nums[i];
		}
		return count;
    }
	
	public static void main(String[] args) {
		Solution9301 solution = new Solution9301();
		int[] rattings1 = {1,0,2};
		System.out.println("Rattings :"+Arrays.toString(rattings1)+", total:"+solution.candy(rattings1));
		
		int[] rattings2 = {1,2,2};
		System.out.println("Rattings :"+Arrays.toString(rattings2)+", total:"+solution.candy(rattings2));
		
		int[] rattings3 = {1,2,3,4,1,1,1,1};
		System.out.println("Rattings :"+Arrays.toString(rattings3)+", total:"+solution.candy(rattings3));
	}
}
