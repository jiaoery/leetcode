package leetcode151;

import java.util.Stack;

public class Solution15101 {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        int num = 0;
        String current = new String();
        for (int i = 0; i < s.length(); i++) {
            char cur  = s.charAt(i);
            //若为数字时，计数
            if(Character.isDigit(cur)){
                num = 10*num+cur-'0';
            }else if(Character.isLetter(cur)){
                //字符追加
                current+=cur;
            }else if ('['==cur){//[入栈
                numStack.push(num);
                strStack.push(current);
                current = "";
                num=0;
            }else if(']'==cur){//]出栈
                String temp = "";
                int k = numStack.pop();
                for (int j = 0; j < k; j++) {
                    temp += current;
                }
                current = strStack.pop()+temp;
            }
        }
        return current;
    }


    public static void main(String[] args) {
        Solution15101 solution = new Solution15101();
        String str1 = "3[a]2[bc]";
        System.out.println(solution.decodeString(str1));

        String str2 = "3[a2[c]]";
        System.out.println(solution.decodeString(str2));

        String str3= "2[abc]3[cd]ef";
        System.out.println(solution.decodeString(str3));
    }
}
