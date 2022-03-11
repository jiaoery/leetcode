package leetcode160;

public class Solution16001 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if(k>nums.length){
            k = nums.length;
        }
        for(int i=0;i<=nums.length-k;i++){
            for(int j=1;j<=k;j++){
                if(i+j<nums.length&&nums[i]==nums[i+j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution16001 solution =  new Solution16001();
        int[] nums1  = {2,2};
        int k1 = 3;
        System.out.println(solution.containsNearbyDuplicate(nums1,k1));
    }
}
