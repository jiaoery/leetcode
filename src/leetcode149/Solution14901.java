package leetcode149;


import java.util.Stack;

public class Solution14901 {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;
        int index = 0;
        //栈底元素，由于遍历从0开始，这里记录-1
        stack.push(-1);
        while (index<s.length()){
            char current  = s.charAt(index);
            //'('为有效位值开始处
            if (current == '('){
                stack.push(index);
            }else if (current==')'){
                stack.pop();
                //有效位置记录下当前最长自串
                if(!stack.isEmpty()){
                    result = Math.max(result,index - stack.peek());
                }else {
                    //记录上次最长子串被截断的部分
                    stack.push(index);
                }
            }
            index++;
        }
        return result;
    }

    public static void main(String[] args) {
        Solution14901 solution = new Solution14901();
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
