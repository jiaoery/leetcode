package leetcode131;

/**
 * 动态规划优化算法
 */
public class Solution13102 {
    public int climbStairs(int n) {
        int one =1;
        int two = 2;
        if(n==1){
            return one;
        }
        if(n==2){
            return two;
        }
        for (int i=3;i<=n;i++){
            int temp = one;
            one = two;
            two = one+temp;
        }
        return two;
    }

    public static void main(String[] args) {
        Solution13102 solution = new Solution13102();
        System.out.println("stair level 1 :"+solution.climbStairs(1));
        System.out.println("stair level 2 :"+solution.climbStairs(2));
        System.out.println("stair level 3 :"+solution.climbStairs(3));
        System.out.println("stair level 4 :"+solution.climbStairs(4));
        System.out.println("stair level 10:"+solution.climbStairs(10));
    }
}
