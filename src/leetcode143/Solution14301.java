package leetcode143;

import java.util.Stack;

public class Solution14301 {
    public String simplifyPath(String path) {
        Stack<String> stack =new Stack<>();
        StringBuilder reslut = new StringBuilder();
        for (String paths:path.split("/")){
            if (!stack.isEmpty()&&paths.equals("..")){
                stack.pop();
            }else if("..".contains(paths)){
                continue;
            }else {
                stack.push(paths);
            }

        }
        for (String r:stack){
            reslut.append("/"+r);
        }
        return reslut.length()==0?"/":reslut.toString();
    }

    public static void main(String[] args) {
        Solution14301 solution = new Solution14301();
        String path1 = "/home/";
        System.out.println("path:"+path1+";result:"+solution.simplifyPath(path1));

        String path2 = "/../";
        System.out.println("path:"+path2+";result:"+solution.simplifyPath(path2));

        String path3 = "/home//foo/././rr";
        System.out.println("path:"+path3+";result:"+solution.simplifyPath(path3));
    }
}
