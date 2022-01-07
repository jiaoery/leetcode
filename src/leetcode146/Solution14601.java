package leetcode146;

import java.util.Stack;

public class Solution14601 {
    public int calculate(String s) {
        Stack<Integer> signStack = new Stack<>();
        int count = 0;
        int sign = 1;
        int result = 0;
        int i = 0;
        signStack.push(sign);
        while (i < s.length()) {
            switch (s.charAt(i)) {
                case ' ':
                    i++;
                    break;
                case '+':
                    sign = signStack.peek();
                    i++;
                    break;
                case '-':
                    sign = -signStack.peek();
                    i++;
                    break;
                case '(':
                    signStack.push(sign);
                    i++;
                    break;
                case ')':
                    signStack.pop();
                    i++;
                    break;
                default:
                    while (i < s.length() && Character.isDigit(s.charAt(i))) {
                        count = count * 10 + s.charAt(i) - '0';
                        i++;
                    }
                    result += count*sign;
                    break;
            }
            count = 0;
        }
        return result;

    }

    public static void main(String[] args) {
        Solution14601 solution = new Solution14601();
        String s1 =  "1 + 1";
        System.out.println("input :"+s1+";result:"+solution.calculate(s1));

        String s2 = " 2-1 + 2 ";
        System.out.println("input :"+s2+";result:"+solution.calculate(s2));

        String s3 = "(1+(4+5+2)-3)+(6+8)";
        System.out.println("input :"+s3+";result:"+solution.calculate(s3));

        String s4 = "-(3+2)";
        System.out.println("input :" + s4 + ";result:" + solution.calculate(s4));

    }
}
