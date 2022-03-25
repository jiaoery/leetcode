package leetcode165;

import java.util.Arrays;

/**
 * ClassName: Solution16501<br/>
 * Description: TODO Description. <br/>
 * date: 2022/3/25 14:07<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution16501 {
    public int findContentChildren(int[] g, int[] s) {
        int satified =0;
        Arrays.sort(g);
        Arrays.sort(s);
        int indexG = 0;
        int indexS = 0;
        while(indexS<s.length&&indexG<g.length){
            //可以满足孩子
            if(s[indexS]>=g[indexG]){
                satified++;
                indexS++;
                indexG++;
            }else{
                indexS++;
            }
        }
        return satified;
    }
}
