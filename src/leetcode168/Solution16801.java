package leetcode168;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: Solution16801<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/31 10:26<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16801 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));
        int res = 0;
        int end = intervals[0][1];
        for(int i = 1; i < intervals.length; i++){
            if(end <= intervals[i][0])
                end = intervals[i][1];
            else{
                end = Math.min(end, intervals[i][1]);
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Solution16801 solution =new Solution16801();
        int[][] nums = {{1,100},{11,22},{1,11},{2,12}};
        System.out.println(solution.eraseOverlapIntervals(nums));
    }
}
