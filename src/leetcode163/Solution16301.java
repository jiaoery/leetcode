package leetcode163;

import leetcode162.Solution16201;

import java.util.HashMap;

/**
 * ClassName: Solution16301<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/23 10:57<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16301 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        if(s.length()==1) return 1;
        HashMap<Character,Integer> map =new HashMap<>();
        int length = Integer.MIN_VALUE;
        int index = 0;
        //标记头部位置
        int head = -1;
        while(index<s.length()){
            char current = s.charAt(index);
            if(map.containsKey(current)&&map.get(current)>head){
                length = Math.max(length,index-head-1);
                head = map.get(current);
            }
            map.put(current,index);
            index++;
        }
        length = Math.max(length,s.length()-head-1);
        return length;
    }

    public static void main(String[] args) {
        Solution16301 solution = new Solution16301();
        String[] s1 = {"a","au","abb","aab"};
        for (int i = 0; i < s1.length; i++) {
            System.out.println(solution.lengthOfLongestSubstring(s1[i]));
        }
    }

}
