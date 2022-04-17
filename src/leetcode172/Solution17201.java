package leetcode172;

public class Solution17201 {
    public boolean validPalindrome(String s) {
        int start  =0;
        int end = s.length()-1;
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
               return valid(s,start+1,end)||valid(s,start,end-1);
            }
            start++;
            end--;
        }
        return true;
    }

    public boolean valid(String s,int start,int end){
        while (start<end){
            if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution17201 solution = new Solution17201();
        String s1 = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.printf("result:"+solution.validPalindrome(s1));
    }
}
