package leetcode136;

public class Solution13601 {
    public String truncateSentence(String s, int k) {
        int index = 0;
        while (index<s.length()){
            if(s.charAt(index)==' '){
                k--;
            }
            if(k>0){
                index++;
            }else{
                break;
            }
        }
        return s.substring(0,index);
    }

    public static void main(String[] args) {
        Solution13601 solution = new Solution13601();
        String s1 = "Hello how are you Contestant";
        int k1 = 4;
        System.out.println("result:"+solution.truncateSentence(s1,k1));

        String s2 = "What is the solution to this problem";
        int k2 = 4;

        System.out.println("result:"+solution.truncateSentence(s2,k2));
    }
}
