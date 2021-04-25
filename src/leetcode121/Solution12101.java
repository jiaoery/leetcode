package leetcode121;

/**
 * ClassName: Solution12101<br/>
 * Description: TODO Description. <br/>
 * date: 2021/4/25 14:02<br/>
 *
 * @author YCKJ1729
 * @version V1.0.0
 * @since JDK 1.8
 */
public class Solution12101 {

    public int[] constructRectangle(int area) {
        //取平方值
        int sqrt  = (int) Math.sqrt(area);
        while (sqrt>0){
            if(area%sqrt==0){
                break;
            }
            sqrt--;
        }
        return new int[]{area/sqrt,sqrt};
    }
}
