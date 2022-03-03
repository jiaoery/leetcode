package leetcode157;

import java.util.HashMap;

/**
 * ClassName: Solution15701<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/3 11:38<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution15701 {
    public int findPairs(int[] nums, int k) {
        //特殊处理k为负数
        if(k<0)return 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result = 0;
        //若是为0,需要存在两个以上一样的数
        if(k==0){
            for(int num:map.keySet()){
                if(map.getOrDefault(num,0)==2){
                    result++;
                }
            }
        } else{//若不为零，就需要寻找目标值
            for(int num:map.keySet()){
                if(map.containsKey(num+k)){
                    result++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Solution15701 solution = new Solution15701();
        int[] nums ={3,1,4,1,5};
        int k = 0;
        System.out.println(solution.findPairs(nums,k));
    }
}
