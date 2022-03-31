package leetcode169;

/**
 * ClassName: Solution16902<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/31 14:22<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16902 {
    //摩尔投票法
    public int majorityElement(int[] nums) {
        int count = 1;
        int target = nums[0];
        for(int i=1;i<nums.length;i++){
            if(target==nums[i]){
                count++;
            }else if(count!=0){
                count--;
            }else{
                count=1;
                target = nums[i];
            }
        }
        return target;
    }

    public static void main(String[] args) {
        Solution16902 solution  = new Solution16902();
        int[] nums = {3,2,3};
        System.out.println(solution.majorityElement(nums));
    }
}
