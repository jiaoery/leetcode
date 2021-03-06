package leetcode120;

/**
 * ClassName: Solution12002<br/>
 * Description: 动态规划算法进阶
 * date: 2021/4/13 15:39<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution12002 {
    public int maxSubArray(int[] nums) {
        if(nums==null||nums.length==0){
            return Integer.MIN_VALUE;
        }
        int current= nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            current = Math.max(current+nums[i],nums[i]);
            max = Math.max(max,current);
        }
        return max;
    }

    public static void main(String[] args) {
        Solution12002 solution12001 =  new Solution12002();
        int[] nums1 ={-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution12001.maxSubArray(nums1));
    }
}
