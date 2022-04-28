package leetcode173;

import java.util.Arrays;

/**
 * ClassName: Solution17301<br/>
 * Description: TODO Description. <br/>
 * date: 2022/4/28 16:53<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17301 {
    public int[] sortArrayByParity(int[] nums) {
        int[] res =new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for (int i = 0; i <nums.length ; i++) {
            if((nums[i]&1)==0){
                res[left++] = nums[i];
            }else {
                res[right--] = nums[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Solution17301 solution = new Solution17301();
        int[] nums ={3,1,2,4};
        System.out.println("Before:"+ Arrays.toString(nums)+";after:"+Arrays.toString(solution.sortArrayByParity(nums)));
    }
}
