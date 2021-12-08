package leetcode138;

import java.util.Arrays;

public class Solution13802 {
    public int evalRPN(String[] tokens) {
        int index = -1;
        int  length = tokens.length;
        int[] stack = new int[(length+1)/2];
        for (int i = 0; i <length ; i++) {
            switch (tokens[i]){
                case "+":
                    index--;
                    stack[index]+= stack[index+1];
                    break;
                case "-":
                    index--;
                    stack[index]-= stack[index+1];
                    break;
                case "*":
                    index--;
                    stack[index]*= stack[index+1];
                    break;
                case "/":
                    index--;
                    stack[index]/= stack[index+1];
                    break;
                default:
                    index++;
                    stack[index] =Integer.parseInt(tokens[i]);
            }
        }
        return stack[index];
    }

    public static void main(String[] args) {
        String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        Solution13802 solution = new Solution13802();
        int result = solution.evalRPN(tokens);
        System.out.println("tokens:"+ Arrays.toString(tokens)+";result:"+result);
    }
}
