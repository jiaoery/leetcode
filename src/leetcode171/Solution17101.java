package leetcode171;

/**
 * ClassName: Solution17101<br/>
 * Description: TODO Description. <br/>
 * date: 2022/4/13 10:26<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution17101 {
    public int integerBreak(int n) {
        if(n==2) return 1;
        if(n==3) return 2;
        if(n==4) return 4;
        int max  =1;
        while(n>4){
            max *=3;
            n-=3;
        }
        return max*n;
    }

    public static void main(String[] args) {
        Solution17101 solution = new Solution17101();
        for (int i=2;i<=58;i++){
            System.out.println("if(n=="+i+") return "+solution.integerBreak(i)+";");
        }
    }
}
