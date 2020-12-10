package leetcode79;

import java.util.Arrays;
import java.util.List;

/**
 * @ClassName: Solution7901.java
 * @Description:TODO(用一句话描述该文件做什么) 
 * 
 * @author  jixiang
 * @version v1.0.0 
 * @Date    2020年12月9日 下午3:12:55 
 */
public class Solution7901 {

	public int findMinDifference(List<String> timePoints) {
		int[] minutes = new int[timePoints.size()];
		for (int i = 0; i < minutes.length; i++) {
			String time = timePoints.get(i);
			minutes[i] = Integer.valueOf(time.substring(0, 2))*60+Integer.valueOf(time.substring(3, 5));
		}
		//排序
		Arrays.sort(minutes);
		int min = Integer.MAX_VALUE;
		//获取所有数据中的最小值
		for (int i = 0; i < minutes.length-1; i++) {
			//最小时间为零，直接返回
			if(minutes[i]==minutes[i+1]) {
				return 0 ;
			}
			min = Math.min(min, minutes[i+1]-minutes[i]);
		}
		//跨天时间
		return Math.min(min, 1440-minutes[timePoints.size()-1]+minutes[0]);
    }
	

}
