package leetcode173;

import java.util.Arrays;

/**
 * ClassName: Solution17301<br/>
 * Description: TODO Description. <br/>
 * date: 2022/4/28 16:23<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17302 {
    public int[] sortArrayByParity(int[] nums) {
        //双指针
        int left =0;
        int right =nums.length-1;
        while(left<right){
            //先找到第一个需要交换的奇数
            while(left<right&&((nums[left]&1)==0)){
                left++;
            }
            //找到后面需要交换的偶数
            while(left<right&&((nums[right]&1)!=0)){
               right--;
            }

            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        Solution17302 solution17301 = new Solution17302();
        int[] nums ={3,1,2,4};
        System.out.println("Before:"+ Arrays.toString(nums)+";after:"+Arrays.toString(solution17301.sortArrayByParity(nums)));
    }
}
