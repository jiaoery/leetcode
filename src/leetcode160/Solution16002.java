package leetcode160;

import java.util.HashMap;

public class Solution16002 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k){
                return true;
            }
            map.put(nums[i],i);
        }
        return false;
    }

    public static void main(String[] args) {
        Solution16002 solution =  new Solution16002();
        int[] nums1  = {2,2};
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1,k1));
    }
}
