package leetcode140;

import java.util.Arrays;

public class Solution14002 {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] cnt = new int[26];
        for (int i = 0; i < licensePlate.length(); ++i) {
            char ch = licensePlate.charAt(i);
            if (Character.isLetter(ch)) {
                ++cnt[Character.toLowerCase(ch) - 'a'];
            }
        }
        int idx = -1;
        for (int i = 0; i < words.length; ++i) {
            int[] c = new int[26];
            for (int j = 0; j < words[i].length(); ++j) {
                char ch = words[i].charAt(j);
                ++c[ch - 'a'];
            }
            boolean ok = true;
            for (int j = 0; j < 26; ++j) {
                if (c[j] < cnt[j]) {
                    ok = false;
                    break;
                }
            }
            if (ok && (idx < 0 || words[i].length() < words[idx].length())) {
                idx = i;
            }
        }
        return words[idx];
    }

    public static void main(String[] args) {
        Solution14002 solution = new Solution14002();
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
