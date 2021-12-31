package leetcode144;

import leetcode143.Solution14301;

import java.util.Stack;

public class Solution14401 {
    class Node{
        public Node(int level, int sum) {
            this.level = level;
            this.sum = sum;
        }

        public int level;
        public int sum;
    }
    public int lengthLongestPath(String input) {
        String[] path = input.split("\n");
        Stack<Node> stack = new Stack<>();
        int result = 0;
        for (int i = 0; i < path.length; ) {
            int level = countLevel(path[i]);
            if(stack.isEmpty()){
                if(path[i].indexOf('.')!=-1){
                    result = Math.max(result,path[i].length());
                }else {
                    stack.push(new Node(level,path[i].length()-level));
                }
                i++;
            }else {
                //对比是否为上下级关系
                Node peek = stack.peek();
                if(peek.level+1==level){
                    Node newNode = new Node(level, path[i].length() + peek.sum - level + 1);
                    if(path[i].indexOf(".")!=-1){
                        result = Math.max(result,newNode.sum);
                    }else {
                        stack.push(newNode);
                    }
                    i++;
                }else {
                    stack.pop();
                }
            }
        }
        return result;
    }

    /**
     * 计算输入路径的level等级
     * @param path
     * @return
     */
    public int countLevel(String path){
        int count = 0;
        StringBuilder builder = new StringBuilder();
        for (int i=0;;i++){
            builder.append("\t");
            if(path.contains(builder)){
                count++;
            }else {
                break;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Solution14401 solution = new Solution14401();
        String input1 = "dir\n\tsubdir1\n\tsubdir2\n\t\tfile.ext";
        System.out.println("input:"+input1+";result:"+solution.lengthLongestPath(input1));

//        String input2 =  "a";
//        System.out.println("input:"+input2+";result:"+solution.countLevel(input2));
//
//        String input3 = "file1.txt\nfile2.txt\nlongfile.txt";
//        System.out.println("input:"+input3+";result:"+solution.countLevel(input3));
    }
}
