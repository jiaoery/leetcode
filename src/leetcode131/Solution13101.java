package leetcode131;

/**
 * 递归实现
 */
public class Solution13101 {
    public int climbStairs(int n) {
        //1层楼只有一个
        if(n==1){
            return 1;
        }else if (n==2){
            return 2;
        }else {
            return climbStairs(n-2)+climbStairs(n-1);
        }
    }

    public static void main(String[] args) {
        Solution13101 solution = new Solution13101();
        System.out.println("stair level 1 :"+solution.climbStairs(1));
        System.out.println("stair level 2 :"+solution.climbStairs(2));
        System.out.println("stair level 3 :"+solution.climbStairs(3));
        System.out.println("stair level 4 :"+solution.climbStairs(4));
        System.out.println("stair level 10:"+solution.climbStairs(10));
    }
}
