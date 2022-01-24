package leetcode149;

public class Solution14902 {
    public int longestValidParentheses(String s) {
        int index = 1,length = s.length(),maxLength =0;
        //动态规划数组
        int[] dp = new int[length];
        while (index<length){
            if(s.charAt(index)==')'){
                if(s.charAt(index-1)=='('){
                    //前面是否还有元素
                    if(index-2>=0){
                        dp[index] = 2+dp[index-2];
                    }else {
                        dp[index] = 0;
                    }
                }//之前的有效位置
                else if(s.charAt(dp[index-1-dp[index-1]])=='('){
                    if (index - dp[index - 1] - 2 >= 0) {//以i-1结尾的有效字符在向前看2个位置 如果>=于0
                        //当前状态=以i-1结尾的有效字符长度 + 当前匹配2个有效括号 + 以i - dp[i - 1] - 2结尾的有效字符长度
                        dp[index] = dp[index - 1] + 2 + dp[index - dp[index - 1] - 2];
                    } else {
                        //以i-1结尾的有效字符在向前看2个位置 如果<于0
                        //当前状态=以i-1结尾的有效字符长度 + 当前匹配2个有效括号
                        dp[index] = dp[index - 1] + 2;
                    }
                }
            }
            maxLength = Math.max(maxLength,dp[index]);
            index++;
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Solution14902 solution = new Solution14902();
        String s1 = "(()())(()))";
        System.out.println("Input:"+s1+";result:"+solution.longestValidParentheses(s1));

        String s2 = ")()((())";
        System.out.println("Input:"+s2+";result:"+solution.longestValidParentheses(s2));

        String s3 = "))((";
        System.out.println("Input:"+s3+";result:"+solution.longestValidParentheses(s3));

        String s4 = ")()())";
        System.out.println("Input:"+s4+";result:"+solution.longestValidParentheses(s4));

        String s5 = ")()())";
        System.out.println("Input:"+s5+";result:"+solution.longestValidParentheses(s5));

    }
}
