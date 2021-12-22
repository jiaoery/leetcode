package leetcode142;

import java.util.Arrays;
import java.util.Stack;

public class Solution14201 {
    public int calPoints(String[] ops) {
        if(ops.length==0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            switch (ops[i]){
                case "C":
                   sum -= stack.pop();
                    break;
                case "D":
                    sum += stack.push(stack.peek()*2);
                    break;
                case "+":
                    int temp1 = stack.pop();
                    int temp2 = stack.peek();
                    stack.push(temp1);
                    sum += stack.push(temp1+temp2);
                    break;
                default:
                    sum += stack.push(Integer.parseInt(ops[i]));
                    break;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Solution14201 solution = new Solution14201();
        String[] ops1 = {"5","2","C","D","+"};
        System.out.println("Arrays:"+ Arrays.toString(ops1)+";result:"+solution.calPoints(ops1));

        String[] ops2 = {"5","-2","4","C","D","9","+","+"};
        System.out.println("Arrays:"+ Arrays.toString(ops2)+";result:"+solution.calPoints(ops2));
    }
}
