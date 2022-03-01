package leetcode155;

import java.util.HashSet;

/**
 * ClassName: Solution155<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/1 14:25<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution15501 {
    public boolean isHappy(int n) {
        HashSet<Integer> nums = new HashSet<>();
        while(!nums.contains(n)){
            nums.add(n);
            int sum = 0;
            while(n>0){
                sum+= (n%10)* (n%10);
                n/=10;
            }
            if(sum==1){
                return true;
            }else{
                n = sum;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution15501 solution = new Solution15501();
        System.out.println("result:"+solution.isHappy(1));
    }
}
