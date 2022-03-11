package leetcode160;

import java.util.HashMap;
import java.util.HashSet;

public class Solution16003 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if(i>k){
                set.remove(nums[i-k-1]);
            }
            if(!set.add(nums[i])){
               return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution16003 solution =  new Solution16003();
        int[] nums1  = {2,2};
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1,k1));
    }

}
