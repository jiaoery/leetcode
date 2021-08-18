package leetcode125;


public class Solution12501 {
    /**
     * 动态规划
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int ans  = nums[0];
        for (int i=0;i<nums.length;i++){
            sum = Math.max(sum+nums[i],nums[i]);
            ans = Math.max(sum,ans);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution12501 solution12501 = new Solution12501();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution12501.maxSubArray(nums));
    }
}
