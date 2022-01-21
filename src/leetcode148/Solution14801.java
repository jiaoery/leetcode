package leetcode148;

import leetcode147.Solution14701;

import java.util.Stack;

public class Solution14801 {
    public boolean isValid(String code){
        //处理不是< >开头结尾的情况
        if(code.charAt(0)!='<'||code.charAt(code.length()-1)!='>'){
            return false;
        }
        Stack<String> stack = new Stack<>();
        int index = 0,length = code.length();
        while (index<length){
            if(code.charAt(index)=='<'){
                char next  = code.charAt(index+1);
                //筛选出 CDATA[
                if (next == '!'){
                    if(stack.size()==0){
                         return false;
                    }
                    index+=2;
                    if(index+7<=length && code.startsWith("[CDATA[", index)){
                        index+=7;
                        // 找对应的']]>'
                        while(index+3<=length && !code.startsWith("]]>", index)){
                            index++;
                        }
                        // 没找到
                        if(index>=length) return false;
                        index+=3;
                    }else {
                        return false;
                    }

                }else if (next == '/'){//结尾
                    //若本身无前置tag，不合法
                    if(stack.isEmpty()){
                        return false;
                    }
                    index+=2;
                    int tagSize = 0;
                    while (index<length&&code.charAt(index+tagSize)!='>'){
                        tagSize++;
                    }
                    if (index+tagSize>length||code.charAt(index+tagSize)!='>'){
                        return false;
                    }
                    String tag = code.substring(index,index+tagSize);
                    if(!stack.peek().equals(tag)){
                        return false;
                    }
                    stack.pop();
                    index += tagSize+1;
                }else{//开头<TAG_NAME >
                    //特殊处理 "<A></A><B></B>"
                    if(index!=0 && stack.size()==0) return false;
                    index++;
                    int tagSize = 0;
                    while (index<length&&Character.isUpperCase(code.charAt(index+tagSize))){
                        tagSize++;
                    }
                    // tag不合法
                    if(code.charAt(index+tagSize)!='>'||tagSize>9||tagSize<1) return false;
                    String tag = code.substring(index,index+tagSize);
                    stack.push(tag);
                    //+1 为了跳过 >
                    index+=tagSize+1;
                }
            }else if(stack.isEmpty()){//特殊处理<A></A>>
                return false;
            }
            else {
                index++;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Solution14801 solution =new Solution14801();
        System.out.println(solution.isValid("<DIV>This is the first line <![CDATA[<<<<<<<]]></DIV>"));
        System.out.println(solution.isValid("<A></A><B></B>"));
        System.out.println(solution.isValid("<TRUE><![CDATA[wahaha]]]><![CDATA[]> wahaha]]></TRUE>"));
        System.out.println(solution.isValid("<DIV>>>  ![cdata[]] <![CDATA[<div>]>]]>]]>>]</DIV>"));
        System.out.println(solution.isValid("</A></A></A></A>"));
         System.out.println(solution.isValid("<A></A>>"));
    }
}
