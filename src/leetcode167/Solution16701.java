package leetcode167;

import java.util.Arrays;
import java.util.Stack;

/**
 * ClassName: Solution16701<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/30 11:14<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16701 {
    public int[] asteroidCollision(int[] asteroids) {
        //反方向
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty()||asteroid>0) {
                stack.add(asteroid);
            } else if(stack.peek()<0){
                stack.add(asteroid);
            }else {
                while (true){
                    //无对手了
                    if(stack.isEmpty()){
                        stack.add(asteroid);
                        break;
                    }
                    int batttle  = stack.peek();
                    //已經战胜所有的正向
                    if(batttle<0){
                        stack.add(asteroid);
                        break;
                    }else if(batttle+asteroid>0){
                        break;
                    }else if (batttle+asteroid==0){
                        stack.pop();
                        break;
                    }else {
                        stack.pop();
                    }
                }
            }
        }
        int size = stack.size();
        int[] result = new int[size];
        int index = size - 1;
        while (index >= 0) {
            result[index--] = stack.pop();
        }
        return result;
    }

    public static void main(String[] args) {
        Solution16701 solution = new Solution16701();
        int[] nums = {5, 10, -5};
        System.out.println("Input:"+ Arrays.toString(nums)+";result:"+Arrays.toString(solution.asteroidCollision(nums)));
        int[] nums1 = {5, -10, -5};
        System.out.println("Input:" + Arrays.toString(nums1) + ";result:" + Arrays.toString(solution.asteroidCollision(nums1)));
    }
}
