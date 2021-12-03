package leetcode135;

import java.util.Arrays;

public class Solution13501 {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for (int i =0;i<nums.length;i++){
            if(k>0&&(nums[i]<=0)){
               k--;
               min = Math.min(min,-nums[i]);
               sum +=-nums[i];
            }else {
                sum += nums[i];
                min = Math.min(min,nums[i]);
            }
        }
        if(k>0&&(k&1)==1){
            sum = sum - 2*min;
        }
        return sum;
    }


    public static void main(String[] args) {
        Solution13501 solution = new Solution13501();
        int[] nums1 = {4,2,3};
        int k1 = 1;
        System.out.println("reslut :"+solution.largestSumAfterKNegations(nums1,k1));

        int[] nums2 = {3,-1,0,2};
        int k2 = 3;
        System.out.println("reslut :"+solution.largestSumAfterKNegations(nums2,k2));

        int[] nums3 = {2,-3,-1,5,-4};
        int k3 = 2;
        System.out.println("reslut :"+solution.largestSumAfterKNegations(nums3,k3));

        int[] nums4 = {4,3,2};
        int k4 = 1;
        System.out.println("reslut :"+solution.largestSumAfterKNegations(nums4,k4));
    }
}
