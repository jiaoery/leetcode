package leetcode130;

import java.util.Arrays;

public class Solution13001 {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=val){
                nums[count++] = nums[i];
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Solution13001 solution = new Solution13001();
        int[] nums1 = {3,2,2,3};
        int val1 = 3;
        System.out.println("result:"+solution.removeElement(nums1,val1));

        int[] nums2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;
        System.out.println("result:"+solution.removeElement(nums2,val2));
    }
}
