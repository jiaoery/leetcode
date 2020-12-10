package leetcode79;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: Solution7901.java
 * @Description:TODO(��һ�仰�������ļ���ʲô) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020��12��9�� ����3:12:55 
 */
public class Solution7901 {

	public int findMinDifference(List<String> timePoints) {
		int[] minutes = new int[timePoints.size()];
		for (int i = 0; i < minutes.length; i++) {
			String time = timePoints.get(i);
			minutes[i] = Integer.valueOf(time.substring(0, 2))*60+Integer.valueOf(time.substring(3, 5));
		}
		//����
		Arrays.sort(minutes);
		int min = Integer.MAX_VALUE;
		//��ȡ���������е���Сֵ
		for (int i = 0; i < minutes.length-1; i++) {
			//��Сʱ��Ϊ�㣬ֱ�ӷ���
			if(minutes[i]==minutes[i+1]) {
				return 0 ;
			}
			min = Math.min(min, minutes[i+1]-minutes[i]);
		}
		//����ʱ��
		return Math.min(min, 1440-minutes[timePoints.size()-1]+minutes[0]);
    }
	

}
