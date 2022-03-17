package leetcode161;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * ClassName: Solution16101<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/17 14:40<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16101 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        //处理特殊情况
        if(nums==null || nums.length<3) return res;
        //对数组进行排序
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            //当第一个元素已经为正数时，不存在正数相加等于0
            if (nums[i]>0) return res;
            //第一个元素存在重复元素
            if(i>0&&nums[i]==nums[i-1]) continue;
            //使用左右指针方法
            int left = i+1,right = nums.length-1;
            while(left<right){
                int sum = nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                }else {//相同时记录
                    List<Integer> list= new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    res.add(list);
                    //避免第二个元素存在相同元素
                    while(left < right && nums[left+1] == nums[left])left++;
                    //避免第三个元素存在相同元素
                    while (left < right && nums[right-1] == nums[right]) right--;
                    left++;
                    right--;
                }
            }
        }

        return res;
    }



    public static void main(String[] args) {
        Solution16101 solution = new Solution16101();
        int[] nums1 = {-2,0,0,2,2};
        System.out.println(solution.threeSum(nums1));
    }
}
