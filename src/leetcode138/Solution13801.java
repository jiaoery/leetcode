package leetcode138;

import java.util.Arrays;
import java.util.Stack;

public class Solution13801 {

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            //is number？
            if(isNumber(tokens[i])){
                stack.push(Integer.parseInt(tokens[i]));
            }else {
                int num1 = stack.pop();
                int num2 = stack.pop();
                //deal calculate
                switch (tokens[i]){
                    case "+":
                        stack.push(num1+num2);
                        break;
                    case "-":
                        stack.push(num2-num1);
                        break;
                    case "*":
                        stack.push(num1*num2);
                        break;
                    case "/":
                        stack.push(num2/num1);
                        break;
                    default:
                }
            }
        }
        return stack.pop();
    }

    public boolean isNumber(String token) {
        return !("+".equals(token) || "-".equals(token) || "*".equals(token) || "/".equals(token));
    }

    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Solution13801 solution = new Solution13801();
        int result = solution.evalRPN(tokens);
        System.out.println("tokens:"+ Arrays.toString(tokens)+";result:"+result);
    }

}
