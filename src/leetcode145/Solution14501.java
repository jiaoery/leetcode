package leetcode145;

import java.util.Stack;

public class Solution14501 {
    public int calculate(String s) {
        Stack<Integer> numStack = new Stack<>();
        int result=0;
        int count= 0;
        char sign = '+';
        for (int i = 0;i<s.length();i++){
            char index  = s.charAt(i);
            if(index>'0'){
                count = count * 10 + s.charAt(i) - '0';
            }
            if((index!=' '&&index<'0')|| i == s.length() - 1){
                switch (sign){
                    case '+':
                        numStack.push(count);
                        break;
                    case '-':
                        numStack.push(-count);
                        break;
                    case '*':
                        numStack.push(numStack.pop()*count);
                        break;
                    case '/':
                        numStack.push(numStack.pop()/count);
                        break;
                    default:
                }
                sign = index;
                count = 0;
            }
        }

        while (!numStack.isEmpty()){
            result += numStack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        Solution14501 solution = new Solution14501();
        String s1 = "3+2*2";
        System.out.println("input:"+s1+"="+solution.calculate(s1));

        String s2 = " 3/2 ";
        System.out.println("input:"+s2+"="+solution.calculate(s2));

        String s3 = " 3+5 / 2 ";
        System.out.println("input:"+s3+"="+solution.calculate(s3));

        String s4 = " 42 ";
        System.out.println("input:"+s4+"="+solution.calculate(s4));

        String s5 = " 0-42 ";
        System.out.println("input:"+s5+"="+solution.calculate(s5));
    }
}
