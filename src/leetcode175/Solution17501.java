package leetcode175;

/**
 * ClassName: Solution17501<br/>
 * Description: TODO Description. <br/>
 * date: 2022/5/5 10:28<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17501 {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k==0) return 0;
        int sum = 1;
        int count = 0;
        int left  = 0;
        int right = 0;
        while(right< nums.length){
            sum *= nums[right++];
            while (left<right&&sum>=k){
                sum /= nums[left++];
            }
            count += right-left;
        }
        return count;
    }

    public static void main(String[] args) {
        Solution17501 solution = new Solution17501();
        int[] nums = {10,5,2,6};
        int k = 100;
        System.out.println(solution.numSubarrayProductLessThanK(nums,k));
    }
}
