package leetcode140;

import java.util.Arrays;
import java.util.HashMap;

public class Solution14001 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        HashMap<Character,Integer> pairs = new HashMap<>();
        int count = 0;
        //summary
        for (int i = 0; i < licensePlate.length() ; i++) {
            char ch = licensePlate.toLowerCase().charAt(i);
            if (Character.isLowerCase(ch)){
                pairs.put(ch,pairs.getOrDefault(ch,0)+1);
                count++;
            }
        }

        int index = -1;
        for (int i = 0;i<words.length;i++) {
            int sum = 0;
            HashMap<Character,Integer> pair1 = (HashMap<Character, Integer>) pairs.clone();
            for (int j = 0; j < words[i].length(); j++) {
                char ch = words[i].toLowerCase().charAt(j);
                if(pair1.getOrDefault(ch,0)!=0){
                    sum++;
                    pair1.put(ch,pair1.getOrDefault(ch,0)-1);
                }
            }
            if(sum==count && (index<0||words[index].length()>words[i].length())){
                index = i;
            }
        }

        return words[index];
    }

    public static void main(String[] args) {
        Solution14001 solution = new Solution14001();
        String licensePlate1 = "1s3 PSt";
        String[] words1 = {"step", "steps", "stripe", "stepple"};

        System.out.println("licensePlate:"+licensePlate1+";words:"
                + Arrays.toString(words1)+";result:"+solution.shortestCompletingWord(licensePlate1,words1));

        String licensePlate2 = "Ah71752";
        String[] words2 = {"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};

        System.out.println("licensePlate:"+licensePlate2+";words:"
                + Arrays.toString(words2)+";result:"+solution.shortestCompletingWord(licensePlate2,words2));

        String licensePlate3 = "1s3 456";
         String[] words3 = {"looks","pest","stew","show"};
        System.out.println("licensePlate:"+licensePlate3+";words:"
                + Arrays.toString(words3)+";result:"+solution.shortestCompletingWord(licensePlate3,words3));

        String licensePlate4 ="AN87005";
        String[] words4 = {"participant","individual","start","exist","above","already","easy","attack","player","important"};
        System.out.println("licensePlate:"+licensePlate4+";words:"
                + Arrays.toString(words4)+";result:"+solution.shortestCompletingWord(licensePlate4,words4));
    }
}
