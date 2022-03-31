package leetcode169;

import java.util.Arrays;

/**
 * ClassName: Solution16901<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/31 11:13<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16901 {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length >> 1];
    }

    public static void main(String[] args) {
        Solution16901 solution  = new Solution16901();
        int[] nums = {3,2,3};
        System.out.println(solution.majorityElement(nums));
    }
}
