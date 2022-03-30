package leetcode167;

import java.util.Arrays;
import java.util.Stack;

/**
 * ClassName: Solution16702<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/30 13:56<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16702 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        int index=0;
        int n = asteroids.length;
        while (index<n){
            //如何碰撞条件
            if(!stack.isEmpty()&&stack.peek()>0&&asteroids[index]<0){
                if(stack.peek()<-asteroids[index]){//若反方向的行星较大
                    stack.pop();
                }else if(stack.peek()>-asteroids[index]){//若正方向的行星较大
                    index++;
                }else{
                    stack.pop();
                    index++;
                }
            }else {
                stack.push(asteroids[index++]);
            }
        }
        int[] result = new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            result[i] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Solution16702 solution = new Solution16702();
        int[] nums = {5, 10, -5};
        System.out.println("Input:"+ Arrays.toString(nums)+";result:"+Arrays.toString(solution.asteroidCollision(nums)));
        int[] nums1 = {5, -10, -5};
        System.out.println("Input:" + Arrays.toString(nums1) + ";result:" + Arrays.toString(solution.asteroidCollision(nums1)));
    }
}
